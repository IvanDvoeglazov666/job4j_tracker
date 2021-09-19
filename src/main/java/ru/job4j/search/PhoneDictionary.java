package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        Predicate<Person> combine = (person) -> person.getName().contains(key);
        Predicate<Person> combineTwo = (person) -> person.getSurname().contains(key);
        Predicate<Person> combinThree = (person) -> person.getPhone().contains(key);
        Predicate<Person> combinFour = (person) -> person.getAddress().contains(key);
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (combine.test(person) || combineTwo.test(person) || combinThree.test(person)
                    || combinFour.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}
