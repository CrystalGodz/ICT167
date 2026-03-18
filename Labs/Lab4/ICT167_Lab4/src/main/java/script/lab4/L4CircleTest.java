package script.lab4;

public class L4CircleTest {
    public static void main(String[] argv){
        Lab4 c1 = new Lab4();
        c1.setRadius(10);
        System.out.println(c1.getArea());
        System.out.println(c1);
        
        double area = Lab4.getArea(20);
        System.out.println(area);
        System.out.println(Lab4.getArea(100));
    }
}
