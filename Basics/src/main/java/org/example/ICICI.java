package org.example;

public class ICICI extends RBI {
    int r = 4;
    public void interest(){
        int principle = 1000;
        int n = 2;
        int value = principle*n*r;
        System.out.println("Value of ICICI interest is : " + value);
    }

    public static void main(String[] args) {
        //ICICI icici = new ICICI();
        //icici.interest();

        RBI bank = new ICICI();
        bank.interest();
    }
}
/*
Same method and same signatre(parameters, return types) in parent and child class relationship
Run time polymorphism
Static, final, private methods and constructors cant be overriden

Overloading:
Same method but different parameters
Compile time polymorphism
*/