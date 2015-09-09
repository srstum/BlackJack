package com.example;

import org.junit.Test;

import java.util.Objects;

import static org.assertj.core.api.Assertions.assertThat;

public class CardTest
{
    @Test( expected = IllegalArgumentException.class )
    public void testCreateCard_InvalidCardValue()
    {
        new Card( 14, CardType.A );
    }

    @Test
    public void ShouldBeEqualForSameCard()
        throws Exception
    {
        Card card = new Card( 10, CardType.A );

        assertThat( card ).isEqualTo( card );
    }

    @Test
    public void ShouldBeEqualForSameValuesCard()
        throws Exception
    {
        Card card1 = new Card( 10, CardType.A );
        Card card2 = new Card( 10, CardType.A );

        assertThat( card1 ).isEqualTo( card2 );
    }

    @Test
    public void ShouldNotBeEqual_WhenValueAreDifferent()
        throws Exception
    {
        Card card1 = new Card( 10, CardType.A );
        Card card2 = new Card( 11, CardType.A );

        assertThat( card1 ).isNotEqualTo( card2 );
    }

    @Test
    public void ShouldNotBeEqual_WhenTypeAreDifferent()
        throws Exception
    {
        Card card1 = new Card( 10, CardType.A );
        Card card2 = new Card( 10, CardType.B );

        assertThat( card1 ).isNotEqualTo( card2 );
    }

    @Test
    public void ShouldHaveHashBasedOnValues()
        throws Exception
    {
        Card card = new Card( 10, CardType.A );

        assertThat( card.hashCode() ).isEqualTo( Objects.hash( 10, CardType.A ) );
    }
}