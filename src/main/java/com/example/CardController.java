package com.example;

/**
 * Created by 310154831 on 9-9-2015.
 */
public class CardController {
    public Card generateCard(int cardValue, CardType cardType) {
        return new Card(cardValue, cardType);
    }
}
