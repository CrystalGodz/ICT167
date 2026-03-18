package com.mycompany.lab8;

public class Cylinder extends Lab8{
    private double height;

    public Cylinder(double radius, double height){
        super(radius); //Calling base class constructor
        if ( height > 0){
            this.height = height;
        }
        else{
            this.height = 1;
        }
    }
    
    public double getVolume(){
        return height * super.getArea();
    }
    
    public double getArea(){
        return getCircumference() * height + super.getArea() * 2;
    }
    
    public String toString(){
        return "Cylinder with area of " + getArea() + " has a volume of " + getVolume();
    }
    
}
