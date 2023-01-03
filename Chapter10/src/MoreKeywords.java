
//this 또 다른 생성자 호출하기
/*public class MoreKeywords {
    public static void main(String[] args){
        Item item1 = new Item("마법사의 지팡이", 1000);
        Item item2 = new Item();
        System.out.printf("[%s](%d gold)생성완료\n", item1.name, item1.price);
        System.out.printf("[%s](%d gold)생성완료\n", item2.name, item2.price);
    }
}
class Item{
    String name;
    int price;
    public Item(String name, int price){
        this.name = name;
        this.price = price;
    }
    public Item(){
        this("이름없음", -1);
    }
}*/

// super 키워드의 활용
/*public class MoreKeywords{
    public static void main(String[] args){
        Weapon w1 = new Weapon("장검", 1200, 10);
        Weapon w2 = new Weapon();
        w1.printInfo();
        w2.printInfo();
    }
}
abstract class Item{
    String name;
    int price;
    Item(String name, int price){
        this.name = name;
        this.price = price;
    }
    Item(){
        this.name = "이름 없음";
        this.price = -1;
    }
}
class Weapon extends Item{
    int power;
    Weapon(String name, int price, int power){
        super(name, price);
        this.power = power;
    }
    Weapon(){
        super();
        this.power = -1;
    }
    void printInfo(){
        System.out.printf("[%s] 가격: %d, 골드: %d, 공격력: %d\n", super.name, super.price, this.power);
    }
}*/

// 상속과 private
/*public class MoreKeywords{
    public static void main(String[] args){
        Weapon w1 = new Weapon("장검", 1200, 10);
        Weapon w2 = new Weapon();
        w1.printInfo();
        w2.printInfo();
    }
}
abstract class Item{
    private String name;
    private int price;
    public Item(String name, int price){
        this.name = name;
        this.price = price;
    }
    public Item(){
        this.name = "이름 없음";
        this.price = -1;
    }
    public String getName(){return name;}
    public int getPrice(){return price;}
}
class Weapon extends Item{
    private int power;
    public Weapon(String name, int price, int power){
        super(name, price);
        this.power = power;
    }
    Weapon(){
        super();
        this.power = -1;
    }
    void printInfo(){
        System.out.printf("[%s] 가격: %d, 골드: %d, 공격력: %d\n", super.getName(), super.getPrice(), this.power);
    }
}*/

// 상속과 protected
public class MoreKeywords{
    public static void main(String[] args){
        Weapon w1 = new Weapon("장검", 1200, 10);
        Weapon w2 = new Weapon();
        w1.printInfo();
        w2.printInfo();
    }
}
abstract class Item{
    protected String name;
    protected int price;
    public Item(String name, int price){
        this.name = name;
        this.price = price;
    }
    Item(){this("이름없음", -1);}
}
class Weapon extends Item{
    protected int power;
    public Weapon(String name, int price, int power){
        super(name, price);
        this.power = power;
    }
    Weapon(){this("이름없음", -1, -1);}
    void printInfo(){
        System.out.printf("[%s] 가격: %d, 골드: %d, 공격력: %d\n", super.name, super.price, this.power);
    }
}