package factory;

import decorator.ATMTransaction;
import decorator.WithdrawTransactionDecorator;
public class WithdrawFactory extends TransactionFactory{
    @Override
    public ATMTransaction createTransaction(double amount){
        return new WithdrawTransactionDecorator(new ATMTransaction(null) {
            @Override
            public void process(double amount) {
                // default behaviour
            }
        });
    }
}
