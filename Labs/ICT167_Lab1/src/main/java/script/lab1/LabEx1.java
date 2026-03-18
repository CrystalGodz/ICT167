package script.lab1;
import java.util.Scanner;

public class LabEx1 {
    public static void dispWholeNumber(String mesg, double n){
        // Either add or minus 0.5
        if (n < 0){
            n = n - 0.5;
        } else {
            n = n + 0.5;
        }
        int wholeNumber = (int)n;  // Casting
        System.out.println(mesg + wholeNumber);
    }
    // 1.5 + 0.5 --> 2.0 --> 2
    // 1.6 + 0.5 --> 2.1 --> 2
    // 1.4 + 0.5 --> 1.9 --> 1
    // -1.5 - 0.5 --> -2.0 --> 2
    public static void main(String[] argv){
        Scanner input = new Scanner(System.in);
        double total = 0;
        // A loop to allow user to enter value
        // repeatedly
        boolean continueLoop = true;
        while (continueLoop){
            // Prompt user
            System.out.println("Enter a number");
            double userInput = input.nextDouble();
            if (userInput < -100 || userInput > 100){
                break;  // Exit the loop
            }
            // Add up the number
            total = total + userInput;
            dispWholeNumber("You enter ", userInput);
            dispWholeNumber("Total is ", total);
        }
        System.out.println("Hello Java");
    }
}
