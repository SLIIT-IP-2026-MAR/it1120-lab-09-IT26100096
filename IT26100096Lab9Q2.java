import java.util.Scanner;

public class IT26100096Lab9Q2 {

    public static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Radius: ");
        double radius = sc.nextDouble();

        double area = circleArea(radius);

        System.out.println("Area = " + area);

        sc.close();
    }
}