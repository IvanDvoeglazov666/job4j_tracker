package ru.job4j.oop;

public class Battery {

    private int load;

    public Battery(int size) {
        this.load = size;
    }

    //Создать метод public void exchange(Battery another).
    // Этот метод должен списывать заряд из батареи
    // у кого вызывали метод exchange и добавить к объекту another.

    public void exchange (Battery another) {
       this.load = another.load - this.load;

    }
}
