package com.mycompany.lab11;

public class L11TestResult {
    private int situp;
    private int pullup;
    private int running;
    
    public L11TestResult(){}
    
    public L11TestResult(int situp, int pullup, int running){
        this.situp = situp;
        this.pullup = pullup;
        this.running = running;
    }
    public void setScores(int situp, int pullup, int running){
        this.situp = situp;
        this.pullup = pullup;
        this.running = running;
    }
    public String getResult(){
        if (situp < 5 || pullup < 5 || running < 5)
            return "Fail";
        else {
            int total = situp + pullup + running;
            if (total <= 20)
                return "Bronze";
            else if (total <= 26)
                return "Silver";
            else
                return "Gold";
        }
    }
}
