package com.stoecklin.panchalingam.sathushan;

import org.junit.jupiter.api.Test;

import org.junit.Assert;

class TextanalyseTest {

    @Test
    void wordNumber1() {
        Assert.assertEquals(9, Textanalyse.wordNumber("Auf dem Tisch steht ein Würfel und ein Buch"));
    }

    @Test
    void wordNumber2() {
        Assert.assertEquals(3, Textanalyse.wordNumber("Hey wie gehts"));
    }

    @Test
    void letterNumber1() {
        Assert.assertEquals(35, Textanalyse.letterNumber("Auf dem Tisch steht ein Würfel und ein Buch"));
    }
    
    @Test
    void letterNumber2() {
        Assert.assertEquals(11, Textanalyse.letterNumber("Hey wie gehts"));
    }
    
    @Test
    void FrequenceTest() {
        Textanalyse.frequenceLetter("Test Versuch");
    }
}
