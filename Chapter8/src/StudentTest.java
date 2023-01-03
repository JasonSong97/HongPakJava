public class StudentTest {
    public static void main(String[] args){
        Student park = new Student(20191233, "park");
        Student kim = new Student(1231233, "kim");
        Student lee = new Student(2342133, "lee");
        System.out.printf("Student 객체의 수: %d", Student.count);
    }
}
class Student{
    static int count = 0;
    int id;
    String name;
    Student(int _id, String _name){
        Student.count++;
        id = _id;
        name = _name;
    }
}
