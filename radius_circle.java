import java.util.Scanner;

public class radius_circle {
    public static void main(String[] args) {
        double radius;
        double area;
        Scanner rd = new Scanner(System.in);

        System.out.print("Enter the radius of a cirle :");
        radius = rd.nextDouble();
        System.out.println();
        System.out.println("Radius of a circle : " + radius);
        area = (3.14)*(radius*radius);
        System.out.println("Area of a circle :" + area);
    }
    
}
