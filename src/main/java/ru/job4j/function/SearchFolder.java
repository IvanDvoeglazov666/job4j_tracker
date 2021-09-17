package ru.job4j.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class SearchFolder {

    public static List<Folder> filter(List<Folder> list, Predicate<Folder> predicate) {
        List<Folder> rsl = new ArrayList<>();
        for (Folder index: list) {
            if(predicate.test(index)) {
                rsl.add(index);
            }
        }

        return rsl;
    }
}
