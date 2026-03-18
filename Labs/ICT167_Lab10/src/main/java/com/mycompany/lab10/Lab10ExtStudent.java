package com.mycompany.lab10;

public class Lab10ExtStudent extends Lab10Student{
    private String groupId;
    
    public Lab10ExtStudent(String id, String name, String groupId){
        super(id, name);
        this.groupId = groupId;
    }
    
    public String getGroup(){
        return groupId;
    }
    
    public String toString(){
        String mesg = String.format("%s in %s",super.toString(), groupId);
        return mesg;
    }
}
