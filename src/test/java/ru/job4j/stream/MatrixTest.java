package ru.job4j.stream;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MatrixTest {
    @Test
    public void converMatrixinList() {
        Matrix matrix = new Matrix();
        List<List<Integer>> list = List.of(
                List.of(1, 2),
                List.of(3, 4));
        List<Integer> exp = List.of(1, 2, 3, 4);
        List<Integer> rsl = matrix.converted(list);
        assertThat(rsl, is(exp));
    }
}
