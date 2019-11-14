package gois.study.sbobkjava8inaction.chapter03;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
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

    public static <T, R> List<R> applyStringListToLenghtSlist(List<T> asList, Function<T, R> f) {
        List<R> result = new ArrayList<>();
        for (T t : asList) {
            result.add(f.apply(t));
        }
        return result;
    }
}
