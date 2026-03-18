package com.mycompany.lab8;

public class Lab8 {
    private double radius;
    
    public Lab8(double radius){
        if (radius > 0){
            this.radius = radius;
        }
        else{
            this.radius = 1;
        }
    }
    
    public double getRadius(){
        return radius;
    }
    
    public double getArea(){
        return Math.PI * radius * radius;
    }
    
    public double getCircumference(){
        return 2 * Math.PI * radius;
    }
    
    public String toString(){
        String str = "Circle of radius " + getRadius();
        if (getArea() > 0){
            str += "\n,has an area of " + getArea();
        }
        return str;
    }
}
