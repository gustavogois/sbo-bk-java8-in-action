package gois.study.sbobkjava8inaction.chapter02;

import gois.study.sbobkjava8inaction.model.Apple;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FilteringApples {

    public static List<Apple> filter(List<Apple> apples, Predicate<Apple> predicate) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : apples) {
            if (predicate.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }
}
