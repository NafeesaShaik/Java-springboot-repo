import java.util.Scanner;

public class remainder {
 public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        Integer a = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        Integer b = scanner.nextInt();

        Integer modulus = a % b;

        System.out.println("Remainder: " + modulus);
        scanner.close();    
 }   
}
