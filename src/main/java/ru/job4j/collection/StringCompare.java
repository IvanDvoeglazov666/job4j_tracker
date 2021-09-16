package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int rsl = 0;
        int num = Math.min(left.length(), right.length());
        for (int index = 0; index < num; index++) {
            char first = left.charAt(index);
            char second = right.charAt(index);
            int compare = Character.compare(first, second);
            if(compare != 0) {
                rsl = compare;
            }
        }
        return rsl;

    }
}

