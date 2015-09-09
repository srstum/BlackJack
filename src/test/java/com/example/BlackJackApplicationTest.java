package com.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

public class BlackJackApplicationTest
{
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams()
    {
        System.setOut( new PrintStream( outContent ) );
    }

    @After
    public void cleanUpStreams()
    {
        System.setOut( null );
    }

    @Test
    public void CanRunConsole()
        throws Exception
    {
        BlackJackApplication.main( new String[]{ "Test" } );

        assertThat( outContent.toString().trim() ).isEqualTo( "Test" );
    }

    @Test
    public void DoNotFailIfNoArguments()
        throws Exception
    {
        BlackJackApplication.main( new String[]{} );

        assertThat( outContent.toString().trim() ).isEqualTo( "BlackJack" );
    }
}
