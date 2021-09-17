package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Fun {

    public List<Double> diapason(int start, int end, Function<Double, Double> func) {
        List<Double> res = new ArrayList<>();
        Function<Double, Double> er = (x) -> func.apply(x);
        for (int index = start; index < end; index++) {
            res.add(er.apply((double) index));
        }
        return res;
    }
}
