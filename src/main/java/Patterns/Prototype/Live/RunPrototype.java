package Patterns.Prototype.Live;

public class RunPrototype {

    public static void main(String[] args) {
        PrototypeFactory.loadCards();
        try{
            PrototypeCard visa = PrototypeFactory.getInstance(PrototypeFactory.CardType.VISA);
            visa.getCard();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
    }
}
