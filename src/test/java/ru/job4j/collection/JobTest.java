package ru.job4j.collection;

import org.junit.Test;
import java.util.Comparator;

import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;

public class JobTest {
    @Test
    public void whenCompatorByName() {
        Comparator<Job> cmdNameUP = new JobDescByNameUP();
        int rsl = cmdNameUP.compare(
                new Job("ivan", 4),
                new Job("petya", 21)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorByNameDown() {
        Comparator<Job> cmdNameUP = new JobDescByNameDown();
        int rsl = cmdNameUP.compare(
                new Job("ivan", 4),
                new Job("petya", 21)
        );
        assertThat(rsl, lessThan(8));
    }

    @Test
    public void whenCompatorByPriorityUp() {
        Comparator<Job> cmdNameUP = new JobDescByPriorityUP();
        int rsl = cmdNameUP.compare(
                new Job("ivan", 4),
                new Job("petya", 21)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorByPriorityDown() {
        Comparator<Job> cmdNameUP = new JobDescByPriorityDown();
        int rsl = cmdNameUP.compare(
                new Job("ivan", 4),
                new Job("petya", 21)
        );
        assertThat(rsl, lessThan(2));
    }

    @Test
    public void whenCompatorByNameUPByPriorityUp() {
        Comparator<Job> cmdNameUP = new JobDescByNameUP().thenComparing(new JobDescByPriorityUP());
        int rsl = cmdNameUP.compare(
                new Job("ivan", 4),
                new Job("petya", 21)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorByNameDownByPriorityDown() {
        Comparator<Job> cmdNameUP = new JobDescByNameDown().thenComparing(new JobDescByPriorityDown());
        int rsl = cmdNameUP.compare(
                new Job("ivan", 4),
                new Job("petya", 21)
        );
        assertThat(rsl, lessThan(8));
    }



}