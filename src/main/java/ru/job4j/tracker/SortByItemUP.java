package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortByItemUP implements Comparator<Item> {
    @Override
    public int compare(Item first, Item second) {
        return second.getName().compareTo(first.getName());
    }

    public static void main(String[] args) {
        List<Item> res = new ArrayList<>();
        res.add(new Item(10, "ivan", "12"));
        res.add(new Item(3, "petya", "45"));
        res.add(new Item(8, "kolya", "1234"));
        Collections.sort(res, new SortByItemUP());
        System.out.println(res);
    }
}
