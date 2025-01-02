import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle:");
        double r = scanner.nextDouble();
        double pi = 3.14159;
        double Circumference = 2 * pi * r;
        double area = pi * r * r;
        System.out.println("Circumference of a circle :" + Circumference);
        System.out.println("Area of a circle :" + area);
        scanner.close();
    }
}
