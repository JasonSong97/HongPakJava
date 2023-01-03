public class CurrencyTest {
    public static void main(String[] args){
        KRW won = new KRW(1500.00);
        USD dollar = new USD(100.50);
        EUR euro = new EUR(260.75);
        Currency[] currencyArr = {won, dollar, euro};
        for(int i = 0; i  < currencyArr.length; i++){
            currencyArr[i].printInfo();
        }
    }
}
abstract class Currency{
    protected double amount;
    public Currency(double amount){
        this.amount = amount;
    }
    public void printInfo(){
        System.out.printf("해당 화폐는 %f만큼 있습니다.");
    }
}
class KRW extends Currency{
    public KRW(double amount){
        super(amount);
    }
    public void printInfo(){
        System.out.printf("KRW: %2.f 원\n", amount);
    }
}
class USD extends Currency{
    public USD(double amount){
        super(amount);
    }
    public void printInfo(){
        System.out.printf("USD: %2.f 달러\n", amount);
    }
}
class EUR extends Currency{
    public EUR(double amount){
        super(amount);
    }
    public void printInfo(){
        System.out.printf("EUR: %2.f 유로\n", amount);
    }
}