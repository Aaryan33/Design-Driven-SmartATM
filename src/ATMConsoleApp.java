import atm.ATM;
import decorator.ATMTransaction;
import factory.TransactionFactory;
import factory.WithdrawFactory;
import factory.DepositFactory;

public class ATMConsoleApp {
    public static void main(String[] args) {
        ATM atm = new ATM();

        // Card Inserted
        atm.insertCard();

        // Enter PIN
        atm.enterPIN();

        // Create a withdrawal transaction with decorator
        TransactionFactory withdrawFactory = new WithdrawFactory();
        ATMTransaction withdrawTransaction = withdrawFactory.createTransaction(500);
        atm.withdrawCash(withdrawTransaction, 500);

        // Create a deposit transaction with decorator
        TransactionFactory depositFactory = new DepositFactory();
        ATMTransaction depositTransaction = depositFactory.createTransaction(300);
        atm.depositCash(depositTransaction, 300);

        // Check balance
        atm.checkBalance();

        // Eject card
        atm.ejectCard();
    }
}