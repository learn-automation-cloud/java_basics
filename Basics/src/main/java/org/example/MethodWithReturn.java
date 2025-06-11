package org.example;

public class MethodWithReturn {
    public int status(){
        int a = 200;
        return a;
    }

    public static void main(String[] args) {
        MethodWithReturn ob = new MethodWithReturn();
        System.out.println("status calculated as :" + ob.status());
    }
}
