public class Cat {
    // 인스턴스 변수
    String name;
    String breeds;
    double weight;

    // 인스턴스 메소드
    void claw(){
        System.out.println("claw");
    }
    void meow(){
        System.out.println("meow");
    }
    // 메인 메소드
    public static void main(String[] args){
        Cat c = new Cat();

        c.name = "네로";
        c.breeds = "페르시안";
        c.weight = 4.37;

        System.out.printf("이름: %s\n", c.name);
        System.out.printf("품종: %s\n", c.breeds);
        System.out.printf("체중: %.2fkg\n", c.weight);
    }
}
