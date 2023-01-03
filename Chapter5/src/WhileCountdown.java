public class WhileCountdown {
    public static void main(String[] args){
        countdown(5);
    }
    public static void countdown(int num){
        System.out.println("카운트다운 시작");

        while(num>=0){
            System.out.printf("%d..\n", num);
            num--;
        }
    }
}
