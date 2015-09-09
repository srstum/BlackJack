package com.example;

public class BlackJackApplication
{
    public static final String DEFAULT_GAME_CAPTION = "BlackJack";

    public static void main( String[] arguments )
    {
        String title = arguments.length > 0 ? arguments[0] : DEFAULT_GAME_CAPTION;
        System.out.println( title );
    }
}
