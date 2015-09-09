package com.example.player;

import com.example.Card;

import java.util.ArrayList;
import java.util.List;

public class Player
{
    private List<Card> cards = new ArrayList<>();

    public List<Card> getCards()
    {
        return cards;
    }

    public void addCard( Card card )
    {
        cards.add( card );
    }
}
