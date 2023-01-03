public class LeapYear {
    public static void main(String[] args){
        System.out.printf("2020년은 윤년입니까?", isLeapYear(2020));
        System.out.printf("1900년은 윤년입니까?", isLeapYear(1900));
        System.out.printf("2000년은 윤년입니까?", isLeapYear(2000));
    }
    public static boolean isLeapYear(int year){
        boolean result = false;
        if(year % 4 == 0){
            result = true;
            if(year % 100 == 0){
                result = true;
                if(year % 1000 == 0){
                    result = true;
                }
            }
        }
        return result;
    }
}
