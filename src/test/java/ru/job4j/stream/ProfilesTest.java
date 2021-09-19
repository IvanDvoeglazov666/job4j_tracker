package ru.job4j.stream;

import org.junit.Test;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ProfilesTest {

    @Test
    public void listAddress() {
        List<Address> exept = List.of(
                new Address("Perm", "Lenina", 4, 25),
                new Address("Bryansk", "Pik", 56, 2),
                new Address("Duba", "dds", 3, 4)
        );
        Profile one = new Profile(new Address("Perm", "Lenina", 4, 25), "Ivan");
        Profile two = new Profile(new Address("Bryansk", "Pik", 56, 2), "Petya");
        Profile three = new Profile(new Address("Duba", "dds", 3, 4), "Semen");
        List<Profile> pro = List.of(one, two, three);
        Profiles names = new Profiles();
        List<Address> rsl = names.collect(pro);
        assertThat(rsl, is(exept));

    }

    @Test
    public void addresDublicate() {
        List<Address> exept = List.of(
                new Address("Perm", "Lenina", 4, 25),
                new Address("Bryansk", "Pik", 56, 2),
                new Address("Duba", "dds", 3, 4),
                new Address("Perm", "Lenina", 4, 25)
        );
        Profiles names = new Profiles();
        List<Address> rsl = names.sorted(exept);
        List<Address> ex = List.of(new Address("Perm", "Lenina", 4, 25),
                new Address("Duba", "dds", 3, 4),
                new Address("Bryansk", "Pik", 56, 2)
                );
        assertThat(rsl, is(ex));
    }
}
