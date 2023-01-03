public class StaticMethodInterface {
    public static void main(String[] args){
        System.out.printf("3 더하기 7은 %d입니다.", Calculator.plus(3, 7));
        System.out.printf("4 뺴기 6은 %d입니다.", Calculator.minus(4, 6));
    }
}
interface Calculator{
    static int plus(int a , int b){
        return a+b;
    }
    static int minus(int a, int b){
        return a-b;
    }
}