package com.mycompany.lab6;

public class Lab6 {
    public static void main(String[] argv){
        int[] number = null;
        
        /*
        Don't use if not referenced
        int[] number = new int[10];
        */
        
        //Call method to get array
        number = getData();
        for(int i = 0; i < number.length; i++){
            System.out.println(number[i]);
        }
        twoDimensionArray();
        twoDimensionArray2();
    }
    
    public static int[] getData(){
        int[] sample = {12, 99, 32, 13, 47};
        return sample;
    }
    
    public static void twoDimensionArray2(){
       int[][] sample2 = {{29, 29, 42, 0},
                          {33, 22, 10, 0},
                          {19, 39, 32, 0}};
       
       for (int r = 0; r < sample2.length; r++){
            int total = 0;
            for (int c = 0; c < sample2[r].length - 1; c++){
                total += sample2[r][c];
            }
            sample2[r][sample2[r].length - 1] = total;
       }
       
       for (int r = 0; r < sample2.length; r++){
            for (int c = 0; c < sample2[r].length; c++){
                // shows the data in each dimension of this array
                System.out.print(sample2[r][c]+ " ");
            }
            System.out.println();
        }
    }
    
    public static void twoDimensionArray(){
        
        // 2 dimensional array
        int[][] sample1 = new int[5][4];
        
        for (int r = 0; r < sample1.length; r++){
            for (int c = 0; c < sample1[r].length; c++){
                // shows the data in each dimension of this array
                System.out.print(sample1[r][c]+ " ");
            }
            System.out.println();
        }
    }
}
