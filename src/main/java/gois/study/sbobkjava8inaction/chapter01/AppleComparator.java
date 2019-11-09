package gois.study.sbobkjava8inaction.chapter01;

import gois.study.sbobkjava8inaction.model.Apple;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;

public class AppleComparator {
    public List<Apple> orderNoUsingJava8(List<Apple> apples) {
        Collections.sort(apples, new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return o1.getWeight().compareTo(o2.getWeight());
            }
        });
        return apples;
    }

    public List<Apple> orderUsingJava8(List<Apple> apples) {
        apples.sort(comparing(Apple::getWeight));
        return apples;
    }
}
