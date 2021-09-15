package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        char[] lef = left.toCharArray();
        char[] rig = right.toCharArray();
        for(int index = 0; index < lef.length; index++) {
            for (int i = index; i < rig.length; i++) {
               return Integer.compare(left.charAt(index), right.charAt(i));
            }
        }
        return -1;
    }
}

