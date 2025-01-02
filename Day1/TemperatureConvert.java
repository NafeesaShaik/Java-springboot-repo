import java.util.Scanner;

public class TemperatureConvert {
    public static double celciusToFarienheit(double c) 
    { 
        return (c * 9 / 5 ) + 32;
    }
    
    public static double farienheitToCelcius(double f) 
    { 
        return (f - 32 ) * 5 / 9;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Temperature Converter");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();

        if(choice==1){
        System.out.println("Enter the celcius temperature:");
        double c = scanner.nextDouble();
        double f = celciusToFarienheit(c);
        System.out.printf("%.2f°C is equal to %.2f°F\n", c, f);
        }
        else if(choice==2){
            System.out.print("Enter temperature in Fahrenheit: ");
            double f = scanner.nextDouble();
            double c = farienheitToCelcius(f);
            System.out.printf("%.2f°F is equal to %.2f°C\n", f, c);

        }
        else{
            System.out.println("Invalid choice");
        }
        scanner.close();
    }
}
