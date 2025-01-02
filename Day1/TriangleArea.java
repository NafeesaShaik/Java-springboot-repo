import java.util.*;
public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base value of triangle: ");
        double b = scanner.nextDouble();
        //int b=10;
        System.out.print("Enter the height of triangle: ");
        double h = scanner.nextInt();
        //int h=20;
        double  area = (b * h) / 2;
        System.out.println("Area of a triangle:"+ area);

        scanner.close();
    }
}
