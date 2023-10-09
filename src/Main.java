import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //variables
        double tempC;
        boolean done = false;

        //User enters a temp in celsius
        do {
            System.out.println("Enter a temperature in celsius: ");
            if (scan.hasNextDouble()) {
                tempC = scan.nextDouble();

            } else { //if temp is not a double
                System.out.println("Invalid Temp");
            }
        } while (!done); //ends loop
    }
}