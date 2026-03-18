package script.lab2;

public class Square {
    public double length;  // Instance variable
    
    public double getArea(){
        
        //sqArea is a local varible
        double sqArea = length * length;
        return sqArea;
    }
    public double getDiagonal(){
        double sqBaseHeight = length * length * 2;
        double diagonal = Math.sqrt(sqBaseHeight);
        return diagonal;
        
    }
}
