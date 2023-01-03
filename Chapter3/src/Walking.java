public class Walking {
    public static void main(String[] args){
        int n = 5000;
        double x = calculate(5000);
        System.out.printf("%d번 걸었을 시의 소모 칼로리는 %.1f입니다.", n, x);
    }
    public static double calculate(int walkinCount){
        return 0.2 * walkinCount;
    }
}
