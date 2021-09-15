package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SortByItemDownTest {

    @Test
    public void sortByItemDown() {
        Item one = new Item(10, "ivan");
        Item two = new Item(2, "kolya");
        Item three = new Item(3, "petya");
        List<Item> items = Arrays.asList(two, three, one);
        List<Item> ex = List.of(three, two, one);
        Collections.sort(items, new SortByItemDown());
        assertThat(ex, is(items));
            }
}
