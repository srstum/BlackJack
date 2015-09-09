package com.example.player;

import com.example.card.Card;
import com.example.card.CardType;
import org.junit.Test;

import java.util.Collections;

import static org.assertj.core.api.Assertions.assertThat;

public class PlayerTest
{
    @Test
    public void CanInstantiatePlayer()
        throws Exception
    {
        assertThat( new Player() ).isNotNull();
    }

    @Test
    public void CanAddCardToPlayer()
        throws Exception
    {
        Player player = new Player();
        Card card = new Card( 4, CardType.A );
        player.addCard( card );

        assertThat( player.getCards() ).isEqualTo( Collections.singletonList( card ) );
    }
}
