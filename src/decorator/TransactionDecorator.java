package decorator;

public abstract  class TransactionDecorator extends ATMTransaction {
    protected ATMTransaction transaction;

    public TransactionDecorator(ATMTransaction transaction){
        super(transaction.strategy);
        this.transaction = transaction;
    }
    @Override
    public void  process(double amount){
        transaction.process(amount);
    }
}
