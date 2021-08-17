package ru.job4j.oop;

public class Battery {

    private int load;

    public Battery(int size) {
        this.load = size;
    }

    public void exchange (Battery another) {
        another.load = another.load + this.load;
        this.load = 0;
    }
    public static void main(String[] args) {
        Battery one = new Battery(10);
        Battery two = new Battery(5);
        one.exchange(two);
        System.out.println("Battery charge 1: " + one.load);
        System.out.println("Battery charge 2: " + two.load);

    }
}
