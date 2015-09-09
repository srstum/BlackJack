package com.example;

import com.example.card.Card;
import com.example.card.CardType;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

public class BlackJackApplicationTest
{
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    private BlackJackApplication application = new BlackJackApplication( "test" );

    @Mock
    private BlackJackApplication.ApplicationFactory factoryMock;

    @Mock
    private BlackJackApplication applicationMock;

    @Before
    public void setUp()
    {
        initMocks( this );

        System.setOut( new PrintStream( outContent ) );
    }

    @After
    public void cleanUpStreams()
    {
        System.setOut( null );
    }

    @Test
    public void ShouldConstructApplication_WhenMainRun()
        throws Exception
    {
        BlackJackApplication.applicationFactory = factoryMock;
        when( factoryMock.createApplication( anyString() ) ).thenReturn( applicationMock );

        BlackJackApplication.main( new String[]{} );

        verify( factoryMock ).createApplication( "BlackJack" );
    }

    @Test
    public void ShouldRunApplication_WhenMainRun()
        throws Exception
    {
        BlackJackApplication.applicationFactory = factoryMock;
        when( factoryMock.createApplication( anyString() ) ).thenReturn( applicationMock );

        BlackJackApplication.main( new String[]{} );

        verify( applicationMock ).run();
    }

    @Test
    public void PrintCustomTitle()
        throws Exception
    {
        application = new BlackJackApplication( "Test" );

        application.run();

        assertThat( getConsoleText() ).contains( "Test" );
    }

    private String getConsoleText()
    {
        return outContent.toString().trim();
    }

    @Test
    public void testPrintOpenCard()
    {
        Card card = new Card( 5, CardType.A );

        application.printOpenCard( card );

        assertThat( getConsoleText() ).isEqualTo( "|5A|" );
    }

    @Test
    public void ShouldPrintClosedCard()
        throws Exception
    {
        application.printHiddenCard();

        assertThat( getConsoleText() ).isEqualTo( "|*|" );
    }
}
