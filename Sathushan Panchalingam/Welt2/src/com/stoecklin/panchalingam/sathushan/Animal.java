package com.stoecklin.panchalingam.sathushan;

public abstract class Animal {

    String animalName;
    int animalID;
    String animalSpecies;
    double animalWeight;
    double animalSize;

    Animal(String animalName, String animalSpecies) {
        this.animalID = 0;
        this.animalName = animalName;
        this.animalSpecies = animalSpecies;
    }

    public String getAnimalSpecies() {
        return animalSpecies;
    }

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

    public void move() {

    }

    public void sounds() {
        String sound = "Bark";
        System.out.println(sound);
    }
}
