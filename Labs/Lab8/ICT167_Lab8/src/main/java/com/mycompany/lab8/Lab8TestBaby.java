package com.mycompany.lab8;

public class Lab8TestBaby {
    public static void main(String[] argv){
        Lab8Baby[] babies = new Lab8Baby[5];
        
        //Hardcoded records
        babies[0] = new Lab8Patient("Alice", 3, 101);
        babies[1] = new Lab8Baby("John", 2);
        babies[2] = new Lab8Playgroup("Larry", 4);
        babies[3] = new Lab8Baby("Joanne", 3);
        babies[4] = new Lab8Patient("Samuel", 7, 201);
        
        //Part5 of Lab8
        for (int i = 0; i < babies.length; i++){
            if (babies[i] instanceof Lab8Patient){
                System.out.println(babies[i]);
                System.out.println(babies[i].babySound());
                
                //Convert reference to derived class reference
                //Only do this when the erference is confirmed
                Lab8Patient temp = (Lab8Patient)babies[i];
                System.out.println(temp.getId());
            }
        }
        
        //Part6 of Lab8
        for (int i = 0; i < babies.length; i++){
            if (babies[i] instanceof Lab8Playgroup){
                System.out.println(babies[i]);
                System.out.println(babies[i].babySound());
            }
        }
    }
}
