package com.stoecklin.pachalingam.sathushan;

import java.util.ArrayList;

public class World {

    private String name;
    private static ArrayList<Continent> continents = new ArrayList<Continent>();

    public static ArrayList<Continent> getContinents() {
        return continents;
    }

    public static void setContinents(ArrayList<Continent> continents) {
        World.continents = continents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void addContinent() {
        int continentID;
        if (getContinents().size() == 0) {
            continentID = 0;
        } else {
            continentID = getContinents().get(getContinents().size() - 1).getContinentID() + 1;
        }
        String continentName = Main.createContinentName();
        Continent newContinent = new Continent(getContinents(), continentName, continentID, Continent.getAnimals());
        getContinents().add(newContinent);
        System.out.println("Der Kontinent " + continentName + " wurde hinzugefügt");

    }

    public static void removeContinent() {
        int select = Main.removeContinentQuery();
        getContinents().remove(select);
        System.out.println("Der ausgewählte Kontinent wurde gelöscht.");
    }

    public static void queryWorld() {
        int selectionQuereWorld = Main.queryWorldSelection();
        switch (selectionQuereWorld) {
            case 1:

                Main.numberAnimal();
                if (Main.numberAnimal() == 1) {
                    System.out.println("Es gibt " + Main.numberAnimal() + " Tier in Europa");
                } else {
                    System.out.println("Es gibt " + Main.numberAnimal() + " Tiere in Europa");
                }
                break;
            case 2:

                // Funktion für Abfrage wv Tiere auf der Welt
                System.out.println("Es gibt 10 Tiere auf der Welt");
                break;
            case 3:

                // Funktion für weitere Abfragen
                System.out.println("Weitere Abfragen");
                break;
            default:
                System.out.println("Diese Auswahl ist ungültig");
        }
    }

    public static void queryAnimal() {
        int selectionQueryAnimal = Main.queryAnimalSelection();
        switch (selectionQueryAnimal) {
            case 1:
                System.out.println("Säugetiere Liste:");
                Main.numberMammalAnimal();
                break;
            case 2:
                System.out.println("Fish Liste:");
                Main.numberFishAnimal();
                break;
            case 3:

                // Funktion für weitere Abfragen
                System.out.println("Weitere Abfragen");
                break;
            default:
                System.out.println("Diese Auswahl ist ungültig");
        }
    }

    public static void selectContinent() {
        System.out.println("Von welchem Kontinent möchtest du die Tiere anzeigen?");
        Main.outputContinent();
    }
}
