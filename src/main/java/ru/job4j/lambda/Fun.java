package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Fun {

    public List<Double> diapason(int start, int end, Function<Double, Double> func) {
        List<Double> res = new ArrayList<>();
        for (int index = start; index < end; index++) {
            res.add(func.apply((double) index));
        }
        return res;
    }
}
