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
}
