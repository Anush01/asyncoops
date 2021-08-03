package com.example.anushmp.lib;

public class hyundai extends abstractVehicle implements windowMovement

{

    @Override
    public void honkVolume(int volume) {

        System.out.println("The volume is " + volume);




    }

    @Override
    public void groundClearance(int clearance) {

        System.out.println("The clearance is " + clearance);

    }


    public static void main(String[] args) {

        hyundai h = new hyundai();
        h.honkVolume(10);
        h.groundClearance(30);

        h.open();
        h.close();

    }

    @Override
    public void open() {

        String opening = "window opens left";

        System.out.println(opening);
    }

    @Override
    public void close() {

        String closing = "window closes right";

        System.out.println(closing);

    }
}
