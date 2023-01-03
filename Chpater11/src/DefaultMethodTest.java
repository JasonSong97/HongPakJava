public class DefaultMethodTest {
    public static void main(String[] args){
        Vehicle b = new Bicycle();
        Vehicle t = new Train();

        b.horn();
        t.horn();
        b.move("명동", "신촌");
        t.move("서울", "부산");
    }
}

interface Vehicle{
    void horn();
    default void move(String from, String to){
        System.out.printf("%s에서 %s로 이동합니다.\n", from , to);
    }
}
class Bicycle implements Vehicle{
    public void horn() {
        System.out.println("따르릉");
    }
}
class Train implements Vehicle{
    public void horn() {
        System.out.println("뿌우우");
    }
    public void move(String from, String to){
        System.out.printf("기차가 %s에서 %s로 이동합니다.\n", from , to);
    }
}