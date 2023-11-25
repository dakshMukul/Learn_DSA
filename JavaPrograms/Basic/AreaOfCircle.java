package JavaPrograms.Basic;

public class AreaOfCircle {

    public static float area(int radius){
        float pi = 3.14F;
        return pi * radius * radius;
    }

    public static void main(String[] args) {
         float result = area(4);

        System.out.println(result);
    }
}
