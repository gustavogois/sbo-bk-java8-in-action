package gois.study.sbobkjava8inaction.chapter05;

import gois.study.sbobkjava8inaction.model.Dish;

import java.util.List;
import java.util.stream.IntStream;

public class NumericStream {
    public static int sumCalories(List<Dish> menu) {
        return menu.stream()
                .mapToInt(Dish::getCalories)
                .sum();
    }

    public static void printAllEvenNumbers(int start, int end) {
        IntStream
                .rangeClosed(start, end)
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
    }
}
