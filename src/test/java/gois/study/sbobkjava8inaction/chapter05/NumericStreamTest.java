package gois.study.sbobkjava8inaction.chapter05;

import gois.study.sbobkjava8inaction.model.Dish;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NumericStreamTest {

    @Test
    public void sumCalories() {
        int result = NumericStream.sumCalories(Dish.getMenu());
        assertThat(result).isEqualTo(4200);
    }

    @Test
    public void printAllEvenNumbers() {
        NumericStream.printAllEvenNumbers(0, 100);
    }
}