package com.example.anushmp.lib;

public class countoccurances {

    public static int countletter(char character,StringBuilder input){

        int output = 0;

        for(int i = 0; i<input.length(); i++){

            if(input.charAt(i) == character){
                output++;
            }

        }


        return output;

    }

    public static void main(String[] args) {

        char letter = 'k';

        StringBuilder input = new StringBuilder("kitkatkitkatkitkat");

        int output = countletter(letter, input);

        System.out.println("The number of times " + letter + " appears in " + input +" is "
                + output);


    }

}
