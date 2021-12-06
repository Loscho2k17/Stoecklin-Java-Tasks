package ch.gbssg.edu.panchalingam.sathushan;

import org.junit.jupiter.api.Test;

import org.junit.Assert;

class Fakult�t23Test {

    @Test
    public void Fakult�t0() {
        Assert.assertEquals(1, Fakult�t23.n23(0));
    }

    @Test
    public void Fakult�t1() {
        Assert.assertEquals(1, Fakult�t23.n23(1));
    }

    @Test
    public void Fakult�t2() {
        Assert.assertEquals(1, Fakult�t23.n23(2));
    }

    @Test
    public void Fakult�t5() {
        Assert.assertEquals(5, Fakult�t23.n23(5));
    }

    @Test
    public void Fakult�t10() {
        Assert.assertEquals(35, Fakult�t23.n23(10));
    }

    @Test
    public void Fakult�t20() {
        Assert.assertEquals(1616615, Fakult�t23.n23(20));
    }

    @Test
    public void Fakult�t30() {
        Assert.assertEquals(26957055125L, Fakult�t23.n23(30));
    }
}
