package com.mycompany.lab9;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Lab9 {
    public static void main (String[] argv){
//        example1();
        example2();
    }
    
    public static void example1(){
        Scanner keyboard = new Scanner(System.in);
        
        try{
            System.out.println("Array Size?");
            int sampleSize = keyboard.nextInt();
            int[] sample = new int[sampleSize];
            sample[10] = 100;
            System.out.println("Enter a number: ");
            int divisor = keyboard.nextInt();
            System.out.println(sample[10]/divisor);
            System.out.println("End of try block");
        }
        catch(ArithmeticException | ArrayIndexOutOfBoundsException 
                | NegativeArraySizeException err){
            System.out.println(err);
        }
        System.out.println("End of Example");
    }
    
    public static void example2(){
        Scanner keyboard = new Scanner(System.in);
        int total = 0;
        int count = 0;
        boolean test = true;
        
        while(test){
            try{
                System.out.println("Enter a number: ");
                int num = keyboard.nextInt();
                if(num < 0){
                    break;
                }
                total += num;
                count++;
            }
            catch(InputMismatchException err){
                System.out.println("Please input a numeric value only!");
                keyboard.nextLine();
            }
        }
        if(count > 0){
            System.out.println("Total is = " + total);
            System.out.println("Average is = " + total/count);
        }
    }
}
