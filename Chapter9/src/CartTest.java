import java.util.ArrayList;

public class CartTest {
    public static void main(String[] args){
        Item shirt = new Item("스트라이프 셔츠", 49900);
        Item pants = new Item("슬림 면바지", 58900);
        Item sneaker = new Item("스니커즈", 46900);
        ArrayList<Item> cart = new ArrayList<Item>();

        cart.add(shirt);
        cart.add(pants);
        cart.add(sneaker);

        int sum = 0;

        for(int i = 0; i < cart.size(); i++){
            Item item = cart.get(i);
            System.out.println(item.toStr());
            sum += item.getPrice();
        }

        System.out.println("============================");
        System.out.printf("총합: %d원", sum);
    }
}
class Item{
    private String name;
    public int price;

    public Item(String n, int p){
        name = n;
        price = p;
    }
    public String toStr(){
        return String.format("Item{name: %s, price: %d}", name, price);
    }
    public int getPrice(){
        return price;
    }
}
