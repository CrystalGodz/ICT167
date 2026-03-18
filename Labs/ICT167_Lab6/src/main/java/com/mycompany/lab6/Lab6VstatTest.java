package com.mycompany.lab6;

public class Lab6VstatTest {
    public static void main(String[] argv){
        Lab6Vstat[] stat = new Lab6Vstat[5];
        getSampleData(stat);
        
        for (int i = 0; i < stat.length; i++){
            System.out.println(stat[i]);
        }        
        //Bubble sort in decendending order
        for (int round = 0; round < stat.length - 1; round++){
            for (int curr = 0; curr < stat.length - 1; curr++){
                Lab6Vstat currStat = stat[curr];
                Lab6Vstat nextStat = stat[curr + 1];
                if (currStat.getWeeklyTotal() < nextStat.getWeeklyTotal()){
                    stat[curr] = nextStat;
                    stat[curr + 1] = currStat;
                }
            }
        }
        for (int i = 0; i < stat.length; i++){
            System.out.println(stat[i]);
        }
    }
    
    public static void getSampleData(Lab6Vstat[] data){
        // Hard code a fe instances to fill array
        data[0] = new Lab6Vstat("C1",new int[]{50, 70, 40, 20, 30, 60, 10});
        data[1] = new Lab6Vstat("C2",new int[]{51, 71, 41, 21, 31, 61, 11});
        data[2] = new Lab6Vstat("C3",new int[]{52, 72, 42, 22, 32, 62, 12});
        data[3] = new Lab6Vstat("C4",new int[]{53, 73, 43, 23, 33, 63, 13});
        data[4] = new Lab6Vstat("C5",new int[]{54, 74, 44, 24, 34, 64, 14});
    }
}
