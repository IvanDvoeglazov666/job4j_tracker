package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tracker {
    private final ArrayList<Item> items = new ArrayList<>();
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items.add(item);
        return item;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items.get(index) : null;
    }

    public List<Item> findAll() {
         return items;
    }

    public List<Item> findByName(String key) {
        List<Item> res = new ArrayList<>();
       for (int index = 0; index < items.size(); index++) {
            Item item = items.get(index);
            if(item.getName().equals(key)) {
                res.add(item);
                }
        }
        return res;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items.get(index).getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        boolean result = index != -1;
        if (result) {
            item.setId(id);
            items.add(index, item);
        }
        return result;
    }

    public boolean delete(int id) {
        boolean rsl = false;
        int index = indexOf(id);
        if (index != -1) {
            items.add(index,null);
            System.arraycopy(items, index + 1, items, index, items.size());
            rsl = true;
        }
       return rsl;
    }




}