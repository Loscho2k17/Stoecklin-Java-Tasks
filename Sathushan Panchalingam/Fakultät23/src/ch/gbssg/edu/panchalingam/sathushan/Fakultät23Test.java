package ch.gbssg.edu.panchalingam.sathushan;

import org.junit.jupiter.api.Test;

import org.junit.Assert;

class Fakultät23Test {

    @Test
    public void Fakultät0() {
        Assert.assertEquals(1, Fakultät23.n23(0));
    }

    @Test
    public void Fakultät1() {
        Assert.assertEquals(1, Fakultät23.n23(1));
    }

    @Test
    public void Fakultät2() {
        Assert.assertEquals(1, Fakultät23.n23(2));
    }

    @Test
    public void Fakultät5() {
        Assert.assertEquals(5, Fakultät23.n23(5));
    }

    @Test
    public void Fakultät10() {
        Assert.assertEquals(35, Fakultät23.n23(10));
    }

    @Test
    public void Fakultät20() {
        Assert.assertEquals(1616615, Fakultät23.n23(20));
    }

    @Test
    public void Fakultät30() {
        Assert.assertEquals(26957055125L, Fakultät23.n23(30));
    }
}
