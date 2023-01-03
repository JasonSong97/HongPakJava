import java.util.Scanner;

public class ExceptionEx3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.printf("10을 x로 나누려 한다.\nx의 값을 입력: ");
            String inputStr = scanner.next();
            int inputNum = Integer.parseInt(inputStr);

            int result = 10/inputNum;
            System.out.printf("10나누기 %d => %d\n", inputNum, result);
        }catch (NumberFormatException ex){
            System.out.println("정수 변환에 실패하였습니다.");
        }catch (ArithmeticException e){
            System.out.println("0으로 나눌 수 없습니다.");
        }
        System.out.println("프로그램이 종료됩니다.");
    }
}
