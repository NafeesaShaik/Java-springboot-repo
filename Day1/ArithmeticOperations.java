import java.util.Scanner;

public class ArithmeticOperations {

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        // Enter two numbers
        System.out.print("Enter the first number: ");
        Integer num1 = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        Integer num2 = scanner.nextInt();
        
        // Perform arithmetic operations
        Integer add = num1 + num2;
        Integer sub = num1 - num2;
        Integer mul = num1 * num2;
        Integer divide = 0;
        
        // Checking if num2 is not zero before division
        if (num2 != 0) {
            divide = num1 / num2;
        } else {
            System.out.println("Cannot divide by zero.");
        }
        System.out.println("Addition: " + add);
        System.out.println("Subtraction: " + sub);
        System.out.println("Multiplication: " + mul);
        
        // Display quotient only if division is possible
        if (num2 != 0) {
            System.out.println("Division: " + divide);
        }
        
        // Close scanner
        scanner.close();
    }
}
