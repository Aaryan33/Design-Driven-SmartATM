package state;

public interface ATMState {
    void insertCard();
    void ejectCard();
    void enterPIN();
    void withdrawCash(double amount);
    void depositCash(double amount);
    void checkBalance();

}
