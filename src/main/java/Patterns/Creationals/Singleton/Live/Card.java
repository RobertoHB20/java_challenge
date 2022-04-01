package Patterns.Creationals.Singleton.Live;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Card {

    private static Card INSTANCE;
    private String card;

    private Card(){}

    public static Card getInstance(){
        if(INSTANCE == null){
            synchronized (Card.class){
                if(INSTANCE == null){
                    INSTANCE = new Card();
                    System.out.println("Se genera nueva instancia");
                }
            }
        }
        return INSTANCE;
    }
}
