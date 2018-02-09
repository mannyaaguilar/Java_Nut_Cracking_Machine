package com.company.model;


public class SmallMachine extends CrackingMachine {
    public SmallMachine() {


    }

    @Override
    public boolean nutSizer(String name, double weight, String sound) {
        boolean crack = false;
        if(weight<=1.5){
            System.out.println("The Small Machine cracked the "
                    + name + ". It made a " + sound + " sound.");
            crack = true;
        }
        return crack;
    }
}