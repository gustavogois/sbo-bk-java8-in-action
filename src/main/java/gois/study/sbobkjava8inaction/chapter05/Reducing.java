package gois.study.sbobkjava8inaction.chapter05;

import gois.study.sbobkjava8inaction.model.Dish;

import java.util.List;

public class Reducing {
    public static int sumAllElements(List<Integer> list) {
        return list.stream()
                //.reduce(0, (a, b) -> a + b);
                .reduce(0, Integer::sum);
    }

    public static int findMax(List<Integer> list) {
        return list.stream()
                .reduce(Integer::max)
                .get();
    }

    public static int countUsingMapAndReduce(List<Dish> menu) {

        return menu.stream()
                .map(dish -> 1)
                .reduce(Integer::sum)
                .get();
        //return menu.stream().count();

    }
}
