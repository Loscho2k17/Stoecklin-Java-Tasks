package com.stoecklin.panchalingam.sathushan;

import java.util.Scanner;

public class Main {

    private static Scanner input = new Scanner(System.in);
    private static World world;

    public static void main(String[] args) {
        displayMenu();
    }

    public static void displayMenu() {
        int continueDisplayMenu = 0;
        int selectContinent = 0;
        int tempContinentID = 0, tempAnimalID = 0, tempID = 0;
        String tempAnimalName = "Tiername";
        do {
            System.out.println("Bitte wähle eine Funtkion aus:");
            System.out.println("1: Welt erstellen");
            System.out.println("2: Kontinent hinzufügen");
            System.out.println("3: Kontinent löschen");
            System.out.println("4: Alle Kontinente anzeigen");
            System.out.println("5: Tier hinzufügen");
            System.out.println("6: Tier löschen");
            System.out.println("7: Alle Tiere anzeigen");
            System.out.println("8: Tiere pro Kontinent anzeigen");
            System.out.println("9: Abfrage zu der Welt");
            System.out.println("10: Abfrage zu Tieren");
            switch (input.nextInt()) {
                case 1:
                    createWorld();
                    break;
                case 2:
                    System.out.println("Wie soll das Kontinent heissen?");
                    world.addContinent(input.next());
                    break;
                case 3:
                    System.out.println("Welcher Kontinent soll gelöscht werden? (Kontinent-ID eingeben)");
                    world.removeContinent(selectContinent());
                    break;
                case 4:
                    displayContinent();
                    break;
                case 5:
                    displayContinent();
                    System.out.println("Zu welchem Kontinent möchtest du ein Tier hinzufügen (Kontinent-ID eingeben)?");
                    tempContinentID = input.nextInt();
                    System.out.println("Was für ein Tier soll hinzugefügt werden?");
                    System.out.println("1: Säugetier");
                    System.out.println("2: Fisch");
                    System.out.println("3: Amphibie");
                    System.out.println("4: Reptil");
                    System.out.println("5: Vogel");
                    tempAnimalID = input.nextInt();
                    System.out.println("Wie soll das Tier heissen?");
                    tempAnimalName = input.next();
                    world.addAnimalToContinent(tempContinentID, tempAnimalName, tempAnimalID);
                    break;
                case 6:
                    System.out.println("Von welchem Kontinent willst du das Tier entfernen? (Kontinent-ID eingeben)");
                    displayContinent();
                    selectContinent = input.nextInt();
                    world.getContinents().get(selectContinent).getAnimals().forEach(ani -> {
                        System.out.println("ID: " + ani.getAnimalID() + " | Name: " + ani.getAnimalName());
                    });
                    System.out.println("Welches Tier soll gelöscht werden? (Tier-ID eingeben)");
                    world.getContinents().get(selectContinent).removeAnimal(input.nextInt());
                    break;
                case 7:
                    System.out.println("Es gibt diese Tiere: ");
                    world.getContinents().forEach(con -> {
                        displayAnimals(con);
                    });
                    break;
                case 8:
                    System.out.println("Von welchem Kontinent möchtest du die Tiere anzeigen?");
                    selectContinent = selectContinent();
                    System.out.println("Es gibt folgende Tiere:");
                    displayAnimals(world.getContinents().get(selectContinent));
                    break;
                case 9:
                    System.out.println("Bitte wähle eine Abfrage: ");
                    System.out.println("1: Wie viele Tiere leben in einem Kontinent?");
                    System.out.println("2: Wie viele Tiere leben auf der Welt?");
                    System.out.println("3: Weitere Abfragen");
                    queryWorld(input.nextInt());
                    break;
                case 10:
                    System.out.println("Bitte wähle eine Abfrage:");
                    System.out.println("1: Liste alle Tiere einer Tierart");
                    System.out.println("2: Weitere Abfragen\"");
                    tempID = input.nextInt();
                    queryAnimal(tempID);
                    break;
                default:
                    System.out.println("Diese Auswahl ist ungültig");
            }
            continueDisplayMenu = continueMenu();
        } while (continueDisplayMenu == 1);
    }

    public static void createWorld() {
        world = new World();
        System.out.println("Wie soll deine neue Welt heissen?");
        world.setName(input.nextLine());
        System.out.println("Diese Welt heisst: " + world.getName() + "\n");
    }

    public static int selectContinent() {
        for (Continent con : world.getContinents()) {
            System.out.println("ID: " + con.getContinentID() + " |  Name: " + con.getContinentName());
        }
        return input.nextInt();
    }

    public static int continueMenu() {
        System.out.println("");
        System.out.println("Möchtest du eine weitere Abfrage machen?");
        System.out.println("1: Weitere Abfrage");
        System.out.println("2: Keine Abfrage mehr");
        return input.nextInt();
    }

    public static void displayContinent() {
        for (Continent con : world.getContinents()) {
            System.out.println("ID: " + con.getContinentID() + " | Name: " + con.getContinentName());
        }
    }

    public static void displayAnimals(Continent continent) {
        for (Animal ani : continent.getAnimals()) {
            System.out.println("Tierart: " + ani.getAnimalSpecies() + "| Name: " + ani.getAnimalName());
        }
    }

    public static void queryWorld(int selectionQueryWorld) {
        int numberAnimalTotal = 0;
        int selectContinent = 0;
        String continentName;
        switch (selectionQueryWorld) {
            case 1:

                // Funktion für Abfrage wv Tiere in einem Kontinent
                System.out.println("Von welchem Kontinent möchtest du die Tiere zählen? (Kontinent-ID eingeben)");
                selectContinent = selectContinent();
                numberAnimalTotal = world.getContinents().get(selectContinent).getAnimals().size();
                continentName = world.getContinents().get(selectContinent).getContinentName();
                if (numberAnimalTotal > 1) {
                    System.out.println("Es leben " + numberAnimalTotal + " Tiere in " + continentName);
                } else {
                    System.out.println("Es lebt " + numberAnimalTotal + " Tier in " + continentName);
                }
                break;
            case 2:

                // Funktion für Abfrage wv Tiere leben auf der Welt
                for (Continent con : world.getContinents()) {
                    numberAnimalTotal = numberAnimalTotal + con.getAnimals().size();
                }
                if (numberAnimalTotal > 1) {
                    System.out.println("Es leben " + numberAnimalTotal + " Tiere auf der Welt");
                } else {
                    System.out.println("Es lebt " + numberAnimalTotal + " Tier auf der Welt");
                }
                break;
            case 3:

                // Funktion für weitere Abfragen
                System.out.println("Weitere Abfragen");
                break;
            default:
                System.out.println("Diese Auswahl ist ungültig");
        }
    }

    public static void queryAnimal(int selectionQueryAnimal) {
        switch (selectionQueryAnimal) {
            case 1:
                System.out.println("Welche Tierart willst du auflisten?");
                System.out.println("1: Säugetier");
                System.out.println("2: Fisch");
                System.out.println("3: Amphibie");
                System.out.println("4: Reptil");
                System.out.println("5: Vogel");
                switch (input.nextInt()) {
                    case 1:
                        listAnimalSpecies("Säugetier");
                        break;
                    case 2:
                        listAnimalSpecies("Fisch");
                        break;
                    case 3:
                        listAnimalSpecies("Amphibie");
                        break;
                    case 4:
                        listAnimalSpecies("Reptil");
                        break;
                    case 5:
                        listAnimalSpecies("Vogel");
                        break;
                    default:
                        System.out.println("Diese Auswahl ist ungültig");
                }
                break;
            case 2:

                // Funktion für weitere Abfragen
                System.out.println("Weitere Abfragen");
                break;
            default:
                System.out.println("Diese Auswahl ist ungültig");
        }
    }

    public static void listAnimalSpecies(String species) {
        System.out.println(species + " Liste: ");
        for (Continent con : world.getContinents()) {
            for (Animal ani : con.getAnimals()) {
                if (ani.getAnimalSpecies().equals(species)) {
                    System.out.println(ani.getAnimalName());
                }
            }
        }
    }
}