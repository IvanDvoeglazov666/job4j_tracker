package ru.job4j.tracker;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SortByItemDownTest {

    @Test
    public void sortByItemDown() {
        List<Item> res = new ArrayList<>();
        Item one = new Item(10, "ivan", "12");
        Item two = new Item(3, "petya", "45");
        Item three = new Item(8, "kolya", "1234");
        res.add(one);
        res.add(two);
        res.add(three);
        List<Item> ex = new ArrayList<>();
        ex.add(one);
        ex.add(three);
        ex.add(two);
        Collections.sort(res, new SortByItemDown());
        assertThat(ex, is(res));
    }
}
