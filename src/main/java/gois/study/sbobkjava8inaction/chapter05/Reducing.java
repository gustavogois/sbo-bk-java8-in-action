package gois.study.sbobkjava8inaction.chapter05;

import java.util.List;

public class Reducing {
    public static int sumAllElements(List<Integer> list) {
        return list.stream()
                //.reduce(0, (a, b) -> a + b);
                .reduce(0, Integer::sum);
    }
}
