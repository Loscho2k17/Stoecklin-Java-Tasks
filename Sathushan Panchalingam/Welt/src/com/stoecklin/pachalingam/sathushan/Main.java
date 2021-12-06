package com.stoecklin.pachalingam.sathushan;

import java.util.Scanner;

public class Main {

    private static Scanner input;

    /**
     * @param args
     * @author sathu With the main methode a new object world will be generated and the user can choose what he want to
     *         do (addContinent, removeContinent,...)
     */
    public static void main(String[] args) {
        input = new Scanner(System.in);
        createWorld();

        int selectionFunction;
        do {
            System.out.println("Bitte wähle eine Funtkion aus: \n " + "1: Kontinent hinzufügen\n "
                    + "2: Kontinent löschen" + "\n 3: Alle Kontinente anzeigen" + "\n 4: Tier hinzufügen"
                    + "\n 5: Tier löschen" + "\n 6: Alle Tiere anzeigen" + "\n 7: Tiere pro Kontinent anzeigen"
                    + "\n 8: Abfrage zu der Welt" + "\n 9: Abfrage zu Tieren\n");
            selectionFunction = input.nextInt();
            switch (selectionFunction) {
                case 1:
                    World.addContinent();
                    selectionFunction = continueSelection();
                    break;
                case 2:
                    World.removeContinent();
                    selectionFunction = continueSelection();
                    break;
                case 3:
                    Main.outputContinent();
                    selectionFunction = continueSelection();
                    break;
                case 4:
                    Main.outputContinent();
                    System.out.println("Zu welchem Kontinent möchtest du ein Tier hinzufügen (Kontinent-ID eingeben)?");
                    Continent.addAnimal(input.nextInt());
                    selectionFunction = continueSelection();
                    break;
                case 5:
                    Continent.removeAnimal();
                    selectionFunction = continueSelection();
                    break;
                case 6:
                    Continent.outputAnimal();
                    selectionFunction = continueSelection();
                    break;
                case 7:
                    Main.outputContinent();
                    System.out.println("Von welchem Kontinent möchtest du die Tiere anzeigen?");
                    /*for(int i = 0; i < World.getContinents().get(input.nextInt()).getAnimals().size(); i++) {
                        System.out.println(World.getContinents().get(input.nextInt()).getAnimals().get(i).getAnimalName());
                    }
                    */
                    for (Animal animal : World.getContinents().get(input.nextInt()).getAnimals()) {
                        System.out.println(animal.getAnimalName());
                    }
                    selectionFunction = continueSelection();
                    break;
                case 8:
                    World.queryWorld();
                    selectionFunction = continueSelection();
                    break;
                case 9:
                    World.queryAnimal();
                    selectionFunction = continueSelection();
                    break;
                default:
                    System.out.println("Diese Auswahl ist ungültig");
            }
        } while (selectionFunction != 2);
        System.out.println("Auf dieser Welt gibt es diese Kontiente: ");
        Main.outputContinent();
        System.out.println("Auf dieser Welt gibt es diese Tiere: ");
        Continent.outputAnimal();
    }

    public static void createWorld() {
        World world = new World();
        System.out.println("Wie soll deine neue Welt heissen?");
        world.setName(input.nextLine());
        System.out.println("Diese Welt heisst " + world.getName() + "\n");
    }

    public static int removeContinentQuery() {
        for (int i = 0; i < World.getContinents().size(); i++) {
            System.out.println("ID: " + World.getContinents().get(i).getContinentID() + "    Name: "
                    + World.getContinents().get(i).getContinentName());
        }
        System.out.println("Welcher Kontinent soll gelöscht werden? (ID eingeben)");
        int select = input.nextInt();
        return select;
    }

    public static int removeAnimalQuery() {
        for (int i = 0; i < Continent.getAnimals().size(); i++) {
            System.out.println("ID: " + Continent.getAnimals().get(i).getAnimalID() + "    Name: "
                    + Continent.getAnimals().get(i).getAnimalName());
        }
        System.out.println("Welches Tier soll gelöscht werden? (ID eingeben)");
        int select = input.nextInt();
        return select;
    }

    public static int queryAnimalSelection() {
        System.out.println("Bitte wähle eine Abfrage: \n " + "1: Liste alle Säugetiere\n " + "2: Liste alle Amphibien"
                + "\n 3: Weitere Abfragen");
        input = new Scanner(System.in);
        int selectionQueryWorld = input.nextInt();
        return selectionQueryWorld;
    }

    public static int queryWorldSelection() {
        System.out.println("Bitte wähle eine Abfrage: \n " + "1: Wie viele Tiere leben in Europa?\n "
                + "2: Wie viele Tiere leben auf der Welt?" + "\n 3: Weitere Abfragen");
        input = new Scanner(System.in);
        int selectionQueryWorld = input.nextInt();
        return selectionQueryWorld;
    }

    public static int continueSelection() {
        input = new Scanner(System.in);
        System.out.println("\nMöchtest du eine weitere Abfrage machen? \n1: Weitere Abfrage\n2: Keine Abfrage mehr");
        int continueSelection = input.nextInt();
        return continueSelection;
    }

    public static String createContinentName() {
        input = new Scanner(System.in);
        System.out.println("Wie soll das Kontinent heissen?");
        String continentName = input.nextLine();
        return continentName;
    }

    public static String createAnimalName() {
        input = new Scanner(System.in);
        System.out.println("Wie soll das Tier heissen?");
        String animalName = input.nextLine();
        return animalName;
    }

    public static int numberAnimal() {
        int numberAnimalTotal = Continent.getAnimals().size();

        return numberAnimalTotal;
    }

    public static void outputContinent() {
        for (int i = 0; i < World.getContinents().size(); i++) {
            System.out.println("ID: " + World.getContinents().get(i).getContinentID() + "    Name: "
                    + World.getContinents().get(i).getContinentName());
        }
    }

    public static int numberMammalAnimal() {
        int numberMammalAnimalTotal = Continent.getAnimals().size();

        return numberMammalAnimalTotal;
    }

    public static int numberFishAnimal() {
        int numberFishAnimalTotal = Continent.getAnimals().size();

        return numberFishAnimalTotal;
    }
}
