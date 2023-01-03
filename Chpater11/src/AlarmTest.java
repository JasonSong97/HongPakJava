/*public class AlarmTest {
    public static void main(String[] args){
        Alarm a = new SmartPhone();
        a.beep();
        a.playMusic("상어송");
    }
}
interface Alarm{
    void playMusic(String title);
    void beep();
}
class SmartPhone implements Alarm{
    private String phoneNumber;
    public void playMusic(String title){
        System.out.printf("[%s]이 재생됩니다..\n", title);
    }
    public void beep(){
        System.out.println("[비프음]이 재생됩니다.");
    }
}*/

// 다양한 인터페이스 구현
/*public class AlarmTest{
    public static void main(String[] args){
        SmartPhone sp = new SmartPhone();
        sp.playMusic("상어송");
        sp.call("010-1234-5678");
        sp.sendMsg("010-5759-7911","자니??");
    }
}
interface Alarm{
    void playMusic(String title);
    void beep();
}
interface Phone{
    void call(String phoneNum);
    void receive();
}
interface Messenger{
    void sendMsg(String phoneNum, String msg);
    void receiveMsg();
}
class SmartPhone implements Alarm, Phone, Messenger{
    private String phoneNumber;
    public void playMusic(String title){
        System.out.printf("[%s]dl 재생됩니다.", title);
    }
    public void beep(){
        System.out.println("[비프음]이 재생됩니다.");
    }
    public void call(String phoneNum){
        System.out.printf("[%s]로 전화를 겁니다.", phoneNum);
    }
    public void receive(){
        System.out.println("전화르 받습니다.");
    }
    public void sendMsg(String phoneNum, String msg){
        System.out.printf("[%s]로 메세지 전송: %s\n", phoneNum, msg);
    }
    public void receiveMsg(){
        System.out.println("메시지가 도착했습니다.");
    }
}*/

// 다양한 인터페이스로 해석된 smartphone obj
public class AlarmTest{
    public static void main(String[] args){
        SmartPhone sp = new SmartPhone();
        Alarm alarm = sp;
        Phone phone = sp;
        Messenger mesenger = sp;

        alarm.playMusic("상어송");
        alarm.beep();

        phone.call("010-1234-5678");
        phone.receive();

        mesenger.sendMsg("010-5759-7911", "자니??");
        mesenger.receiveMsg();
    }
}
interface Alarm{
    void playMusic(String title);
    void beep();
}
interface Phone{
    void call(String phoneNum);
    void receive();
}
interface Messenger{
    void sendMsg(String phoneNum, String msg);
    void receiveMsg();
}
class SmartPhone implements Alarm, Phone, Messenger{
    private String phoneNumber;
    public void playMusic(String title){
        System.out.printf("[%s]dl 재생됩니다.", title);
    }
    public void beep(){
        System.out.println("[비프음]이 재생됩니다.");
    }
    public void call(String phoneNum){
        System.out.printf("[%s]로 전화를 겁니다.", phoneNum);
    }
    public void receive(){
        System.out.println("전화르 받습니다.");
    }
    public void sendMsg(String phoneNum, String msg){
        System.out.printf("[%s]로 메세지 전송: %s\n", phoneNum, msg);
    }
    public void receiveMsg(){
        System.out.println("메시지가 도착했습니다.");
    }
}