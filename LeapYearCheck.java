import java.util.Scanner;

public class LeapYearCheck {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = s.nextInt();
        Boolean leapYear = (year % 400 == 0 ) || (year % 4 == 0 && year % 100 != 0);

        if(leapYear)
        {
            System.out.println(year + "Is a leap year");
        }
        else{
            System.out.println(year + "Is not a leap year");
        }
        s.close();

    }
}
