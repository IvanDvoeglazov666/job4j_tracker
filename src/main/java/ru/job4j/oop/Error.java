package ru.job4j.oop;

public class Error {

    private boolean active;

    private int status;

    private String message;

      public Error() {

      }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.message = message;
        this.status = status;
    }

    public void info() {
        System.out.println("Activ: " + active);
        System.out.println("Message: " + message);
        System.out.println("Status: " + status);

    }

    public static void main(String[] args) {
        Error one = new Error(false, 1, "tools");
        one.info();
        Error two = new Error();
        two.info();
    }

}
