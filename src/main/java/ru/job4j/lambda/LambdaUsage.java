package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Predicate;

public class LambdaUsage {
    public static void main(String[] args) {
        String[] arrays = {"Hello", "Hi", "Go", "Mid"};
        Comparator<String> printInfo = (left, right) -> {
          System.out.println("START: " + right.length() + " " + left.length() + " " + "FAINL");
          return Integer.compare(right.length(), left.length());
        };
        Arrays.sort(arrays, printInfo);
    }
}
