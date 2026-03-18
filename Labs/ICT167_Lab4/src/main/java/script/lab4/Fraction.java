package script.lab4;

public class Fraction {
    private int numerator;
    private int denominator;
    
    public Fraction add(Fraction fracNum){
        int newNumerator = numerator * fracNum.denominator + 
                denominator * fracNum.numerator;
        
        int newDenominator = denominator * fracNum.denominator;
        
        Fraction temp = new Fraction();
        temp.numerator = newNumerator;
        temp.denominator = newDenominator;
        
        temp.simplify();
        
        return temp;
    }
    private void simplify(){
        int startNum;
        if (numerator < denominator)
            startNum = numerator;
        else
            startNum = denominator;
        
        for (int div = startNum; div >= 2; div--){
            if (numerator % div == 0 && denominator % div == 0){
                numerator = numerator / div;
                denominator = denominator / div;
                break;
            }
        }
    }
    public boolean isEqual(Fraction fNum){
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
    public void setDenominator(int deValue){
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
