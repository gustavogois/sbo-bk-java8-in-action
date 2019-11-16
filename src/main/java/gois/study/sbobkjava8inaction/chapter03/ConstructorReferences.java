package gois.study.sbobkjava8inaction.chapter03;

import gois.study.sbobkjava8inaction.model.Apple;

import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorReferences {

    public static Apple createAnAppleInstanceUsingSupplier(Supplier<Apple> supplier) {
        return supplier.get();
    }
    public static Apple createAnAppleInstanceUsingSupplier(Function<Integer, Apple> f, int i) {
        return f.apply(i);
    }
}
