package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Item {
    private int id;
    private String name;
    private final LocalDateTime currentDateTime = LocalDateTime.now();
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    public Item() {
    }

    public Item(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Item(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getCreated() {
        return currentDateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return id == item.id && Objects.equals(name, item.name) && Objects.equals(currentDateTime, item.currentDateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, currentDateTime);
    }
    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", created=" + currentDateTime.format(FORMATTER) +
                '}';
    }


}