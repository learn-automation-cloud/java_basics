package org.example;

public class RBI {
    int r = 2;
    public void interest(){
        int principle = 1000;
        int n = 2;
        int value = principle*n*r;
        System.out.println("Value of RBI interest is : " + value);

    }

    public static void main(String[] args) {
        RBI bank = new RBI();
        bank.interest();
    }
}
