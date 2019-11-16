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
}