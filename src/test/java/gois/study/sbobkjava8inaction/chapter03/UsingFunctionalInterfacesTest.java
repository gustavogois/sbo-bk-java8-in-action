package gois.study.sbobkjava8inaction.chapter03;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class UsingFunctionalInterfacesTest {

    @Test
    void filteredUsingPredicate() {
        List<String> result = UsingFunctionalInterfaces
                .filterUsingPredicate(Arrays.asList("House", "House Job", "My Job"),
                        (String s) -> s.contains("Job"));

        assertThat(result.size()).isEqualTo(2);
    }
}