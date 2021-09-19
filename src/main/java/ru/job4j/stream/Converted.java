package ru.job4j.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Converted {

    public Map<String, Student> converted(List<Student> list) {
        return list.stream().distinct().collect(Collectors.toMap(
                e -> e.getSurname(),
                e -> e));
    }
}
