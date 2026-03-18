package com.mycompany.lab5;

public class RectangleTestLab5 {
    public static void main(String[] argv){
        //setting a list of array [] - this indicates the number of arrays.
        RectangleLab5[] rects = new RectangleLab5[5];
        
        getSample(rects);
        printArray(rects);
        printLargest(rects);
        
        //check if there are simmilar rectangles in area size
        boolean dups = false;
        for (int curr = 0; curr < rects.length - 1; curr++){
            RectangleLab5 currRect = rects[curr];
            for (int next = curr + 1; next < rects.length; next++){
                RectangleLab5 nextRect = rects[next];
                if (currRect.equals(nextRect)){
                    dups = true;
                    break;
                }
            }
        }
        if (dups == true)
            System.out.println("Duplicate rectangles exists");
        else
            System.out.println("Duplicate rectangles doesn't exists");
    }
    
    public static void printLargest(RectangleLab5[] rects){
        double largest = rects[0].getArea();
        for (int curr = 1; curr < rects.length; curr++){
            if (rects[curr].getArea() > largest)
                largest = rects[curr].getArea();
        }
        System.out.println();
        System.out.println("Largest Rectangle is = " + largest);
    }
    
    public static void printArray(RectangleLab5[] rects){
        for (int i = 0; i < rects.length; i++){
            System.out.println(rects[i]);
        }
    }
    
    public static void getSample(RectangleLab5[] rects){
        rects[0] = new RectangleLab5(50,10);
        rects[1] = new RectangleLab5(30,20);
        rects[2] = new RectangleLab5(99,30);
        rects[3] = new RectangleLab5(100,20);
        rects[4] = new RectangleLab5(30,99);
    }
}
