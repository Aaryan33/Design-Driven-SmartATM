package state;

public class IdleState implements ATMState{
    @Override
    public void insertCard() {
        System.out.println("Card inserted");
    }

    @Override
    public void ejectCard() {
        System.out.println("No card to eject");
    }

    @Override
    public void enterPIN() {
        System.out.println("Please insert a card before entering PIN");
    }

    @Override
    public void withdrawCash(double amount) {
        System.out.println("Please insert a card and enter PIN");
    }

    @Override
    public void depositCash(double amount) {
        System.out.println("Please insert a card and enter PIN");
    }

    @Override
    public void checkBalance() {
        System.out.println("Please insert a card and enter PIN");
    }
}
