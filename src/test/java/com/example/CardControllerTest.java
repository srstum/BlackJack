package com.example;

import static junit.framework.Assert.assertEquals;

import org.junit.Test;

/**
 * Created by 310154831 on 9-9-2015.
 */
public class CardControllerTest {
    @Test
    public void testCreateCard() {
        Integer expectedCardValue = 5;
        CardType expectedCardType = CardType.A;

        CardController cardController = new CardController();
        Card generatedCard = cardController.generateCard(expectedCardValue, expectedCardType);

        assertEquals(expectedCardValue, generatedCard.cardValue);
        assertEquals(expectedCardType, generatedCard.cardType);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCard_InvalidCardValue() {

        CardController cardController = new CardController();
        cardController.generateCard(14, CardType.A);
    }
}
