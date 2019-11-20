package gois.study.sbobkjava8inaction.chapter05;

import gois.study.sbobkjava8inaction.model.Trader;
import gois.study.sbobkjava8inaction.model.Transaction;
import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class PracticeTest {

    @Test
    public void findAllTransactionsIn2011AndSortByValue() {
        List<Transaction> result = Practice.findAllTransactionsIn2011AndSortByValue(Transaction.getTransactions());

        assertThat(result.stream().allMatch(t -> t.getYear() == 2011));
        result.stream().reduce( (a, b) -> {
            assertThat(a.getValue() <= b.getValue());
            return b; // will be "a" for next reduction
        });
    }

    @Test
    public void uniqueCitiesWhereTradersWork() {
        List<String> result = Practice.uniqueCitiesWhereTradersWork(Transaction.getTransactions());

        assertThat(result.size() == 2);
        assertThat(result).contains("Cambridge", "Milan");
    }

    @Test
    public void allTradersFromCambridgeAndSortByName() {
        List<Trader> traders = Practice.allTradersFromCambridgeAndSortByName(Transaction.getTransactions());

        assertThat(traders.size()).isEqualTo(3);
        assertThat(traders.stream().allMatch(t -> t.getCity().equals("Cambridge")));
    }

    @Test
    public void tradersNamesSortedAlphabetically() {
        String result = Practice.tradersNamesSortedAlphabetically(Transaction.getTransactions());

        assertThat(result).isNotNull();
    }

    @Test
    public void anyTradersBasedInMilan() {
        assertThat(Practice.anyTradersBasedInMilan(Transaction.getTransactions()));
    }

    @Test
    public void printAllTransactionsValuesFromTradersLivingInCambridge() {
        Practice.printAllTransactionsValuesFromTradersLivingInCambridge(Transaction.getTransactions());
    }

    @Test
    public void highestValue() {
        int value = Practice.highestValue(Transaction.getTransactions());
        assertThat(value).isEqualTo(1000);
    }
}