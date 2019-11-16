package gois.study.sbobkjava8inaction.chapter05;

import gois.study.sbobkjava8inaction.model.Dish;
import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class FilteringTest {

    @Test
    public void filterVegetarian() {
        List<Dish> dishesFiltered = Filtering.filterVegetarian(Dish.getMenu());
        assertThat(dishesFiltered.size()).isEqualTo(4);
    }
}