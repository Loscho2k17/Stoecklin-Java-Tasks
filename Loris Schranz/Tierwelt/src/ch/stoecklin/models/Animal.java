package ch.stoecklin.models;

import java.util.concurrent.atomic.AtomicInteger;

public class Animal {
    private static final AtomicInteger count = new AtomicInteger(0);
    private int animalID;
    private String animalName;
    private String animalRace;

    public Animal(String animalName, String animalRace){
        this.animalName = animalName;
        this.animalRace = animalRace;
        this.animalID = count.incrementAndGet();
    }

    public int getAnimalID() {
        return animalID;
    }

    public void setAnimalID(int animalID) {
        this.animalID = animalID;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getAnimalRace() {
        return animalRace;
    }

    public void setAnimalRace(String animalRace) {
        this.animalRace = animalRace;
    }

    public void move(){
        // make animal move
    }

    public void speak(){
        // create animal noises?
    }
}
