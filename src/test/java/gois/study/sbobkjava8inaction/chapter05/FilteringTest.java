package gois.study.sbobkjava8inaction.chapter05;

import gois.study.sbobkjava8inaction.model.Dish;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class FilteringTest {

    @Test
    public void filterVegetarian() {
        List<Dish> dishesFiltered = Filtering.filterVegetarian(Dish.getMenu());

        assertThat(dishesFiltered.size()).isEqualTo(4);
    }

    @Test
    public void evenNumbersWithNoDuplicates() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 4, 5, 5, 6, 7, 8, 9);
        List<Integer> listFiltered = Filtering.evenNumbersWithNoDuplicates(list);

        assertThat(listFiltered.size()).isEqualTo(4);

    }
}