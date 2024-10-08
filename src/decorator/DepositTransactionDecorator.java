package decorator;

import strategy.DepositStrategy;
public class DepositTransactionDecorator extends TransactionDecorator{
    public DepositTransactionDecorator(ATMTransaction transaction){
        super(transaction);
        this.strategy = new DepositStrategy();
    }

    @Override
    public void process(double amount){
        strategy.execute(amount);
        super.process(amount);
    }
}
