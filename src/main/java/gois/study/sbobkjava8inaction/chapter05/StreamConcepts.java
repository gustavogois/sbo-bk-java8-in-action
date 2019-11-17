package gois.study.sbobkjava8inaction.chapter05;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class StreamConcepts {
    public static List<String> returnListUniqueCharacters(List<String> words) {

        return words.stream()
                .map(word -> word.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(toList());
    }

    public static List<Integer> squareNumbers(List<Integer> asList) {
        return asList.stream()
                .map(n -> n * n)
                .collect(toList());
    }

    public static List<int[]> pairNumbers(List<Integer> list1, List<Integer> list2) {
        return list1.stream()
                .flatMap(i1 -> list2.stream()
                                .map(i2 -> new int[]{i1, i2}))
                .collect(toList());
    }

    public static List<int[]> onlyPairsSumDivisibleBy3(List<Integer> list1, List<Integer> list2) {
        return list1.stream()
                .flatMap(i1 -> list2.stream()
                        .filter( i2 -> (i1 + i2) % 3 == 0 )
                        .map(i2 -> new int[]{i1, i2}))
                .collect(toList());

    }
}
