public class Grade {
    public static void main(String[] args){
        printGrade(96);
        printGrade(54);
        printGrade(27);

    }
    public static void printGrade(int score){
        String grade = "";

        if(score >= 90){
            grade = "A";
        }else if (score>=80){
            grade = "B";
        }else{
            grade = "F";
        }
        System.out.printf("%dė ė íė  : %s\n", score, grade);
    }
}
