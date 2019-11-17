package gois.study.sbobkjava8inaction.chapter05;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class StreamConceptsTest {

    @Test
    public void returnListUniqueCharacters() {
        List<String> uniqueChars = StreamConcepts.returnListUniqueCharacters(Arrays.asList("Hello", "Word"));

        assertThat(uniqueChars.size()).isEqualTo(7);
        assertThat(uniqueChars).contains("H");
        assertThat(uniqueChars).contains("e");
        assertThat(uniqueChars).contains("l");
        assertThat(uniqueChars).contains("o");
        assertThat(uniqueChars).contains("W");
        assertThat(uniqueChars).contains("r");
        assertThat(uniqueChars).contains("d");
    }

    @Test
    public void squareNumbers() {
        List<Integer> squares = StreamConcepts.squareNumbers(Arrays.asList(1, 2, 3, 4, 5));

        assertThat(squares.get(0)).isEqualTo(1);
        assertThat(squares.get(1)).isEqualTo(4);
        assertThat(squares.get(2)).isEqualTo(9);
        assertThat(squares.get(3)).isEqualTo(16);
        assertThat(squares.get(4)).isEqualTo(25);
    }

    @Test
    public void pairNumbers() {
        List<int[]> result = StreamConcepts.pairNumbers(Arrays.asList(1, 2), Arrays.asList(3, 4, 5));

        assertThat(result.size()).isEqualTo(6);
    }

    @Test
    public void onlyPairsSumDivisibleBy3() {
        List<int[]> result = StreamConcepts.onlyPairsSumDivisibleBy3(Arrays.asList(1, 2), Arrays.asList(3, 4, 5));

        assertThat(result.size()).isEqualTo(2);
    }
}