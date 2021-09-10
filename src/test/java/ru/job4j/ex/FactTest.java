package ru.job4j.ex;

import org.junit.Test;

public class FactTest {
    @Test(expected = IllegalArgumentException.class)
    public void fact() {
        Fact num = new Fact();
        num.calc(-10);
    }
}
