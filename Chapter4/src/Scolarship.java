public class Scolarship {
    public static void main(String[] args){
        printScholarship("park", 100, 92);
        printScholarship("kim", 82, 96);
        printScholarship("choi", 82, 88);
    }
    public static void printScholarship(String name, int math, int eng){
        String result = "";

        if(math >= 90 && eng >= 90){
            result = "전액 장학금";
        } else if(math >= 90 || eng >= 90){
            result = "반약 장학금";
        } else{
            result = "다음 기회에";
        }
        System.out.printf("%s => %s\n", name, result);
    }
}
