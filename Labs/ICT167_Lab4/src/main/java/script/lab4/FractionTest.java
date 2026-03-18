package script.lab4;
import java.util.Scanner;

public class FractionTest {
    public static void main(String[] argv){
        Scanner kBoard = new Scanner(System.in);
        Fraction fTotal = new Fraction();
        fTotal.setNumerator(0);
        fTotal.setDenominator(1);
        Fraction fNumber = new Fraction();
        while (true){
            System.out.println("Enter numerator: ");
            int numerator = kBoard.nextInt();
            if(numerator == 0)
                break;
            System.out.println("Enter denominator: ");
            int denominator = kBoard.nextInt();
            
            fNumber.setNumerator(numerator);
            fNumber.setDenominator(denominator);
            
            fTotal = fTotal.add(fNumber);
        }
        System.out.println(fTotal);
    }
}
