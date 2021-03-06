package com.example.card;

import java.util.Random;

public class CardController
{
    private Random random = new Random( System.currentTimeMillis() );

    public Card generateCard( int cardValue, CardType cardType )
    {
        return new Card( cardValue, cardType );
    }

    public Card generateRandomCard()
    {
        int cardValue = random.nextInt( 13 );
        cardValue += 1;

        return new Card( cardValue, CardType.A );
    }
}
