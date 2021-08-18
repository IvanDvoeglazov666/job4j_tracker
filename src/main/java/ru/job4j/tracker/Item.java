package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Item {
    private int id;
    private String name;
    private LocalDateTime currentDateTime = LocalDateTime.now();
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    private String currentDateTimeFormat = currentDateTime.format(formatter);


    public Item() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return id == item.id && Objects.equals(name, item.name) && Objects.equals(currentDateTime,
                item.currentDateTime) && Objects.equals(formatter, item.formatter)
                && Objects.equals(currentDateTimeFormat, item.currentDateTimeFormat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, currentDateTime, formatter, currentDateTimeFormat);
    }

    public Item(int id, String name, String currentDateTimeFormat) {
        this.id = id;
        this.name = name;
        this.currentDateTimeFormat = currentDateTimeFormat;
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

   public String getCurrentDateTimeFormat() {
        return currentDateTimeFormat;
   }
}