package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Numbers {

    public static void main(String[] args) {
        List<Integer> num = List.of(-1, -2, 3, 4, 5, 6);
        List<Integer> rsl = num.stream().filter(x -> x > 0).collect(Collectors.toList());
        rsl.forEach(x -> System.out.println(x));

    }

}
