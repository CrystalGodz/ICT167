package script.lab3;

public class PointTest {
    public static void main(String[] argv){
        
        //Setting a new instance
        Point p1 = new Point();
        System.out.println(p1);
        p1.setx(10);
        p1.sety(100);
        System.out.println(p1);
        
        //Another instance
        Point p2 = new Point();
        p2.setx(10);
        p2.sety(100);
        System.out.println(p2);
        
        //Comparing instances
        System.out.println(p1 == p2);
        
        //Comparing values of an instance refer to class file 'Point'
        System.out.println(p1.isEqual(p2));
        
        //Calling method and pass in instance of Point
        change(p2);
        System.out.println(p2);
        System.out.println(p1.isEqual(p2));
    }
    public static void change(Point pt){
        double newx = pt.getx() + 100;
        double newy = pt.gety() + 100;
        
        pt.setx(newx);
        pt.sety(newy);
    }
}
