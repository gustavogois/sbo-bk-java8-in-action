package gois.study.sbobkjava8inaction.chapter03;

import java.io.*;

public class ExecuteAroundPattern {
    public static String process() {
        try (BufferedReader br = new BufferedReader(new FileReader("src/main/resources/data.txt"))) {
            return br.readLine();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

    public static String processWithLambda(BufferedReaderProcessor bufferedReaderProcessor) {
        try (BufferedReader br = new BufferedReader(new FileReader("src/main/resources/data.txt"))) {
            return bufferedReaderProcessor.process(br);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
}
