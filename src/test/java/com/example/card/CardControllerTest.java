package com.example.card;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

public class CardControllerTest
{
    @Test
    public void testCreateCard()
    {
        Integer expectedCardValue = 5;
        CardType expectedCardType = CardType.A;

        CardController cardController = new CardController();
        Card generatedCard = cardController.generateCard( expectedCardValue, expectedCardType );

        assertEquals( expectedCardValue, generatedCard.cardValue );
        assertEquals( expectedCardType, generatedCard.cardType );
    }

    @Test
    public void testGenerateRandomCard()
    {
        CardController cardController = new CardController();
        Card card = cardController.generateRandomCard();
        assertNotNull( card );
    }
}
