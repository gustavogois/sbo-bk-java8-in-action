package gois.study.sbobkjava8inaction.chapter05;

import gois.study.sbobkjava8inaction.model.Transaction;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.Comparator.comparingInt;

public class Practice {

    public static List<Transaction> findAllTransactionsIn2011AndSortByValue(List<Transaction> transactions) {
        return transactions.stream()
                .filter(t -> t.getYear() == 2011)
                .sorted(comparingInt(Transaction::getValue))
                .collect(Collectors.toList());
    }
}
