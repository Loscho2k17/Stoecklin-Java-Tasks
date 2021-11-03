package ch.stoecklin.tests;

import org.junit.jupiter.api.Test;

import static ch.stoecklin.Main.n23;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainTest {

    @Test
    void n23of0equals1(){
        assertEquals(1, n23(0));
    }

    @Test
    void n23of1equals1(){
        assertEquals(1, n23(1));
    }

    @Test
    void n23of10equals35(){
        assertEquals(35, n23(10));
    }

    @Test
    void n23of20equals1616615(){
        assertEquals(1616615, n23(20));
    }

    @Test
    void n23of30equals26957055125(){
        long expectedResult = Long.parseLong("26957055125");
        assertEquals(expectedResult, n23(30));
    }
}
