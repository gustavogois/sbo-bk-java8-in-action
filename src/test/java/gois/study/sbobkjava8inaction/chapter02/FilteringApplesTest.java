package gois.study.sbobkjava8inaction.chapter02;

import gois.study.sbobkjava8inaction.model.Apple;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import static org.assertj.core.api.Assertions.assertThat;

class FilteringApplesTest {

    List<Apple> apples;

    @BeforeEach
    void setUp() {
        this.apples = Arrays.asList(new Apple(10, "white"), new Apple(5, "white"),
                new Apple(7, "green"));
    }

    @Test
    void filtering() {
        List<Apple> applesFiltered = FilteringApples.filter(apples, new FilteringByWeight());
        assertThat(applesFiltered.size()).isEqualTo(2);
    }

    class FilteringByWeight implements Predicate<Apple> {

        @Override
        public boolean test(Apple apple) {
            return apple.getWeight() > 5 ? true : false;
        }
    }
}