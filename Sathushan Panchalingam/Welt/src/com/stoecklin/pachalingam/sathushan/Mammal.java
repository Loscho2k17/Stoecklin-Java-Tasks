package com.stoecklin.pachalingam.sathushan;

import java.util.ArrayList;

public class Mammal extends Animal {

    Mammal(ArrayList<Animal> animals, String animalName, int animalID) {
        super(animals, animalName, animalID);
    }

    private String Name = "Hund";

    public static void main(String[] args) {
        Mammal newMammal = new Mammal(null, null, 0);

        newMammal.animalWeight = 70.7;
        newMammal.animalSize = 1.40;

        System.out.println(newMammal.animalName + newMammal.Name);
    }
}
