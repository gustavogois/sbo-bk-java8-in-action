package gois.study.sbobkjava8inaction.chapter05;

import gois.study.sbobkjava8inaction.model.Dish;
import org.junit.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class ReducingTest {

    @Test
    public void sumAllElements() {
        int result = Reducing.sumAllElements(Arrays.asList(1, 2, 3));

        assertThat(result).isEqualTo(6);
    }

    @Test
    public void findMax() {
        int max = Reducing.findMax(Arrays.asList(1, 3, 2));

        assertThat(max).isEqualTo(3);
    }

    @Test
    public void countUsingMapAndReduce() {
        int result = Reducing.countUsingMapAndReduce(Dish.getMenu());

        assertThat(result).isEqualTo(9);
    }
}