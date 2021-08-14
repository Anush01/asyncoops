package com.example.anushmp.lib;

public class RectangleDriver {

    public static void main(String[] args) {

        Rectangle rect = new Rectangle(10,20);
        rect.printarea();
        rect.printperimeter();

        square biscuit = new square(10);

        biscuit.printarea();
        biscuit.printperimeter();


        for(int i = 10; i<20; i++){

            square sq = new square(i);
            sq.printarea();

        }

    }

}
