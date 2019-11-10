package gois.study.sbobkjava8inaction.chapter02;

import gois.study.sbobkjava8inaction.model.Apple;

import java.util.ArrayList;
import java.util.Comparator;
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

    public static List<String> printingApplesInDifferentWays(List<Apple> apples, AppleFormatter appleFormatter) {
        List<String> prints = new ArrayList<>();
        for (Apple apple : apples) {
            prints.add(appleFormatter.accept(apple));
        }
        return prints;
    }

    public static List<Apple> sortingByWeightUsingListComparator(List<Apple> apples) {
        apples.sort(new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return o1.getWeight().compareTo(o2.getWeight());
            }
        });

        return apples;
    }
}
