package observer;

public class ATMUserInterface implements Observer{
    @Override
    public void update(String message){
        System.out.println("User Interface : " + message);

    }
}
