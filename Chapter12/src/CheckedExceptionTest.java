public class CheckedExceptionTest {
    public static void main(String[] args) throws InterruptedException{
        for(int i = 0; i < 5; i++){
            System.out.printf("%d ", i);
            Thread.sleep(1000);
        }
    }
}
