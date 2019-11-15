package gois.study.sbobkjava8inaction.chapter03;

import gois.study.sbobkjava8inaction.model.Apple;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ConstructorReferencesTest {

    @Test
    public void createAnAppleInstanceUsingSupplier() {
        Apple apple = ConstructorReferences.createAnAppleInstanceUsingSupplier(Apple::new);
        assertThat(apple).isNotNull();
    }
}