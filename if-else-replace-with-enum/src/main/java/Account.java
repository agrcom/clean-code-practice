import java.math.BigDecimal;

public class Account {

    private BigDecimal balance = new BigDecimal(1000);

    public static Account account(){
        return new Account();
    }

    void addMoney(BigDecimal amount){
        this.balance = this.balance.add(amount);
    }

    void removeMoney(BigDecimal amount){
        this.balance = this.balance.subtract(amount);
    }

    BigDecimal getBalance(){
        return this.balance;
    }
}
