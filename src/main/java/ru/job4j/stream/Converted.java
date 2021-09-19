package ru.job4j.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Converted {

    public Map<String, Student> converted(List<Student> list) {
        return list.stream()
                .collect(Collectors.toMap(
                e -> e.getSurname(),
                e -> e,
                (e1, e2) -> e1.equals(e2) ? e1 : e2));
    }
}
