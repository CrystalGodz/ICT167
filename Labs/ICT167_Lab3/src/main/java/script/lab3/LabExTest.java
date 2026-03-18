package script.lab3;

import java.util.Scanner;

public class LabExTest {
    public static void main(String[] argv){
        Scanner kBoard = new Scanner(System.in);
        
        LabEx3 f1 = new LabEx3();
        while (true){
            System.out.println("Enter numerator: ");
            int nuValue = kBoard.nextInt();
            if (nuValue < 0){
                break;
            }
            System.out.println("Enter denominator: ");
            int deValue = kBoard.nextInt();
            
            f1.setNumerator(nuValue);
            f1.setDenomiator(deValue);
            System.out.println(f1);
        }
        // Testing isEqual method
        LabEx3 f2 = new LabEx3();
        f2.setNumerator(2);
        f2.setDenomiator(5);
        LabEx3 f3 = new LabEx3();
        f3.setNumerator(4);
        f3.setDenomiator(10);
        System.out.println(f2.isEqual(f3));
    }
}
