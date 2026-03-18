package com.mycompany.lab7;
import java.util.Scanner;
import java.io.*;


public class Lab7 {
    public static void main(String[] args) {
        String inFileName = "Lab7data.txt";
        String outFileName = "Lab7output.txt";
        Scanner reader = null;
        PrintWriter writer = null;
        
        try{
            reader = new Scanner(new File(inFileName));
            writer = new PrintWriter(outFileName);
            int lineNo = 1;
            while (reader.hasNext()){
                String oneLine = reader.nextLine();
                System.out.println(lineNo + " " + oneLine);
                writer.println(lineNo + " " + oneLine);
                lineNo++;
            }
        }
        catch (FileNotFoundException err){
            System.out.println(err);
        }
        finally{
            if (reader != null){
                reader.close();
            }
            if (writer != null){
                writer.close();
            }
        }
        System.out.println("End of Main .....");
    }
}
