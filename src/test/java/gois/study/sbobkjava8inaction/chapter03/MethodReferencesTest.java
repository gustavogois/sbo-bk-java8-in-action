package gois.study.sbobkjava8inaction.chapter03;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class MethodReferencesTest {

    @Test
    public void sort() {
        List<String> result = MethodReferences.sort(Arrays.asList("csdfs", "wewewer", "zsdfsdf", "aeert"));
        assertThat(result.get(0)).isEqualTo("aeert");
        assertThat(result.get(3)).isEqualTo("zsdfsdf");
    }
}