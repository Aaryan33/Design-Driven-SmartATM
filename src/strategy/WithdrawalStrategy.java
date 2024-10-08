package strategy;

public class WithdrawalStrategy implements TransactionStrategy{
    @Override
    public void execute(double amount){
        System.out.println("Withdrawing cash : " + amount);
    }
}
