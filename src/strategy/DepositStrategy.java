package strategy;

public class DepositStrategy implements TransactionStrategy{
    @Override
    public void execute(double amount){
        System.out.println("Depositing cash : " + amount);
    }
}
