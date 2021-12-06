package com.stoecklin.panchalingam.sathushan;

import java.util.ArrayList;

public class Continent {  
    int continentID;
    String continentName;
    private ArrayList<Animal> animals = new ArrayList<>();

    Continent(String continentName) {
        this.continentName = continentName;
        this.continentID = 0;
    }

    public int getContinentID() {
        return continentID;
    }

    public void setContinentID(int continentID) {
        this.continentID = continentID;
    }

    public String getContinentName() {
        return continentName;
    }

    public void setContinentName(String continentName) {
        this.continentName = continentName;
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(ArrayList<Animal> animals) {
        this.animals = animals;
    }


    public void removeAnimal(int select) {
        animals.remove(select);
        animals.forEach(a -> {
            a.setAnimalID(animals.indexOf(a));
        });
        System.out.println("Das ausgewählte Tier wurde gelöscht");
    }
}
