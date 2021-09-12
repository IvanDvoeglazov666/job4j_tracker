package ru.job4j.tracker;

import java.util.Arrays;

public class SingleTracker {
    private Tracker tracker = new Tracker();



    public Item add(Item item) {
        return tracker.add(item);
    }

    public Item findById(int id) {
        return null;
    }

    public Item[] findAll() {
        return null;
    }

    public Item[] findByName(String key) {
        return null;
    }

    public boolean replace(int id, Item item) {
        return true;
    }

    public boolean delete(int id) {
        return true;
    }

    private int indexOf(int id) {
        return 0;
    }

}