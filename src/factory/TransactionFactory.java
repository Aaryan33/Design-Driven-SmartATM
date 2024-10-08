package factory;

import decorator.ATMTransaction;
public abstract class TransactionFactory {
    public abstract ATMTransaction createTransaction(double amount);
}
