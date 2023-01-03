public class CarTest {
    public static void main(String[] args){
        Truck t = new Truck("봉고", 1.5);
    }
}
class Car{
    String name;
    Car(String _name){
        name = _name;
        System.out.printf("모델명: %s\n", name);
    }
    void move(){
        System.out.printf("[%s]가 이동합니다.\n", name);
    }
}
class Truck extends Car{
    double payload;
    Truck(String _name, double _payload){
        super(_name);
        payload = _payload;
        System.out.printf("적재량: %.1f 톤\n", payload);
    }
    void load(){
        System.out.printf("[%s]가 물건을 적재합니다. (최대 %.1f 톤)", name, payload);
    }
}
