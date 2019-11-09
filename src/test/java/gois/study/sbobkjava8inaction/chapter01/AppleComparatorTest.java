package gois.study.sbobkjava8inaction.chapter01;

import gois.study.sbobkjava8inaction.model.Apple;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class AppleComparatorTest {

    List<Apple> apples;

    @BeforeEach
    void setUp() {
        this.apples = Arrays.asList(new Apple(10, "white"), new Apple(5, "white"),
                new Apple(7, "green"));
    }

    @Test
    void orderByWeightNoJava8() {

        List<Apple> apples = new AppleComparator().orderNoUsingJava8(this.apples);

        assertThat(apples).isSortedAccordingTo(new Comparator<Apple>() {

            @Override
            public int compare(Apple o1, Apple o2) {
                return o1.getWeight().compareTo(o2.getWeight());
            }
        });

    }

    @Test
    void orderByWeightUsingJava8() {

        List<Apple> apples = new AppleComparator().orderUsingJava8(this.apples);

        assertThat(apples).isSortedAccordingTo(new Comparator<Apple>() {

            @Override
            public int compare(Apple o1, Apple o2) {
                return o1.getWeight().compareTo(o2.getWeight());
            }
        });

    }
}