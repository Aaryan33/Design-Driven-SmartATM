package decorator;

import strategy.TransactionStrategy;

public abstract class ATMTransaction {

    protected TransactionStrategy strategy;
    public ATMTransaction(TransactionStrategy strategy){
        this.strategy = strategy;
    }

    public abstract void process(double amount);
}
