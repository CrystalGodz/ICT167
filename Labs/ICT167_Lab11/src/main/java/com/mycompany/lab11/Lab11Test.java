package com.mycompany.lab11;
import java.util.*;
import java.io.*;

public class Lab11Test {
    public static void main(String[] argv){
        ArrayList<L11Trainee> trainees = new ArrayList<>();
        getTrainee(trainees);
        getResult(trainees);
        for(L11Trainee t : trainees){
            System.out.println(t + " " + t.getResult());
        }
    }
    
    public static void getResult(ArrayList<L11Trainee> trainees){
        File dataFile = new File("Lab11Data.txt");
        try(Scanner reader = new Scanner (dataFile)){
            while(reader.hasNext()){
                String oneLine = reader.nextLine();
                String[] values = oneLine.split(",");
                for(L11Trainee t : trainees){
                    if(t.getId().equalsIgnoreCase(values[0])){
                        t.setScores(Integer.parseInt(values[1]),
                                   Integer.parseInt(values[2]),
                                   Integer.parseInt(values[3]));
                    }
                }
            }
        }
        catch(IOException err){
            System.out.println(err);
        }
    }
    
    public static void getTrainee(ArrayList<L11Trainee> trainees){
        trainees.add(new L11Trainee("T1", "James"));
        trainees.add(new L11Trainee("T2", "Tom"));
        trainees.add(new L11Trainee("T3", "Simon"));
        trainees.add(new L11Trainee("T4", "Timothy"));
        trainees.add(new L11Trainee("T5", "Josh"));
        trainees.add(new L11Trainee("T8", "Samuel"));
    }
}
