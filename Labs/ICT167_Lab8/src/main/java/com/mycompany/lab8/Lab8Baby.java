package com.mycompany.lab8;

public class Lab8Baby {
    private String name;
    private int age;
    
    public Lab8Baby(String babyName, int babyAge){
        name = babyName;
        age  = babyAge;
    }
    
    public String getName(){
        return name;
    }
    
    public int getAge(){
        return age;
    }
    
    public boolean equals(Lab8Baby anotherBaby){
        return (age == anotherBaby.age && 
                name.equalsIgnoreCase(anotherBaby.name));
    }
    
    public String babySound(){
        return "Baby sound is neutral";
    }
    
    public String toString(){
        return name + " " + age;
    }
}