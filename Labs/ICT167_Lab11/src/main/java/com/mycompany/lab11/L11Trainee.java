package com.mycompany.lab11;

public class L11Trainee {
    private String id;
    private String name;
    private L11TestResult result;
    public L11Trainee(String id, String name){
        this.id = id;
        this.name = name;
        result = new L11TestResult();
    }
    
    public String getId(){
        return id;
    }
    
    public void setScores(int situp, int pullup, int running){
        result.setScores(situp, pullup, running);
    }
    
    public String getResult(){
        return result.getResult();
    }
    
    public String toString(){
        return id + " " + name;
    }
}
