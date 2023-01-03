import java.util.Random;

public class DiceTest {
    public static void main(String[] args){
        Dice diceA = new Dice(6);
        Dice diceB = new Dice(6);

        int[] counts = new int[13];

        for(int n = 0; n < 100; n++ ){
            int a = diceA.roll();
            int b = diceB.roll();
            int sum = a + b;
            counts[sum]++;
        }

        for(int i = 2; i < counts.length; i++){
            System.out.printf("%2d: ", i);
            for(int c = 0; c < counts[i]; c++){
                System.out.printf("#");
            }
            System.out.println();
        }
    }
}
class Dice{
    private int sides;
    private static Random rand = new Random();

    public Dice(int _sides){
        sides = _sides;
    }
    public int roll(){
        return rand.nextInt(sides) + 1;
    }
}
