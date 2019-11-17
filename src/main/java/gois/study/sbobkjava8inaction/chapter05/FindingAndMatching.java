package gois.study.sbobkjava8inaction.chapter05;

import gois.study.sbobkjava8inaction.model.Dish;

import java.util.List;
import java.util.Optional;

public class FindingAndMatching {
    public static boolean hasVegetarian(List<Dish> menu) {
        return menu.stream()
                .anyMatch(Dish::isVegetarian);
    }

    public static boolean isHealthy(List<Dish> menu) {
        //return menu.stream()
        //        .allMatch(dish -> dish.getCalories() < 1000);
        return menu.stream()
                .noneMatch(dish -> dish.getCalories() >= 1000);
    }

    public static Optional<Dish> findAVegetarianDish(List<Dish> menu) {
        /*return menu.stream()
                .filter(Dish::isVegetarian)
                .findFirst();*/
        return menu.stream()
                .filter(Dish::isVegetarian)
                .findAny();
        /*Finding the first element is more constraining in parallel. If you don’t care about which element is
            returned, use findAny because it’s less constraining when using parallel streams.
         */
    }
}
