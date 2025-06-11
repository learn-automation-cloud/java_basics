package org.example;

public class ConstructorEx {
   int a;
   int b;
    public void sample(){
        int value = a+b;
        System.out.println("Result of expenses: " + (a+b));
    }

    public ConstructorEx(int a){
        System.out.println("This is a default parent constructor");
        this.a = a;
    }

    public ConstructorEx(int a, int b){
        this(23);
        System.out.println("This is a Parameterised constructor");
        this.a = a;
        this.b = b;
    }

    public static void main(String[] args) {
     /*   ConstructorEx ob = new ConstructorEx();
        ob.sample();*/

        ConstructorEx ob1 = new ConstructorEx(23, 1000);
        ob1.sample();
    }
}
/*
 Constructor will be having the same name as class name
 no return type
 Automatically variables are initiated when object is created
 Two types: default and parameterised constructor
 this keyword when called on same class
 super keyword when called on child class
 Can be overloaded
 Cannot be inherited
 */