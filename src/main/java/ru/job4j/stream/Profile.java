package ru.job4j.stream;

public class Profile {
    private final Address address;
    private String name;

    public Profile(Address address, String name) {
        this.address = address;
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}