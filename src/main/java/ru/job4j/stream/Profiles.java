package ru.job4j.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Profiles {
    public List<Address> collect(List<Profile> profiles) {
        return profiles.stream()
                .map(Profile::getAddress)
                .collect(Collectors.toList());
    }

    public List<Address> sorted(List<Address> addresses) {
        Comparator<Address> comparator = (o1, o2) -> o2.getCity().compareTo(o1.getCity());
        List<Address> rsl = addresses.stream()
                .sorted(comparator)
                .distinct()
                .collect(Collectors.toList());
        return rsl;
    }
}
