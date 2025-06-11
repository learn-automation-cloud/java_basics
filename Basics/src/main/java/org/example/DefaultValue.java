package org.example;

public class DefaultValue {
     int s;
     double f;
     boolean status;
     char char_s;
     String name;
     int[] students;
    public static void main(String[] args) {
        DefaultValue dv = new DefaultValue();
        System.out.println("Default value of int :" + dv.s);
        System.out.println("Default value of double :" + dv.f);
        System.out.println("Default value of boolean :" + dv.status);
        System.out.println("Default value of char :" + dv.char_s);
        System.out.println("Default value of String :" + dv.name);
        System.out.println("Default value of array :" + dv.students);
    }
}
