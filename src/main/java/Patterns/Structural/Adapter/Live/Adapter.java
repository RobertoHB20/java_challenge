package Patterns.Structural.Adapter.Live;

public class Adapter implements Payment{
    Secure secureCreditard;

    public Adapter(String type){
        if("BLACK".equals(type)){
            secureCreditard = new BlackCreditCard();
        }
        else if("GOLD".equals(type)){
            secureCreditard = new GoldenCreditCard();
        }
    }

    @Override
    public void pay(String typePayment) {
        if("BLACK".equals(typePayment)){
            secureCreditard.playWithSecureLevelA();
        }
        else if("GOLD".equals(typePayment)){
            secureCreditard.playWithSecureLevelZ();
        }
    }
}
