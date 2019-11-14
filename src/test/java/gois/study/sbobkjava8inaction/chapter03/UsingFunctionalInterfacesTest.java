package gois.study.sbobkjava8inaction.chapter03;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.springframework.boot.logging.LogLevel;
import org.springframework.boot.test.rule.OutputCapture;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class UsingFunctionalInterfacesTest {

    @Rule
    public OutputCapture outputCapture = new OutputCapture();

    @Test
    void filteredUsingPredicate() {
        List<String> result = UsingFunctionalInterfaces
                .filterUsingPredicate(Arrays.asList("House", "House Job", "My Job"),
                        (String s) -> s.contains("Job"));

        assertThat(result.size()).isEqualTo(2);
    }

    @Test
    void soutTest() {
        System.out.print("hello");
        assertEquals(outputCapture.toString(), "hello");
    }

    @Test
    void forEach() {
        UsingFunctionalInterfaces.forEachUsingConsumer(Arrays.asList(1, 2, 3), i -> System.out.println(i));
    }
}