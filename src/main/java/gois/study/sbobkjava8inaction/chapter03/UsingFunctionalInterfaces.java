package gois.study.sbobkjava8inaction.chapter03;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class UsingFunctionalInterfaces {

    public static <T> List<T> filterUsingPredicate(List<T> items, Predicate<T> p) {
        List<T> result = new ArrayList();
        for (T item : items) {
            if (p.test(item)) {
                result.add(item);
            }
        }
        return result;
    }

    public static <T> void forEachUsingConsumer(List<T> asList, Consumer<T> consumer) {
        for (T t : asList) {
            consumer.accept(t);
        }
    }
}
