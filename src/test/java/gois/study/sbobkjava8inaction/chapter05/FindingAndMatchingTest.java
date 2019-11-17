package gois.study.sbobkjava8inaction.chapter05;

import gois.study.sbobkjava8inaction.model.Dish;
import org.junit.Test;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

public class FindingAndMatchingTest {

    @Test
    public void hasVegetarian() {
        boolean result = FindingAndMatching.hasVegetarian(Dish.getMenu());

        assertThat(result).isEqualTo(true);
    }

    @Test
    public void isHealthy() {
        boolean result = FindingAndMatching.isHealthy(Dish.getMenu());

        assertThat(result).isEqualTo(true);
    }

    @Test
    public void findAVegetarianDish() {
        Optional<Dish> aVegetarianDish = FindingAndMatching.findAVegetarianDish(Dish.getMenu());

        assertThat(aVegetarianDish.isPresent()).isEqualTo(true);
    }
}