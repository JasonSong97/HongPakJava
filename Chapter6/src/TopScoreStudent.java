public class TopScoreStudent {
    public static void main(String[] args){
        String[] name = {"a", "b", "c", "d", "e", "f","g", "h", "i"};
        int[] scores = {65, 72, 32, 445,124, 5,4 ,12, 4};

        int i = topIndex(scores);
        System.out.printf("1등: %s(%d점)", name[i], scores[i]);
    }
    public static int topIndex(int[] arr){
        int topIdx = 0;

        for(int i =0; i < arr.length; i++){
            if(arr[topIdx] < arr[i]){
                topIdx = i;
            }
        }
        return topIdx;
    }
}
