package gois.study.sbobkjava8inaction.chapter05;

import gois.study.sbobkjava8inaction.model.Dish;

import java.util.List;

public class NumericStream {
    public static int sumCalories(List<Dish> menu) {
        return menu.stream()
                .mapToInt(Dish::getCalories)
                .sum();
    }
}
