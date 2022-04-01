package Patterns.Creationals.Singleton.Live;

public class RunSingleton {

    public static void main(String[] args) {
        Card card = Card.getInstance();
        card.setCard("1111 0000 1111 4444");
        System.out.println(card);
    }
}
