package com.mycompany.lab9;

public class EmptyException extends Exception{
    public EmptyException(String errMesg){
        super(errMesg);
    }
    
    public EmptyException(String errMesg, Throwable err){
        super(errMesg,err);
    }
}
