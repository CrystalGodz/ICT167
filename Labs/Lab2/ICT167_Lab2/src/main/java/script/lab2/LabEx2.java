package script.lab2;
import java.util.Scanner;

public class LabEx2 {
    public static void printInfo(){
        System.out.println("Tutor's Name: ");
        System.out.println("My Name: Clarence");
    }
    public static void printLargestSmallest(){
        Scanner kBoard = new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        double num1 = kBoard.nextDouble();
        double num2 = kBoard.nextDouble();
        double num3 = kBoard.nextDouble();
        
        if (num1 > num2 && num1 > num3){
            System.out.println("Largest = " + num1);
        }
        else if (num2 > num3){
            System.out.println("Largest = " + num2);
        }
        else {
            System.out.println("Largest = " + num3);
        }
        
        
        if (num1 < num2 && num1 < num3){
            System.out.println("Smallest = " + num1);
        }
        else if (num2 < num3){
            System.out.println("Smallest = " + num2);
        }
        else {
            System.out.println("Smallest = " + num3);
        }
    }
    public static void printFivePerRow(){
        Scanner kBoard = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int startNum = kBoard.nextInt();
        int endNum = kBoard.nextInt();
        int printCount = 0;
        
        for (int i = startNum; i < endNum; i++){
             System.out.print(i + " ");
             printCount++;
             if (printCount ==5){
                 System.out.println();
                 printCount = 0;
             }
        }
        System.out.println();
    }
    public static void checkPrimeNumber(){
        Scanner kBoard = new Scanner(System.in);
        System.out.println("Enter an Integer: ");
        int num = kBoard.nextInt();
        boolean isPrime = true;
        
        for (int div = num - 1; div >= 2; div--){
            if (num % div == 0){
                isPrime = false;
                break;  
            }
        }
        if (isPrime){
            System.out.println(num + " is a prime number");
        }
        else {
            System.out.println(num + " is not a prime number");
        }
        System.out.println();
    }
    public static void main(String[] argv){
        Scanner kBoard = new Scanner(System.in);
        while (true){
            System.out.println("Enter an option from a, b, c, d & e: ");
            String userInput = kBoard.nextLine();
            char option = userInput.charAt(0);
            if (option == 'q'){
                break;
            }
            else if(option == 'a'){
                printInfo();
            }
            else if(option == 'b'){
                printLargestSmallest();
            }
            else if(option == 'c'){
                printFivePerRow();
            }
            else if(option == 'd'){
                checkPrimeNumber();
                // needs ammendment
            }
            else if(option == 'e'){
                checkPrimeNumber();
            }
            else {
                System.out.println(option);
            }
        }
        System.out.println("End of programme.");
    }
}
