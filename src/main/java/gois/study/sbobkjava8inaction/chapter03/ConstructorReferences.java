package gois.study.sbobkjava8inaction.chapter03;

import gois.study.sbobkjava8inaction.model.Apple;

import java.util.function.Supplier;

public class ConstructorReferences {
    public static Apple createAnAppleInstanceUsingSupplier(Supplier<Apple> supplier) {
        return supplier.get();
    }
}
