public class ConstructorWithInheritance {
    public static void main(String[] args){
        new BBB();
    }
}
class AAA{
    AAA(){
        System.out.println("AAA() 생성자 호출 완료");
    }
}
class BBB extends AAA{
    BBB(){
        super();
        System.out.println("BBB() 생성자 호출 완료");
    }
}
