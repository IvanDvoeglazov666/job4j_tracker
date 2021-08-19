package ru.job4j.io;

import java.util.Scanner;
import java.util.Random;

public class MagicBall {

    public static void main(String[] args) {
        Scanner one = new Scanner(System.in);
        System.out.println("Я великий Оракул. Что ты хочешь узнать? ");
        String ds = one.nextLine();
        int answer = new Random().nextInt(3);
        System.out.println("Вопрос: " + ds);
        if (answer == 0) {
            System.out.println("Ответ: ДА");
        } else if (answer == 1) {
            System.out.println("Ответ: НЕТ");
        } else {
            System.out.println("Ответ: Может быть!");
        }

    }
}
