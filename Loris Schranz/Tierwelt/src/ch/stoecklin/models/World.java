package ch.stoecklin.models;

import java.util.ArrayList;

public class World {
    private final ArrayList<Continent> Continents = new ArrayList<>();
    private String worldName;

    public World(String worldName) {
        this.worldName = worldName;
    }

    public String getWorldName() {
        return worldName;
    }

    public void setWorldName(String worldName) {
        this.worldName = worldName;
    }

    public ArrayList<Continent> getContinents() {
        return Continents;
    }

    // Continents

    public void createContinent(String continentName) {
        Continents.add(new Continent(continentName));
    }

    public void deleteContinent(int continentID) {
        Continents.remove(continentID);
    }

    public void showAllContinents() {
        for (Continent con : Continents) {
            System.out.println("ID: " + con.getContinentID() + " | Name: " + con.getContinentName());
        }
    }

    // Animals

    public void addAnimalToContinent(int continentID, String animalName, String animalRace) {
        Continents.get(continentID).getAnimals().add(new Animal(animalName, animalRace));
    }

    public void removeAnimalFromContinent(int continentID, int animalID) {
        Continents.get(continentID).getAnimals().remove(animalID);
    }

    public void showAllAnimals() {
        for (Continent con : Continents) {
            for (Animal an : con.getAnimals()) {
                System.out.println("ID: " + an.getAnimalID() + " | Race: " + an.getAnimalRace() + " | Name: " + an.getAnimalName() + " | From: " + con.getContinentName());
            }
        }
    }

    public int countAllAnimals() {
        int count = 0;
        for (Continent con : Continents) {
            for (Animal an : con.getAnimals()) {
                count++;
            }
        }
        return count;
    }

    public void showAllAnimalsFromContinent(int continentID) {
        for (Animal an : Continents.get(continentID).getAnimals()) {
            System.out.println("ID: " + an.getAnimalID() + " | Race: " + an.getAnimalRace() + " | Name: " + an.getAnimalName());
        }
    }

    public int countAllAnimalsFromContinent(int continentID) {
        int count = 0;
        for (Animal an : Continents.get(continentID).getAnimals()) {
            count++;
        }
        return count;
    }
}
