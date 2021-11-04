package ch.stoecklin;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static final HashMap<String, Integer> countWordsFromSentence = new HashMap<>();
    public static final HashMap<String, Integer> countLettersFromSentence = new HashMap<>();

    public static void main(String[] args) throws IOException, URISyntaxException {
        String test = "Dieser Satz dient nur als Test.";
        String test2 = Files.readString(Path.of("src\\ch\\stoecklin\\resources\\text.txt"));

        countWords(test);
        countLetters(test);

        System.out.println(countWordsFromSentence);
        System.out.println(countLettersFromSentence);

        countLettersFromSentence.clear();
        countWordsFromSentence.clear();

        countWords(test2);
        countLetters(test2);

        System.out.println(countWordsFromSentence);
        System.out.println(countLettersFromSentence);
    }

    public static void countWords(String sentence) {
        for (String word : List.of(sentence.split("[^(?!A-Za-z_äÄöÖüÜ)]"))) {
            countWordsFromSentence.put(word, countWordsFromSentence.get(word) == null ? 1 : countWordsFromSentence.get(word) + 1);
        }
    }

    public static void countLetters(String sentence) {
        for (char letter : sentence.toCharArray()) {
            if (!String.valueOf(letter).matches("[^A-Za-z_äÄöÖüÜ]")) {
                countLettersFromSentence.put(String.valueOf(letter), countLettersFromSentence.get(String.valueOf(letter)) == null ? 1 : countLettersFromSentence.get(String.valueOf(letter)) + 1);
            }
        }
    }
}
