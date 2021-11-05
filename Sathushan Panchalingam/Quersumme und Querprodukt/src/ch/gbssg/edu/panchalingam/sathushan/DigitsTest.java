package ch.gbssg.edu.panchalingam.sathushan;

import org.junit.jupiter.api.Test;

import org.junit.Assert;

class DigitsTest {

    @Test
    void test100() {
        Assert.assertEquals(12, Digits.querBerechnungResultat(100));
    }

    @Test
    void test1000000() {
        Assert.assertEquals(309, Digits.querBerechnungResultat(1000000));
    }

    @Test
    void test5000000() {
        Assert.assertEquals(742, Digits.querBerechnungResultat(5000000));
    }
    
//    @Test
//    void test1000000000() {
//        Assert.assertEquals(5814, Digits.querBerechnungResultat(1000000000));
//    }
//    
//    @Test
//    void test5000000000() {
//        Assert.assertEquals(742, Digits.querBerechnungResultat(5000000000));
//    }
//
//     @Test
//    void test10000000000() {
//        Assert.assertEquals(742, Digits.querBerechnungResultat(10000000000));
//    }
}
