package com.mycompany.lab9;

public class NotActivatedException extends Exception{
    public NotActivatedException(String errMesg){
        super(errMesg);
    }
    
    public NotActivatedException(String errMesg, Throwable err){
        super(errMesg,err);
    }
}
