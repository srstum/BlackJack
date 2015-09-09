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
}
