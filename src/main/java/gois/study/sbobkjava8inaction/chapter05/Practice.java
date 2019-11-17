package gois.study.sbobkjava8inaction.chapter05;

import gois.study.sbobkjava8inaction.model.Trader;
import gois.study.sbobkjava8inaction.model.Transaction;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;
import static java.util.Comparator.comparingInt;

public class Practice {

    public static List<Transaction> findAllTransactionsIn2011AndSortByValue(List<Transaction> transactions) {
        return transactions.stream()
                .filter(t -> t.getYear() == 2011)
                .sorted(comparingInt(Transaction::getValue))
                .collect(Collectors.toList());
    }

    public static List<String> uniqueCitiesWhereTradersWork(List<Transaction> transactions) {
        return transactions.stream()
                .map(transaction -> transaction.getTrader().getCity())
                .distinct()
                .collect(Collectors.toList());
        /*return transactions.stream()
                .map(transaction -> transaction.getTrader().getCity())
                .collect(toSet());*/
    }

    public static List<Trader> allTradersFromCambridgeAndSortByName(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getTrader)
                .filter(t -> t.getCity().equals("Cambridge"))
                .distinct()
                .sorted(comparing(Trader::getName))
                .collect(Collectors.toList());
    }
}
