package com.example;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BlackJackApplicationTest
{
    @Test
    public void FirstRunningTest()
        throws Exception
    {
        assertThat( new BlackJackApplication() ).isNotNull();
    }

    @Test
    public void CanRunConsole()
        throws Exception
    {
        BlackJackApplication.main( new String[]{ "BlackJack" } );
    }

    @Test
    public void DoNotFailIfNoArguments()
        throws Exception
    {
        BlackJackApplication.main( new String[]{} );
    }
}
