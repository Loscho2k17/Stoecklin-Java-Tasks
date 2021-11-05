package com.stoecklin.pachalingam.sathushan;

import java.util.ArrayList;
import java.util.Scanner;

public class Continent {

    private static Scanner input;
    int continentID;
    String continentName;
    private static ArrayList<Animal> animals = new ArrayList<Animal>();

    Continent(ArrayList<Continent> continents, String continentName, int continentID, ArrayList<Animal> animals) {
        World.setContinents(continents);
        this.continentName = continentName;
        this.continentID = continentID;
        Continent.animals = animals;
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

    public static ArrayList<Animal> getAnimals() {
        return animals;
    }

    public static void setAnimals(ArrayList<Animal> animals) {
        Continent.animals = animals;
    }

    public static void addAnimal(int id) {
        int animalID;
        input = new Scanner(System.in);
        if (getAnimals().size() == 0) {
            animalID = 0;
        } else {
            animalID = getAnimals().get(getAnimals().size() - 1).getAnimalID() + 1;
        }
        String animalName = Main.createAnimalName();
        ArrayList<Animal> Animals = animals;
        // (Animal animal : World.getContinents().get(input.nextInt()).getAnimals())
        Animal Animal = new Animal(Animals, animalName, animalID);
        // Continent.getAnimals().add(Animal);
        World.getContinents().get(input.nextInt()).getAnimals().add(Animal);
        System.out.println("Ein Tier namens " + animalName + " wurde hinzugefügt");
    }

    public static void removeAnimal() {
        int select = Main.removeAnimalQuery();
        animals.remove(select);
        System.out.println("Das ausgewählte Tier wurde gelöscht");
    }

    public static void outputAnimal() {
        for (int i = 0; i < getAnimals().size(); i++) {
            System.out.println(
                    "ID: " + getAnimals().get(i).getAnimalID() + "    Name: " + getAnimals().get(i).getAnimalName());
        }
    }
}
