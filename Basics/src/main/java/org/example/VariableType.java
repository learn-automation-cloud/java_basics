package org.example;

public class VariableType {

    int s = 20; //instance variable
    static int price = 34; //static variable

    public static void main(String[] args) {
      int rate = 5; //local variable
      VariableType vr = new VariableType();
      int total_value = 5 * vr.s * price;
      System.out.println("Total value is : " + total_value);
    }

}
