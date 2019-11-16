package gois.study.sbobkjava8inaction.chapter05;

import gois.study.sbobkjava8inaction.model.Dish;

import java.util.List;
import java.util.stream.Collectors;

public class Filtering {
    public static List<Dish> filterVegetarian(List<Dish> menu) {
        return menu.stream()
                .filter(Dish::isVegetarian)
                .collect(Collectors.toList());
    }

    public static List<Integer> evenNumbersWithNoDuplicates(List<Integer> list) {
        return list.stream()
                .filter(i -> i % 2 == 0)
                .distinct()
                .collect(Collectors.toList());
    }

    public static List<Dish> selectFirstXDishesWithMoreThanYCalories(List<Dish> menu, int nFirstDishes, int calories) {
        return menu.stream()
                .filter(dish -> dish.getCalories() > calories)
                .limit(nFirstDishes)
                .collect(Collectors.toList());
    }
}
