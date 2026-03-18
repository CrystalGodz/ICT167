package com.mycompany.lab8;

public class Lab8Patient extends Lab8Baby {
    private int Id;
    
    public Lab8Patient(String pName, int pAge, int pId){
        super(pName, pAge);
        Id = pId;
    }
    
    public int getId(){
        return Id;
    }
    
    public boolean equals(Lab8Patient anotherPatient){
        return Id == anotherPatient.Id;
    }
    
    public String babySound(){
        return "Baby sound is sick";
    }
    
    public String toString(){
        return Id + " " + getName()+ " " + getAge();
    }
}


