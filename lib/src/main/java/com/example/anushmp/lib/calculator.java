package com.example.anushmp.lib;

public class calculator {

    public static int add(int a , int b){

        return a + b;

    }

    public static int subtract(int a, int b){

        return a - b;

    }

    public static int multiply(int a, int b){

        return a * b;

    }

    public static int divide(int a, int b){

        return a/b;

    }

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        System.out.println("For " + a + " and "+ b+ " The result from add() is " + add(a,b));
        System.out.println("For " + a + " and "+ b+ " The result from subtract() is " + subtract(a,b));
        System.out.println("For " + a + " and "+ b+ " The result from multiply() is " + multiply(a,b));
        System.out.println("For " + b + " and "+ a+ " The result from divide() is " + divide(b,a));

    }

}
