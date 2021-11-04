package ch.stoecklin.models;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Continent {
    private ArrayList<Animal> Animals = new ArrayList<>();
    private static final AtomicInteger count = new AtomicInteger(0);
    private int continentID;
    private String continentName;

    public Continent(String continentName){
        this.continentName = continentName;
        continentID = count.incrementAndGet();
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
        return Animals;
    }

    public void setAnimals(ArrayList<Animal> animals) {
        Animals = animals;
    }
}
