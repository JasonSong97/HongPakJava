public class Trafficight {
    public static void main(String[] args){
        light("Red");
        light("Yellow");
        light("Green");
        light("Blue");
    }
    public static void light(String color){
        switch (color){
            case "Red":
                System.out.println("Red");
                break;
            case "Yellow":
                System.out.println("Yellow");
                break;
            case "Green":
                System.out.println("Green");
                break;
            case "Blue":
                System.out.println("Blue");
                break;
            default:
                System.out.printf("에러 잘못된 색 입력: %s\n", color);
        }
    }
}
