public class RandomNumber {
    public static void main(String[] args){
        int n = rollDie();
        System.out.printf("주사위의 눈: ", n);
    }

    public static int rollDie(){
        double x = 6 * Math.random();
        int tmp = (int)x;
        return tmp + 1;
    }
}
