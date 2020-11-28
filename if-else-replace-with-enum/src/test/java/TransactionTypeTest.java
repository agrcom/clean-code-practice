
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class TransactionTypeTest {

    @Test
    void test_buy_operation(){
        BigDecimal savings = BigDecimal.valueOf(12);
        Account account = Account.account();

        TransactionType.BUY.doTransaction(account, savings);

        assertEquals(BigDecimal.valueOf(987.98), account.getBalance());
    }

    @Test
    void test_sell_operation(){
        BigDecimal savings = BigDecimal.valueOf(42);
        Account account = Account.account();

        TransactionType.SELL.doTransaction(account, savings);

        assertEquals(BigDecimal.valueOf(1042.0), account.getBalance());
    }

    @Test
    void test_deposit_operation(){
        BigDecimal savings = BigDecimal.valueOf(150);
        Account account = Account.account();

        TransactionType.DEPOSIT.doTransaction(account, savings);

        assertEquals(BigDecimal.valueOf(850.07), account.getBalance());
    }

    @Test
    void test_witdrawal_operation(){
        BigDecimal savings = BigDecimal.valueOf(122);
        Account account = Account.account();

        TransactionType.WITHDRAWAL.doTransaction(account, savings);

        assertEquals(BigDecimal.valueOf(877.8), account.getBalance());
    }
}