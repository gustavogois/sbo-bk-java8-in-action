package gois.study.sbobkjava8inaction.chapter03;

import java.util.List;

public class MethodReferences {
    public static List<String> sort(List<String> asList) {
        asList.sort(String::compareToIgnoreCase);
        return asList;
    }
}
