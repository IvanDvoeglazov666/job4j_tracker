package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11.");
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            String player = turn ? "Первый игрок" : "Второй игрок";
            System.out.println(player + " введите число от 1 до 3:");
            System.out.println("Колличесвто спичек на столе: " + count);
            int matches = Integer.parseInt(input.nextLine());
            turn = !turn;
            for(int index = 0; index < count; count++) {
                if (matches <= 3 && matches != 0) {
                    count = count - matches;
                    break;
                }
                           }
        }
        if (!turn) {
            System.out.println("Выиграл первый игрок");
        } else {
            System.out.println("Выиграл второй игрок");
        }
    }
}
