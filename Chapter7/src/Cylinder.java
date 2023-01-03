public class Cylinder {
    int radius;
    int height;

    double getVolume(){
        return radius * radius * Math.PI * height;
    }

    double getSurfaceArea(){
        double circleArea = Math.PI * radius * radius;
        double rectangleArea = height * 2 * Math.PI * radius;
        return 2 * circleArea * rectangleArea;
    }
    public static void main(String[] args){
        Cylinder c = new Cylinder();
        c.radius = 4;
        c.height = 5;
        System.out.printf("");
    }
}
