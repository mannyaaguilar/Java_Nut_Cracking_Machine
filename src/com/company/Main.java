package com.company;
import com.company.model.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        LargeMachine large = new LargeMachine();
        SmallMachine small = new SmallMachine();

        Walnut walnut = new Walnut();
        Peanut peanut = new Peanut();
        Cashew cashew = new Cashew();
        Almond almond = new Almond();
        Pistachio pistachio = new Pistachio();

        large.nutSizer(walnut.name, walnut.weight, walnut.sound);
        large.nutSizer(peanut.name, peanut.weight, peanut.sound);
        large.nutSizer(cashew.name, cashew.weight, cashew.sound);
        large.nutSizer(almond.name, almond.weight, almond.sound);
        large.nutSizer(pistachio.name, pistachio.weight, pistachio.sound);

        small.nutSizer(walnut.name, walnut.weight, walnut.sound);
        small.nutSizer(peanut.name, peanut.weight, peanut.sound);
        small.nutSizer(cashew.name, cashew.weight, cashew.sound);
        small.nutSizer(almond.name, almond.weight, almond.sound);
        small.nutSizer(pistachio.name, pistachio.weight, pistachio.sound);

    }
}
