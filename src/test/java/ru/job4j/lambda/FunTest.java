package ru.job4j.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class FunTest {

    @Test
    public void whenLinearFunctionThenLinearResults() {
        Fun function = new Fun();
        List<Double> result = function.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenLinearFunctionThenQuadraticResults() {
        Fun function = new Fun();
        List<Double> result = function.diapason(5, 8, x -> x * x);
        List<Double> expected = Arrays.asList(25D, 36D, 49D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenLinearFunctionThenIndicativeResults() {
        Fun function = new Fun();
        List<Double> result = function.diapason(5, 8, x -> Math.pow(x,x));
        List<Double> expected = Arrays.asList(3125D, 46656D, 823543D);
        assertThat(result, is(expected));
    }
}
