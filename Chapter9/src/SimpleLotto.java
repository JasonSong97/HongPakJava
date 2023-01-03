import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SimpleLotto {
    public static void main(String[] args){
        ArrayList<Integer> lottoMachine = new ArrayList<Integer>();
        for(int i = 1; i <= 45; i++){
            lottoMachine.add(i);
        }

        Collections.shuffle(lottoMachine);
        int[] lottoNumArr = new int[6];
        for(int i = 0; i < lottoNumArr.length; i++){
            lottoNumArr[i] = lottoMachine.remove(i);
        }

        String lottoNumStr = Arrays.toString(lottoNumArr);
        System.out.printf("자동 생성 로또 번호: %s", lottoNumStr);
    }
}
