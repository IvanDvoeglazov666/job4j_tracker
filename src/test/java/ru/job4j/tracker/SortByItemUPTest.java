package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SortByItemUPTest {

    @Test
    public void sortByItemUP() {
        Item one = new Item(10, "ivan");
        Item two = new Item(8, "kolya");
        Item three = new Item(3, "petya");
        List<Item> items = Arrays.asList(two, three, one);
        List<Item> ex = List.of(one, two, three);
        Collections.sort(items, new SortByItemUP());
        assertThat(ex, is(items));
    }
}
