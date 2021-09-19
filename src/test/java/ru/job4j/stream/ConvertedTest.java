package ru.job4j.stream;

import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConvertedTest {
    @Test
    public void convertedListinMap() {
        Converted conv = new Converted();
        Student one = new Student(20, "ivan");
        Student two = new Student(21, "Petya");
        Student three = new Student(20, "Semen");
        Student four = new Student(20, "ivan");
        List<Student> students = List.of(one, two, three, four);
        Map<String, Student> rsl = conv.converted(students);
        Map<String, Student> exp = new HashMap<>();
        exp.put(one.getSurname(), one);
        exp.put(two.getSurname(), two);
        exp.put(three.getSurname(), three);
        assertThat(rsl, is(exp));

    }
}
