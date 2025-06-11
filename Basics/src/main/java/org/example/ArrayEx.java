package org.example;

public class ArrayEx {
    /*
     this is an object of fixed size with same data type
     Accessible through index
     Default values =>  0 for int & null for string
     Single dimensional and multi-dimensional array
     */
    public void oneDimensional() {
        int[] marks = new int[3];
            marks[0]=23;
            marks[1]=32;
            marks[2]=44;

            for(int A: marks){
                System.out.println("Value of A is :" + A);
            }
    }

    public void multiDimensional(){
        String students[][] = new String[2][2];
           students[0][0] = "Sruthi";
           students[0][1] = "Tiwani";
           students[1][0] = "kishore";
           students[1][1] = "Dragon";

           for(int i = 0 ; i<2; i++){
               for(int j=0; j<2;j++){
                  System.out.println("Multi-Dimensional values: @ i=> " + i + " @j => " + j + " " +  students[i][j]);
               }
           }
    }

    public static void main(String[] args) {
        ArrayEx ob = new ArrayEx();
        ob.oneDimensional();
        ob.multiDimensional();
    }
}
