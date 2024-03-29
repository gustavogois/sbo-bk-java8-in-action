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

    @Test
    void filteringWithClientUsingAnnonymousClass() {
        List<Apple> applesFiltered = FilteringApples.filter(apples, new Predicate<Apple>() {
                    @Override
                    public boolean test(Apple apple) {
                        return apple.getWeight() > 5 ? true : false;
                    }
                });
                assertThat(applesFiltered.size()).isEqualTo(2);
    }

    @Test
    void filteringWithClientUsingLambda() {
        List<Apple> applesFiltered = FilteringApples.filter(apples, apple -> apple.getWeight() > 5 ? true : false);
        assertThat(applesFiltered.size()).isEqualTo(2);
    }

    @Test
    void printingApplesInDifferentWays() {
        List<String> prints = FilteringApples.printingApplesInDifferentWays(apples, new SimpleApplePrint());
        for (String print : prints) {
            assertThat(print).contains("Apple:");
        }
    }

    @Test
    void sortingUsingListComparator() {
        List<Apple> applesSorted = FilteringApples.sortingByWeightUsingListComparator(this.apples);
        for (int i = 0 ; i < applesSorted.size() - 1 ; i++) {
            Apple a1 = applesSorted.get(i);
            Apple a2 = applesSorted.get(i + 1);
            assertThat(a1.getWeight() < a2.getWeight());
        }
    }

    class FilteringByWeight implements Predicate<Apple> {

        @Override
        public boolean test(Apple apple) {
            return apple.getWeight() > 5 ? true : false;
        }
    }

    class SimpleApplePrint implements AppleFormatter {

        @Override
        public String accept(Apple apple) {
            return "Apple: " + apple.toString();
        }
    }
}