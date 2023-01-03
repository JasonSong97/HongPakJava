public class Copy {
    public static void main(String[] args){
        String origin = "abcd";
        
        String copy = origin;
        copy = copy + "efgh";
        System.out.println("copy = " + copy);
    }
}
