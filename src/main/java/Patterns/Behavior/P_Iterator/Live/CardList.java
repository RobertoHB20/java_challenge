package Patterns.Behavior.P_Iterator.Live;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CardList implements List{

    private Card[] cards;


    @Override
    public IIterator iterator() {
        return new CardIterator(cards);
    }
}
