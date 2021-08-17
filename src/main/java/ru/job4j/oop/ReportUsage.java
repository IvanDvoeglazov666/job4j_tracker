package ru.job4j.oop;

public class ReportUsage {
    public static void main(String[] args) {
        JSONReport string = new JSONReport();
        string.generate("name", "body");
        System.out.println(string.generate("name ", "body "));
    }
}
