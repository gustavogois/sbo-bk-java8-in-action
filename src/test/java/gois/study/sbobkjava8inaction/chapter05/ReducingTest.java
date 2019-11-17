package gois.study.sbobkjava8inaction.chapter05;

import org.junit.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class ReducingTest {

    @Test
    public void sumAllElements() {
        int result = Reducing.sumAllElements(Arrays.asList(1, 2, 3));

        assertThat(result).isEqualTo(6);
    }
}