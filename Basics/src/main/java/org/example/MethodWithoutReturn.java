package org.example;

public class MethodWithoutReturn {

    public void status(){
        int a =200;
        int b = 300;
        int Total_Value = a+b;
        System.out.println("Value :" + Total_Value);
    }

    public static void main(String[] args) {
        MethodWithoutReturn ob = new MethodWithoutReturn();
        ob.status();
    }
}
