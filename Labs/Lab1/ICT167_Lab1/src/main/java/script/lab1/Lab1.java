
package script.lab1;
import java.util.Scanner;

public class Lab1 {
            public static void main(String[] args) {
                        Scanner kBoard = new Scanner (System.in);
                        String inputStr;
                        // Example of while loop
                        while (true){
                                System.out.println("Enter something: ");
                                inputStr = kBoard.nextLine();
                                if (inputStr.length() == 0){
                                        break; //Stop the loop
                                }
                                System.out.println(inputStr);
                                // Some commonly used methods of the String class
                                System.out.println(inputStr.length());
                                System.out.println(inputStr.toUpperCase());
                                System.out.println(inputStr.charAt(0));
                                // Using for loop to print character by character
                                for (int idx = 0; idx < inputStr.length(); idx++){
                                        System.out.print(inputStr.charAt(idx) + " ");
                                }
                                System.out.println();
                                // Count number of 'A' or 'a'
                                int chCount = 0;
                                for (int idx = 0; idx < inputStr.length(); idx++){
                                        System.out.print(inputStr.charAt(idx) + " ");
                                        if (inputStr.charAt(idx) == 'a' ||
                                            inputStr.charAt(idx) == 'A');{
                                                chCount++;
                                        {
                                }
                                System.out.println("Number of a/A: " + chCount);
                        }
                        System.out.println("Testing");
            }
        }
    }
}