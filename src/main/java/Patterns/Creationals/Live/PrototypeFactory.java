package Patterns.Creationals.Live;

import java.util.HashMap;
import java.util.Map;

public class PrototypeFactory {

    public static class CardType{
        public static final String VISA = "visa";
        public static final String AMEX = "amex";
    }

    private static Map<String, PrototypeCard> prototypes = new HashMap<>();

    public static PrototypeCard getInstance(final String type) throws CloneNotSupportedException{
        return prototypes.get(type).clone();
    }

    public static void loadCards(){
        Visa visa = new Visa();
        visa.setName("Esta es una tarjeta visa con número 000");
        prototypes.put(CardType.VISA, visa);

        Amex amex = new Amex();
        amex.setName("Esta es una tarjeta amex con número 777");
        prototypes.put(CardType.AMEX, amex);
    }
}
