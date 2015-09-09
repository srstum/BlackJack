package com.example;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNot.not;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.assertThat;

public class BlackJackApplicationTest
{
    @Test
    public void FirstRunningTest()
        throws Exception
    {
        assertThat( new BlackJackApplication(), is( not( nullValue() ) ) );
    }
}
