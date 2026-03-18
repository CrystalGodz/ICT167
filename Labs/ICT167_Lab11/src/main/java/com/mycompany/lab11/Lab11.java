package com.mycompany.lab11;

public class Lab11 {

    public static void main(String[] args) {
        System.out.println(sum(1));
        System.out.println(sum(2));
        System.out.println(sum(3));
        System.out.println(factorial(1));
        System.out.println(factorial(2));
        System.out.println(factorial(3));
        System.out.println(factorial(4));
        
        System.out.println(reverse("123"));
        System.out.println(reverse("abc"));
        
        System.out.println(countA("123xyz"));
        System.out.println(countA("1A2xaz"));
    }
    
    //using recursion method to count how many A's is in the string
    public static int countA(String s){
        if (s.length() == 0){
            return 0;
        }
        else{
            char firstChar = s.charAt(0);
            String theRest = s.substring(1);
            if (firstChar == 'A' || firstChar == 'a'){
                return 1 + countA(theRest);
            }
            else{
                return 0 + countA(theRest);
            }
        }
    }
    
    //reverse a string with recursive method
    public static String reverse(String s){
        if (s.length() == 0){
            return "";
        }
        else{
            char firstChar = s.charAt(0);
            String theRest = s.substring(1);
            return reverse(theRest)+(firstChar);
        }
    }
    
    //recursion n*(n-1)
    public static int factorial(int n){
        if (n == 1){
            return 1;
        }
        else{
            return(n*factorial(n-1));
        }
    }
    
    //recursion sum
    public static int sum(int n){
        if(n == 1){
            return 1;
        }
        else{
            return (n+sum(n-1));
        }
    }
}
