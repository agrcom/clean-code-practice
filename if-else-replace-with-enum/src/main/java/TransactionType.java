import java.math.BigDecimal;
import java.math.RoundingMode;

public enum TransactionType {
  BUY {
    @Override
    public void doTransaction(Account account, BigDecimal cash) {
      BigDecimal tax = calculateTax(BigDecimal.valueOf(0.15), cash);
      account.removeMoney(cash.add(tax));
    }
  },
  SELL {
    @Override
    public void doTransaction(Account account, BigDecimal cash) {
      BigDecimal tax = calculateTax(BigDecimal.valueOf(0.1), cash);
      account.addMoney(cash.subtract(tax));
    }
  },
  DEPOSIT {
    @Override
    public void doTransaction(Account account, BigDecimal cash) {
      BigDecimal tax = calculateTax(BigDecimal.valueOf(0.05), cash);
      account.removeMoney(cash.subtract(tax));
    }
  },
  WITHDRAWAL {
    @Override
    public void doTransaction(Account account, BigDecimal cash) {
      BigDecimal tax = calculateTax(BigDecimal.valueOf(0.2), cash);
      account.removeMoney(cash.add(tax));
    }
  };

  public abstract void doTransaction(Account account, BigDecimal cash);

  BigDecimal calculateTax(BigDecimal percentage, BigDecimal cashValue) {
    return cashValue.multiply(percentage).divide(new BigDecimal(100), RoundingMode.HALF_DOWN);
  }
}
