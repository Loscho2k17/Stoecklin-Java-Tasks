package com.stoecklin.pachalingam.sathushan;

import java.util.ArrayList;

public class Animal {

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public int getAnimalID() {
        return animalID;
    }

    public void setAnimalID(int animalID) {
        this.animalID = animalID;
    }

    protected String animalName = "Tier";
    int animalID;
    double animalWeight;
    double animalSize;

    Animal(ArrayList<Animal> animals, String animalName, int animalID) {
        Continent.setAnimals(animals);
        this.animalName = animalName;
        this.animalID = animalID;
    }

    public static void move() {

    }

    public static void sounds() {
        String sound = "Bark";
        System.out.println(sound);
    }
}
