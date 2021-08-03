package com.example.anushmp.lib;

public class ispalindrome {

    public static StringBuilder isPalindrome(StringBuilder sbl){

        StringBuilder response = new StringBuilder(sbl + " is a palindrome");



        StringBuilder reversed = new StringBuilder();

        for(int j = sbl.length()-1; j>=0; j--){

            reversed.append(sbl.charAt(j));

        }





        for(int i  = 0; i<sbl.length(); i++){

            if(sbl.charAt(i) != reversed.charAt(i)){

                response.delete(0,response.length());

                response.append(sbl + " is Not a palindrome");}

        }


        return response;

    }

    public static void main(String[] args) {

        StringBuilder input = new StringBuilder("racecar");

        StringBuilder output = isPalindrome(input);

        System.out.println(output);


    }

}
