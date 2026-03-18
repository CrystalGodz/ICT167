package com.mycompany.lab5;

public class RectangleLab5 {
    private double length;
    private double width;
    
    public boolean equals(RectangleLab5 rect){
        return getArea() == rect.getArea();
    }
    
    public RectangleLab5(){
        length = width = 1;
    }
    
    public RectangleLab5(double rLength, double rWidth){
        if (rLength > 0 && rWidth > 0){
            length = rLength;
            width = rWidth;
        }
        else
            length = width = 1;
    }
    
    public void setLength(double rLength){
        if (rLength > 0)
            length = rLength;
    }
    
    public void setWidth(double rWidth){
        if (rWidth > 0)
            width = rWidth;
    }
    
    public double getArea(){
        return length * width;
    }
    
    public String toString(){
        return "Rectangle " + length + " X " + width + " = " + length * width;
    }
    
//    public static void main(String[] argv){
//        //There will be an error if r1 does not match the perimeter
//        //RectangleLab5(double rLength, double rWidth) above.
//        RectangleLab5 r1 = new RectangleLab5();
//        System.out.println(r1);
//        
//        
//        r1.setLength(10.889);
//        r1.setWidth(20.9);
//        System.out.println(r1);
//        
//        
//        RectangleLab5 r2 = new RectangleLab5(20,99);
//        System.out.println(r2);
//        
//        
//        System.out.println(r1.equals(r2));
//        r1.setLength(20);
//        r1.setWidth(99);
//        System.out.println(r1.equals(r2));
//    }
}
