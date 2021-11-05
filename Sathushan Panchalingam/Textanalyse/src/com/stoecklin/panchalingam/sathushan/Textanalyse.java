package com.stoecklin.panchalingam.sathushan;

import java.io.*;
import java.util.*;

public class Textanalyse {

    private static final boolean DEBUG = true;

    public static void main(String[] args) throws IOException {
        System.out.println("Bespiel Datei: D:\\Test.txt\nBitte Dateipfad angeben:");
        BufferedReader fileInput = new BufferedReader(new InputStreamReader(System.in));
        String fileWay = fileInput.readLine();
        textAnalyzer(fileWay);
    }

    public static void textAnalyzer(String fileWay) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileWay))) {
            String fileText;
            while ((fileText = reader.readLine()) != null) {
                System.out.println(fileText);
                wordNumber(fileText);
                letterNumber(fileText);
                frequenceWord(fileText);
                frequenceLetter(fileText);
            }
        }
    }

    public static int wordNumber(String text) {
        int solution = 0;

        // Create String array after Space
        String[] textSplit = text.split("\\s+");
        for (int i = 0; i < textSplit.length; i++) {
            solution++;
        }
        if (solution > 1) {
            System.out.println("Es hat " + solution + " Wörter");
        } else {
            System.out.println("Es hat " + solution + " Wort");
        }
        return solution;
    }

    public static int letterNumber(String text) {
        int solution;

        // Count every letter except space
        solution = (int) text.chars().filter(ch -> ch != ' ').count();
        System.out.println("Es hat " + solution + " Buchstaben");
        return solution;
    }

    public static void frequenceWord(String text) {
        // Create Map
        Map<String, Integer> mapWord = new TreeMap<>();

        // Create Array after Space
        String textSplitArray[] = text.split(" ");
        for (int i = 0; i < textSplitArray.length; i++) {
            if (mapWord.containsKey(textSplitArray[i])) {
                mapWord.put(textSplitArray[i], mapWord.get(textSplitArray[i]) + 1);
            } else {
                mapWord.put(textSplitArray[i], 1);
            }
        }
        if (DEBUG) {
            // Loop to iterate over the elements of the map
            for (Map.Entry<String, Integer> resultWord : mapWord.entrySet()) {
                System.out.println(resultWord.getKey() + " - " + resultWord.getValue());
            }
        }
    }

    public static void frequenceLetter(String text) {

        // Create Map
        HashMap<Character, Integer> mapLetter = new HashMap<Character, Integer>();
        for (int i = 0; i < text.length(); i++) {
            Character letter = text.charAt(i);
            Integer frequence = mapLetter.get(letter);
            if (frequence != null) {
                mapLetter.put(letter, frequence + 1);
            } else {
                mapLetter.put(letter, 1);
            }
        }
        for (Map.Entry<Character, Integer> resultLetter : mapLetter.entrySet()) {
            System.out.println(resultLetter.getKey() + " - " + resultLetter.getValue());
        }
    }
}