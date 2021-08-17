package ru.job4j.oop;

public class JSONReport extends TextReport {
    @Override
    public String generate(String name, String body) {
        String first =  name + ": " + name;
        String second = body + ": " + body;
        return first + System.lineSeparator() + second;
    }


}
