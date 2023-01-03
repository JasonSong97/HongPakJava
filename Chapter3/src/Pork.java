public class Pork {
    public static void main(String[] args){
        int n = 3;
        double x = calculate(n);

        System.out.printf("삽격살 %d인분의 칼로리: %.2f kcal", n, x);
    }
    public static double calculate(int amount){
        int totalGram = amount * 180;
        double totalKcal = totalGram * 5.179;
        return totalKcal;
    }
}
