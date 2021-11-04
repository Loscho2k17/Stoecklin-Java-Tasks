package ch.stoecklin.tests;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static ch.stoecklin.Main.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    private int sum = 0;

    @Test
    void calcFrequencyOfWords() {
        countWords("Auf dem Tisch steht ein Würfel und ein Buch.");
        countWordsFromSentence.forEach((k, v) -> {
            sum = sum + v;
        });
        assertEquals(9, sum);
        countWordsFromSentence.clear();
    }

    @Test
    void calcFrequencyOfLetters() {
        countLetters("Auf dem Tisch steht ein Würfel und ein Buch.");
        countLettersFromSentence.forEach((k, v) -> {
            sum = sum + v;
        });
        assertEquals(35, sum);
        countLettersFromSentence.clear();
    }

    @Test
    void calcFrequencyOfWordsFromFile() throws IOException {
        countWords(Files.readString(Path.of("src\\ch\\stoecklin\\resources\\testText.txt")));
        countWordsFromSentence.forEach((k, v) -> {
            sum = sum + v;
        });
        assertEquals(9, sum);
        countWordsFromSentence.clear();
    }

    @Test
    void calcFrequencyOfLettersFromFile() throws IOException {
        countLetters(Files.readString(Path.of("src\\ch\\stoecklin\\resources\\testText.txt")));
        countLettersFromSentence.forEach((k, v) -> {
            sum = sum + v;
        });
        assertEquals(35, sum);
        countLettersFromSentence.clear();
    }
}

