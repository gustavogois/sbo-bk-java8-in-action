package gois.study.sbobkjava8inaction.chapter05;

import gois.study.sbobkjava8inaction.model.Trader;
import gois.study.sbobkjava8inaction.model.Transaction;

import java.util.List;

import static java.util.Comparator.comparing;
import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.toList;

public class Practice {

    public static List<Transaction> findAllTransactionsIn2011AndSortByValue(List<Transaction> transactions) {
        return transactions.stream()
                .filter(t -> t.getYear() == 2011)
                .sorted(comparingInt(Transaction::getValue))
                .collect(toList());
    }

    public static List<String> uniqueCitiesWhereTradersWork(List<Transaction> transactions) {
        return transactions.stream()
                .map(transaction -> transaction.getTrader().getCity())
                .distinct()
                .collect(toList());
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
                .collect(toList());
    }

    public static String tradersNamesSortedAlphabetically(List<Transaction> transactions) {
        return transactions.stream()
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .sorted()
                .reduce( (a, b) -> a + b)
                .get();
    }

    public static boolean anyTradersBasedInMilan(List<Transaction> transactions) {
        return transactions.stream()
                .anyMatch(transaction -> transaction.getTrader().getCity().equals("Milan"));
    }

    public static void printAllTransactionsValuesFromTradersLivingInCambridge(List<Transaction> transactions) {
        transactions.stream()
                .map(Transaction::getTrader)
                .filter(t -> t.getCity().equals("Cambridge"))
                .distinct()
                .forEach(System.out::println);
    }

    public static int highestValue(List<Transaction> transactions) {
        return transactions.stream()
                .max(comparing(Transaction::getValue))
                .get()
                .getValue();
    }

    public static Transaction findTransactionWithSmallestValue(List<Transaction> transactions) {
        /*return transactions.stream()
                .reduce((t1, t2) -> t1.getValue() < t2.getValue() ? t1 : t2)
                .get();*/
        return transactions.stream()
                .min(comparing(Transaction::getValue))
                .get();
    }
}
