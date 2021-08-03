package com.example.anushmp.lib;

public class MyClass {


    public static void main(String[] args) {
        System.out.println("Yee");

        StringBuilder sbl = new StringBuilder();

        sbl.append("google");

        StringBuffer sbf = new StringBuffer();

        sbf.append("apple");


        sbf.append(" and microsoft");
        sbl.append(" and amazon");

        //sbl.reverse();
        //System.out.println(sbl);


        System.out.println(sbl);
        System.out.println(sbf);

        for (int i = 0; i<sbl.length(); i++){

            System.out.println(sbl.charAt(i));

        }

    }


}