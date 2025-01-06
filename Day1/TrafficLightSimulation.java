import java.util.Scanner;
public class TrafficLightSimulation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("select traffic light colour(Red, Yellow, Green) :");
        String colour = s.nextLine().toLowerCase();

        System.out.println("Is there a obstrucle(true or false):");
        Boolean IsObstrucle = s.nextBoolean();

        if(IsObstrucle)
        {
            System.out.println("There is a obstrucle to move forward");
        }
        else {
            switch (colour) {
                case "red":
                    System.out.println("colour is red 'STOP'");
                    break;
                case "yellow":
                    System.out.println("colour is Yellow 'SLOW DOWN'");
                    break;
                case "green":
                    System.out.println("colour is Green 'GO''");
                    break;
                default:
                System.out.println("Invalid Colour"+ colour);
                    break;
            }
        }
        s.close();


    }

    
}
