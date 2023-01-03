public class AvengerTest {
    public static void main(String[] args){
        Avenger thor = new Avenger("토르", 150);
        Avenger thanos = new Avenger("타노스", 160);
        thor.punch(thanos);
    }
}
class Avenger{
    String name;
    int hp;

    Avenger(String n, int h){
        name = n;
        hp = h;
    }
    void punch(Avenger enemy){
        System.out.printf("[%s]의 펀치!", name);
        enemy.hp -= 10;
        System.out.printf("-> [%s]의 체력: %d\n", enemy.name, enemy.hp);
    }
}
