package ru.job4j.oop;

public class Transport {

    public static void main(String[] args) {
        Train a = new Train();
        Bus b = new Bus();
        Аirplane c = new Аirplane();
        Vehicle one = a;
        Vehicle two = b;
        Vehicle three = c;
        Vehicle [] vehicl = new Vehicle[] {one, two, three};
        for (Vehicle i : vehicl) {
            i.move();
        }
    }
}
