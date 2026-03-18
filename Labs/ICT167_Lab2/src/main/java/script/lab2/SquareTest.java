package script.lab2;

public class SquareTest {
    public static void main(String[] argv){
        Square sq1 = new Square();
        System.out.println(sq1.getArea());
        sq1.length = 10;
        System.out.println(sq1.getArea());
        Square sq2 = new Square();
        sq2.length = 20;
        System.out.println(sq2.getArea());
        System.out.println(sq2.getDiagonal());
    }
}
