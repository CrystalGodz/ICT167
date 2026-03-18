package com.mycompany.lab7;

public class Score {
    private String name;
    private int mark;
    public Score(String name, int mark){
        this.name = name;
        this.mark = mark;
    }
    public String getName(){
        return name;
    }
    public double getMark(){
        return mark;
    }
    public String toString(){
        return name + " " + mark;
    }
}

