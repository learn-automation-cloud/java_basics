package org.example;

public class Overloading {

    public void add(){
        System.out.println("Concept of addition in overloading");
    }

    public void add(int a, int b){
        System.out.println("Method with two arguments");
    }

    public void add(int a, String name){
        System.out.println("Method with different type arguments");
    }

    public void add(int a, int b, int c){
        System.out.println("Method with three arguments");
    }

    public static void main(String[] args) {
        Overloading old = new Overloading();
        old.add();
        old.add(26, "jaffer");
        old.add(30, 45,565);
    }

}

/*
Same method name but can have different type of argument, order of argument, number of argument
 */