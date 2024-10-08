package decorator;

import strategy.WithdrawalStrategy;
public class WithdrawTransactionDecorator extends TransactionDecorator{
    public WithdrawTransactionDecorator(ATMTransaction transaction){
        super(transaction);
        this.strategy = new WithdrawalStrategy();
    }

    @Override
    public void process(double amount){
        strategy.execute(amount);
        super.process(amount);
    }
}
