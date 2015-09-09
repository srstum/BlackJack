package com.example;

/**
 * Created by 310154831 on 9-9-2015.
 */
public class Card {

    public Integer cardValue;
    public CardType cardType;

    public Card(int cardValue, CardType cardType) {
        if (cardValue > 13 || cardValue < 1) {
            throw new IllegalArgumentException();
        }
        this.cardValue = cardValue;
        this.cardType = cardType;
    }
}
