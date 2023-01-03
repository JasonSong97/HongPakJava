/*public class BankAccountTest {
    public static void main(String[] args){
        BankAccount a = new BankAccount("빌 게이츠", "206-000001", 1000000);
        BankAccount b = new BankAccount("워렌 버핏", "206-000002", 1000000);
        System.out.println(a.toString());
        System.out.println(b.toString());
    }
}
class BankAccount{
    private final String username;
    private final String number;
    private int amount;

    public BankAccount(String username, String number, int amount){
        this.username = username;
        this.number = number;
        this.amount = amount;
    }
    public String toString(){
        return String.format("%s, %s, %d", this.username, this.number, this.amount);
    }

}
*/

// 문자열을 파일로 쓰기(출력)
/*import java.io.*;
public class BankAccountTest {
    public static void main(String[] args)throws IOException{
        BankAccount a = new BankAccount("빌 게이츠", "206-000001", 1000000);
        BankAccount b = new BankAccount("워렌 버핏", "206-000002", 1000000);
        File file = new File("accounts-data.txt");
        FileWriter fw = new FileWriter(file);
        fw.write(a.toString()+"\n");
        fw.write(b.toString()+"\n");
        fw.close();
    }
}
class BankAccount{
    private final String username;
    private final String number;
    private int amount;

    public BankAccount(String username, String number, int amount){
        this.username = username;
        this.number = number;
        this.amount = amount;
    }
    public String toString(){
        return String.format("%s, %s, %d", this.username, this.number, this.amount);
    }

}*/

// 파일로부터 데이터 읽기(입력)
import java.io.*;
public class BankAccountTest {
    public static void main(String[] args)throws IOException, InterruptedException{
        BankAccount a = new BankAccount("빌 게이츠", "206-000001", 1000000);
        BankAccount b = new BankAccount("워렌 버핏", "206-000002", 1000000);
        File file = new File("accounts-data.txt");
        FileReader fr = new FileReader(file);
        int ch;
        while((ch = fr.read()) != -1){
            System.out.print((char)ch);
            //Thread.sleep(200);
        }
        fr.close();

    }
}
class BankAccount{
    private final String username;
    private final String number;
    private int amount;

    public BankAccount(String username, String number, int amount){
        this.username = username;
        this.number = number;
        this.amount = amount;
    }
    public String toString(){
        return String.format("%s, %s, %d", this.username, this.number, this.amount);
    }

}