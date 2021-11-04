package ch.stoecklin;

import ch.stoecklin.models.World;

import java.util.Scanner;

public class Main {

    private static Scanner input;
    private static World world;
    public static void main(String[] args) {
	    input = new Scanner(System.in);
        createWorld(input.nextLine());
        world.createContinent("Europe");
        world.createContinent("Asia");
        world.showAllContinents();
    }

    public static void createWorld(String worldName) {
        world = new World(worldName);
    }
}
