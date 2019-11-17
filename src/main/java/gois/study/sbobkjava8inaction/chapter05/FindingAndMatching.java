package gois.study.sbobkjava8inaction.chapter05;

import gois.study.sbobkjava8inaction.model.Dish;

import java.util.List;

public class FindingAndMatching {
    public static boolean hasVegetarian(List<Dish> menu) {
        return menu.stream()
                .anyMatch(Dish::isVegetarian);
    }
}
