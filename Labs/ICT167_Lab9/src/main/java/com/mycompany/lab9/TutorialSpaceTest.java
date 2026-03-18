package com.mycompany.lab9;

public class TutorialSpaceTest{
    public static void main(String[] argv){
        TutorialSpace t1 = new TutorialSpace(3);
        
        try{
            t1.reserveSlot();
            System.out.println(t1.slotsRemaining());
        }
        catch(NotActivatedException | EmptyException err){
            System.out.println(err);
        }
        System.out.println("End of Method");
    }
}
