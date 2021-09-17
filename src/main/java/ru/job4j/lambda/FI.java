package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FI {
    public static void main(String[] args) {
        String[] arrays = {"Мы, многонациональный народ Российской Федерации",
                "соединенные общей судьбой на своей земле", "утверждая права и свободы человека",
                 "гражданский мир и согласие"};

        Comparator<String> cmpTextUp = (left, right) -> left.compareTo(right);
        Comparator<String> cmpTextDown = (left, right) -> right.compareTo(left);
        Arrays.sort(arrays, cmpTextUp);
        for (String index: arrays) {
            System.out.println(index);
        }
        Arrays.sort(arrays, cmpTextDown);
        for (String index: arrays) {
            System.out.println(index);
        }
    }

}