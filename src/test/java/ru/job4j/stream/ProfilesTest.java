package ru.job4j.stream;

import org.junit.Test;
import java.util.List;
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
}
