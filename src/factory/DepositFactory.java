package factory;

import decorator.ATMTransaction;
import decorator.DepositTransactionDecorator;
public class DepositFactory extends TransactionFactory{
    @Override
    public ATMTransaction createTransaction(double amount){
        return new DepositTransactionDecorator(new ATMTransaction(null) {
            @Override
            public void process(double amount) {
                // default behaviour
            }
        });
    }
}
