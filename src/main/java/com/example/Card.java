package com.example;

import java.util.Objects;

public class Card
{

    public Integer cardValue;

    public CardType cardType;

    public Card( int cardValue, CardType cardType )
    {
        if ( cardValue > 13 || cardValue < 1 )
        {
            throw new IllegalArgumentException();
        }
        this.cardValue = cardValue;
        this.cardType = cardType;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o )
        {
            return true;
        }
        if ( o == null || getClass() != o.getClass() )
        {
            return false;
        }
        Card card = (Card) o;
        return Objects.equals( cardValue, card.cardValue ) && cardType == card.cardType;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( cardValue, cardType );
    }
}
