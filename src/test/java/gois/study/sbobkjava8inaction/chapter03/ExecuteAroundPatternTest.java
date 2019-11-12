package gois.study.sbobkjava8inaction.chapter03;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ExecuteAroundPatternTest {

    @Test
    void process() {
        String result = ExecuteAroundPattern.process();

        assertThat(result).isEqualTo("Linha 01");
    }
}