package com.stoecklin.panchalingam.sathushan;

import java.util.ArrayList;

public class World {

    private String name;
    private ArrayList<Continent> continents = new ArrayList<>();

    public ArrayList<Continent> getContinents() {
        return continents;
    }

    public void setContinents(ArrayList<Continent> continents) {
        this.continents = continents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addContinent(String continentName) {
        Continent newContient = new Continent(continentName);
        continents.add(newContient);
        continents.get(continents.indexOf(newContient)).setContinentID(continents.indexOf(newContient));
        System.out.println("Der Kontinent " + continentName + " wurde hinzugefügt");

    }

    public void removeContinent(int select) {
        continents.remove(select);
        continents.forEach(con -> {
            con.setContinentID(continents.indexOf(con));
        });
        System.out.println("Der ausgewählte Kontinent wurde gelöscht.");
    }

    public void addAnimalToContinent(int continentID, String animalName, int select) {
        Animal addNewAnimal;
        switch (select) {
            case 1:
                addNewAnimal = new Mammal(animalName);
                addAnimal(continentID, addNewAnimal);
                break;
            case 2:
                Fish addNewFish = new Fish(animalName);
                addNewAnimal = (Fish) addNewFish;
                addAnimal(continentID, addNewAnimal);
                break;
            case 3:
                Amphibians addNewAmphibian = new Amphibians(animalName);
                addNewAnimal = (Amphibians) addNewAmphibian;
                addAnimal(continentID, addNewAnimal);
                break;
            case 4:
                Reptile addNewReptil = new Reptile(animalName);
                addNewAnimal = (Reptile) addNewReptil;
                addAnimal(continentID, addNewAnimal);
                break;
            case 5:
                Birds addNewBird = new Birds(animalName);
                addNewAnimal = (Birds) addNewBird;
                addAnimal(continentID, addNewAnimal);
                break;
        }
    }

    public void addAnimal(int continentID, Animal addNewAnimal) {
        continents.get(continentID).getAnimals().add(addNewAnimal);
        continents.get(continentID).getAnimals().get(continents.get(continentID).getAnimals().indexOf(addNewAnimal))
                .setAnimalID(continents.get(continentID).getAnimals().indexOf(addNewAnimal));
    }
}
