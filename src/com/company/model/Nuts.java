package com.company.model;

public abstract class Nuts {

    public String name;
    public double weight;
    public String sound;

    public Nuts(String name, double weight, String sound) {
        this.name = name;
        this.weight = weight;
        this.sound = sound;
    }

    public void crack(){

    }
}
