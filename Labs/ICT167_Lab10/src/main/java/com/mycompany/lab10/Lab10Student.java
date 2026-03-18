package com.mycompany.lab10;

public class Lab10Student {
    private String id;
    private String name;
    
    public Lab10Student(String id, String name){
        this.id = id;
        this.name = name;
    }
    
    public String getId(){
        return id;
    }
    
    public String getName(){
        return name;
    }
    
    public boolean equals(Lab10Student s){
        return id.equalsIgnoreCase(s.id);
    }
    
    public String toString(){
        String mesg = String.format("%s %s", id, name);
        return mesg;
    }
}
