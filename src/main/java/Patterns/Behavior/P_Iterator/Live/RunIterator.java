package Patterns.Behavior.P_Iterator.Live;

public class RunIterator {

    public static void main(String[] args) {
        Card[] cards = new Card[5];
        cards[0] = new Card("VISA");
        cards[1] = new Card("AMEX");
        cards[2] = new Card("MASTER CARD");
        cards[3] = new Card("GOOGLE CARD");
        cards[4] = new Card("APPLE CARD");

        List lista = new CardList(cards);
        IIterator iterator = lista.iterator();

        while (iterator.hasNext()){
            Card tarjeta = (Card) iterator.next();
            System.out.println(tarjeta.getType());
        }
    }
}
