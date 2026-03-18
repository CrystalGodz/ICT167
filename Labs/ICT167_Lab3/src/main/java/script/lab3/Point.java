package script.lab3;

public class Point {
    private double x;
    private double y;
    
    //Method to compare the value of 2 instances
    public boolean isEqual(Point anotherPoint){
        if (x == anotherPoint.x && y == anotherPoint.y)
            return true;
        else{
            return false;
        }
    }
    
    //Get method
    public double getx(){
        return x;
    }
    public double gety(){
        return y;
    }
    
    public void setx(double xValue){
        x = xValue;
    }
    public void sety(double yValue){
        y = yValue;
    }
    
    public String toString(){
        return "(" + x + ", " + y + ")";
    }
}
