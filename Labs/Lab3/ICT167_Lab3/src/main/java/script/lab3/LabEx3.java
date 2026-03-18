package script.lab3;

public class LabEx3 {
    private int numerator;
    private int denominator;
    
    public boolean isEqual(LabEx3 fNum){
        int nuValue1 = numerator * fNum.denominator;
        int nuValue2 = fNum.numerator * denominator;
        return (nuValue1 == nuValue2);
    }
    
    public int getNumerator(){
        return numerator;
    }
    public int getDenominator(){
        return denominator;
    }
    
    public void setNumerator(int nuValue){
        numerator = nuValue;
    }
    public void setDenomiator(int deValue){
        if (deValue < 0){
            numerator = numerator * - 1;
            denominator = deValue * - 1;
        }
        else {
            denominator = deValue;
        }
        denominator = deValue;
    }
    
    public String toString(){
        return numerator + "/" + denominator;
    }
}
