public class OverridingTest {
    public static void main(String[] args){
        Archer a = new Archer();
        Archer ma = (Archer) new MasterArcher();
        a.shoot();
        ma.shoot();
    }
}
class Archer{
    void shoot(){
        System.out.println("[아처]의 활 공격이 10만큼의 피해를 주었습니다.");
    }
}
class MasterArcher extends Archer{
    void shoot(){
        System.out.println("[마스터 아처]의 활 공격이 20만큼의 피해를 주었습니다.");
    }
}
