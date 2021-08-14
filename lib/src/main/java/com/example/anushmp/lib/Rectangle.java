package com.example.anushmp.lib;

public class Rectangle {

    int length;
    int breadth;

    public Rectangle(int length,int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public void printarea(){

        System.out.println("the area is " + length * breadth);
    }

    public void printperimeter(){

        System.out.println("the perimeter is " + (2*(length + breadth)));

    }
}
