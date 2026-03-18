package com.mycompany.lab6;

public class Lab6Vstat {
    private String centreName;
    private int[] dailyTotal;
    
    public Lab6Vstat(String centreName){
        this.centreName = centreName;
        dailyTotal = new int[7];
    }
    
    public Lab6Vstat(String centreName, int[] data){
        this.centreName = centreName;
        dailyTotal = new int[7];
        for (int i = 0; i < dailyTotal.length; i++){
            dailyTotal[i] = data[i];
        }
    }
    
    public int getWeeklyTotal(){
        int total = 0;
        
        for (int i = 0; i < dailyTotal.length; i++){
            total += dailyTotal[i];
        }
        return total;
    }
    
    public String toString(){
        return "CName: " + centreName + " Total: " + getWeeklyTotal();
    }
}
