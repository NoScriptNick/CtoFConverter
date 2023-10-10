import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //variables
        double tempC;
        boolean done = false;
        String continueYN;
        double tempF;

        //Loop for user entering temps
        do {
            System.out.println("Would you like to continue? Enter [Y/N] to stop: "); //prompt for ending the loop
            continueYN = scan.nextLine();
            if (continueYN.equals("N")) { //Answering N ends the loop
                done = true;
            } else if (continueYN.equals("Y")) { //Asks user for temp if YN prompt = Y
                System.out.println("Enter a temperature in celsius: ");
                if (scan.hasNextDouble()) { //if temp is valid, proceed with calculating and outputting tempF
                    tempC = scan.nextDouble();
                    tempF = (tempC*9)/5 + 32;
                    System.out.printf("%-11s %.2f", "Degrees C:", tempC);
                    System.out.printf("\n%-11s %.2f", "Degrees F:", tempF);
                    scan.nextLine();
                    System.out.println("");

                } else { //if temp is not a double
                    System.out.println("Invalid Temp");
                    scan.nextLine();
                }
            } else { //invalid response to YN, neither Y nor N
                System.out.println("Invalid response");
            }
        } while (!done); //ends loop
    }
} 
