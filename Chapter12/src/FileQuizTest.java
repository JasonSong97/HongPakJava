import java.io.*;
import java.util.*;

public class FileQuizTest {
    public static void main(String[] args) throws QuizException, IOException{
        QuizGame game = new QuizGame();
        game.loadQuizzes();
        game.play();
        game.writeLog();
    }
}
class QuizGame{
    private ArrayList<Quiz> quizzes = new ArrayList<Quiz>();
    private String result;
    public void loadQuizzes() throws IOException{
        File file = new File("quiz-input.txt");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line = null;

        while((line = br.readLine()) != null){
            String[] temp = line.split(",");
            Quiz q = new Quiz(temp[0], Integer.parseInt(temp[1]));
            quizzes.add(q);
        }
        br.close();
    }
    public void play() throws QuizException{
        int point = 0;
        for(int i = 0; i< quizzes.size(); i++){
            Quiz q = quizzes.get(i);
            point += q.play()?1:0;
        }
        result = String.format("[%s] 총 %d개의 퀴즈를 맞췄습니다.", new Date(), point);
        System.out.println(result);
    }
    public void writeLog() throws IOException{
        File file = new File("quiz-output.txt");
        FileWriter fw = new FileWriter(file, true);
        fw.write(result+"\n");
        fw.close();
    }
}
class Quiz{
    private String question;
    private int answer;
    private static final Scanner scanner = new Scanner(System.in);
    public Quiz(String question, int answer){
        this.question = question;
        this.answer = answer;
    }
    public boolean play() throws QuizException{
        System.out.println(this.question);
        System.out.print("정답을 입력하시오: ");
        String inputStr = scanner.next();
        int inputNum = Integer.parseInt(inputStr);
        if(!(inputNum == 1 || inputNum == 2)) {
            throw new QuizException("보기에 없는 값을 입력하였습니다.");
        }
        return (this.answer == inputNum)? true : false ;
    }
}
class QuizException extends Exception{
    public QuizException(String message){
        super(message);
    }
}