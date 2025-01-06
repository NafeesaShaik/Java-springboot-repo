import java.util.*;

public class PasswordValidation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("enter the password");
        String password = s.nextLine();

        if(password.length() >= 8 && password.matches(".*[a-zA-Z].*") && password.matches(".*\\d.*"))
        {
            System.out.println("Password is valid");
        }
        else {
            System.out.println("invalid password");
        }
        s.close();
    }
}
