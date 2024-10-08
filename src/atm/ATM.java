package atm;

import decorator.ATMTransaction;
import state.ATMState;
import state.IdleState;

public class ATM {
    private ATMState currentState;

    public ATM() {
        currentState = new IdleState();
    }

    public void setState(ATMState state) {
        currentState = state;
    }

    public void insertCard() {
        currentState.insertCard();
    }

    public void ejectCard() {
        currentState.ejectCard();
    }

    public void enterPIN() {
        currentState.enterPIN();
    }

    public void withdrawCash(ATMTransaction transaction, double amount) {
        transaction.process(amount);
        currentState.withdrawCash(amount);
    }

    public void depositCash(ATMTransaction transaction, double amount) {
        transaction.process(amount);
        currentState.depositCash(amount);
    }

    public void checkBalance() {
        currentState.checkBalance();
    }
}
