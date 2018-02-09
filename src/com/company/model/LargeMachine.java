package com.company.model;

public class LargeMachine extends CrackingMachine{

    public LargeMachine() {

    }

    @Override
    public boolean nutSizer(String name, double weight, String sound) {
        boolean crack = false;
        if(weight>1.5){
            System.out.println("The Large Machine cracked the "
                    + name + ". It made a " + sound + " sound.");
        crack = true;
        }
        return crack;
    }

}
