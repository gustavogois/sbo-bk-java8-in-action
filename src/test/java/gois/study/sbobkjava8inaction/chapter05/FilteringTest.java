package gois.study.sbobkjava8inaction.chapter05;

import gois.study.sbobkjava8inaction.model.Dish;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.*;

public class FilteringTest {

    @Test
    public void filterVegetarian() {
        List<Dish> dishesFiltered = Filtering.filterVegetarian(Dish.getMenu());

        assertThat(dishesFiltered.size()).isEqualTo(4);
        // With Hamcrest
        List<Dish.Type> typeValues = dishesFiltered.stream().map(Dish::getType).collect(Collectors.toList());
        org.hamcrest.MatcherAssert.assertThat(typeValues, everyItem(equalTo(Dish.Type.OTHER)));
    }

    @Test
    public void evenNumbersWithNoDuplicates() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 4, 5, 5, 6, 7, 8, 9);
        List<Integer> listFiltered = Filtering.evenNumbersWithNoDuplicates(list);

        assertThat(listFiltered.size()).isEqualTo(4);
    }

    @Test
    public void selectFirstXDishesWithMoreThanYCalories() {
        List<Dish> dishesFiltered = Filtering
                 .selectFirstXDishesWithMoreThanYCalories(Dish.getMenu(), 3, 300);

        assertThat(dishesFiltered.size()).isEqualTo(3);
        assertThat(dishesFiltered.get(0).getCalories()).isGreaterThan(300);

    }

    @Test
    public void skipFirstXDishesWithMoreThanYCalories() {
        List<Dish> dishesFiltered = Filtering
                .skipFirstXDishesWithMoreThanYCalories(Dish.getMenu(), 3, 300);

        assertThat(dishesFiltered.size()).isEqualTo(4);
        assertThat(dishesFiltered.get(0).getCalories()).isGreaterThan(300);

    }

    @Test
    public void filterFirstXMealDishes() {
        List<Dish> dishesFiltered = Filtering
                .filterFirstXMealDishes(Dish.getMenu(), 2);

        assertThat(dishesFiltered.size()).isEqualTo(2);
        assertThat(dishesFiltered.get(0).isVegetarian());
    }
}