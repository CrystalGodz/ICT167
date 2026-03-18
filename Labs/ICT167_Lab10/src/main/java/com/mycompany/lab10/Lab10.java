package com.mycompany.lab10;
import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;

public class Lab10 {

    public static void main(String[] args) {
        ArrayList<Lab10Student> student = new ArrayList<>();
        System.out.println(student.size());
        getStudent(student);
        
        //Verify Records
        for(int i = 0; i < student.size(); i++){
            System.out.println(student.get(i));
        }
        System.out.println();
        
        //Process all Lab10ExtStudent
        for(int i = 0; i < student.size(); i++){
            Lab10Student curr = student.get(i);
            if(curr instanceof Lab10ExtStudent){
                System.out.println(curr);
            }
        }
        System.out.println();
        
        //Print lab10ExtStudent of Group 1
        for(int i = 0; i < student.size(); i++){
            Lab10Student curr = student.get(i);
            if(curr instanceof Lab10ExtStudent){
                //Sets the instance to Lab10ExtStudent to 
                //  call methods from sub-class
                Lab10ExtStudent temp = (Lab10ExtStudent)curr;
                if(temp.getGroup().equalsIgnoreCase("Group 1")){
                    System.out.println(temp);
                }
            }
        }
    }
    
    public static void getStudent(ArrayList<Lab10Student> student){
        String fileName = "Lab10Data.txt";
        try(Scanner reader = new Scanner(new File(fileName))){
            while(reader.hasNext()){
                String oneLine = reader.nextLine();
                String[] values = oneLine.split(",");
                if(values.length == 2){
                    //create an instance of Lab10Student Array
                    Lab10Student temp = new Lab10Student(values[0],values[1]);
                    //add values into the instance of array
                    student.add(temp);
                }
                else{
                    Lab10ExtStudent temp = new Lab10ExtStudent(values[0],values[1],values[2]);
                    student.add(temp);
                }
            }
        }
        catch(FileNotFoundException err){
            System.out.println(err);
        }
    }
}
