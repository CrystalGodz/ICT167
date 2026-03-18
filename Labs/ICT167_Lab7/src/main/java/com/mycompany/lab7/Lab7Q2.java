package com.mycompany.lab7;
import java.util.Scanner;
import java.io.*;

public class Lab7Q2 {
    public static void main(String[] argv){
        Score[] record = new Score[10];
        getScore(record);
        
        //Do something...
        for (int i = 0; i < record.length; i++){
            System.out.println(record[i]);
        }
        saveScore(record);
    }
    public static void getScore(Score[] record){
        Scanner reader = null;
        try{
            reader = new Scanner(new File("score.txt"));
            int idx = 0;
            while (reader.hasNext()){
                String oneLine = reader.nextLine();
                String[] data = oneLine.split(" ");
                Score temp = new Score(data[0], Integer.parseInt(data[1]));
                
                record[idx] = temp;
                idx++;
            }
        }
        catch (FileNotFoundException err){
            System.out.println(err);
        }
        finally{
            if (reader != null){
                reader.close();
            }
        }
    }
    public static void saveScore(Score[] record){
        PrintWriter writer = null;
        try{
            writer = new PrintWriter("output.csv");
            for (int i = 0; i < record.length; i++){
                String msg = record[i].getName() + "," + record[i].getMark();
                System.out.println(msg);
                writer.println(msg);
            }
        }
        catch (FileNotFoundException err){
            System.out.println(err);
        }
        finally{
            if (writer != null){
                writer.close();
            }
        }
    }
}

