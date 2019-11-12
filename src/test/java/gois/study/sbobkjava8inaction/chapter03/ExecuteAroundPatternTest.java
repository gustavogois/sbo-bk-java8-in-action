package gois.study.sbobkjava8inaction.chapter03;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ExecuteAroundPatternTest {

    @Test
    void process() {
        String result = ExecuteAroundPattern.process();

        assertThat(result).isEqualTo("Linha 01");
    }

    @Test
    void processWithLambda() {
        String result = ExecuteAroundPattern.processWithLambda((BufferedReader br) -> br.readLine() + br.readLine());

        assertThat(result).isEqualTo("Linha 01Linha 02");
    }
}