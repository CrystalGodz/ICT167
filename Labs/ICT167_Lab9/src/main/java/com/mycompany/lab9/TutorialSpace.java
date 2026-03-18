package com.mycompany.lab9;

public class TutorialSpace {
    private int slot;
    private boolean activated;
    
    public TutorialSpace(int classSize){
        slot = classSize;
        activated = false;
    }
    
    //Unchecked exception, does not reqire to throw
    public void activate(){
        if(activated){
            throw new RuntimeException("Tutorial class is already activated");
        }
        activated = true;
    }
    
    //Checked Exception
    public void reserveSlot() throws NotActivatedException, EmptyException{
        if(activated == false){
            throw new NotActivatedException("Class is not active");
        }
        if(slot == 0){
            throw new EmptyException("Class is full");
        }
        slot--;
    }
    
    public int slotsRemaining(){
        return slot;
    }
}
