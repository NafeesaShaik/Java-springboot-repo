import java.util.Scanner;

public class simpleIntrest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the Principle Amount: ");
        Integer P = scanner.nextInt();
        
        System.out.print("Enter the Intrest Rate: ");
        Integer R = scanner.nextInt();

        System.out.print("Enter the tenure time: ");
        Integer T = scanner.nextInt();

        double SI = (P * R * T) / 100;
        System.out.print("Simple Interst:"+ SI);

        scanner.close();
    }
}
