package com.example;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by 310154831 on 9-9-2015.
 */
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
}
