package com.example;

public class BlackJackApplication
{
    public static final String DEFAULT_GAME_CAPTION = "BlackJack";

    public static void main( String[] arguments )
    {
        String title = getTitle( arguments );
        print( title );

    }

    private static void print( String title )
    {
        System.out.println( title );
    }

    private static String getTitle( String[] arguments )
    {
        return arguments.length > 0 ? arguments[0] : DEFAULT_GAME_CAPTION;
    }

    public void printHiddenCard()
    {
        System.out.println( "*" );
    }
}
