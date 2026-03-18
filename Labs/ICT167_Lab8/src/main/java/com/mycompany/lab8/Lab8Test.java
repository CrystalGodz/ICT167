package com.mycompany.lab8;

public class Lab8Test {
    public static void main(String[] argv){
        //Base Class
        Lab8 c1 = new Lab8(10);
        System.out.println(c1.getArea());
        System.out.println(c1.getCircumference());
        System.out.println(c1);
        
        //Derived class
        Cylinder cy1 = new Cylinder(10, 20);
        System.out.println(cy1.getArea());
        System.out.println(cy1.getCircumference());
        System.out.println(cy1.getVolume());
        System.out.println(cy1);
        
        //Polymorphism (dynamic binding)
        Lab8 c = new Cylinder(10, 50);
        System.out.println(c); //toString() method in Cylinder
        
        c = new Lab8(50);
        System.out.println(c); //toString() method in Lab8
    }
}
