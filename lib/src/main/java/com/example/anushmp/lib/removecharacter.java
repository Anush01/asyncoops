package com.example.anushmp.lib;

public class removecharacter {

    public static StringBuilder removeChar(char rem, StringBuilder input){


        StringBuilder response = new StringBuilder();


        for(int i = 0; i<input.length(); i++){

            if(input.charAt(i) != rem){

            response.append(input.charAt(i));

            }

        }

        return response;

    }

    public static void main(String[] args) {

        char characterToRemove = 'a';

        StringBuilder input = new StringBuilder("Barista");

        System.out.println(input + " without all a's looks like the following ");

        StringBuilder output =removeChar(characterToRemove,input);

        System.out.println(output);


    }

}
