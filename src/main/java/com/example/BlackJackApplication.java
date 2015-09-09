package com.example;

import com.sun.istack.internal.NotNull;

public class BlackJackApplication
{
    public static final String DEFAULT_GAME_CAPTION = "BlackJack";

    @NotNull
    private final String title;

    public BlackJackApplication( @NotNull String title )
    {
        this.title = title;
    }

    public static void main( String[] arguments )
    {
        String title = getTitle( arguments );

        BlackJackApplication application = new BlackJackApplication( title );

        application.printTitle();
        application.printHiddenCard();
    }

    private void printTitle()
    {
        printString( title );
    }

    private void printString( String string )
    {
        System.out.println( string );
    }

    private static String getTitle( String[] arguments )
    {
        return arguments.length > 0 ? arguments[0] : DEFAULT_GAME_CAPTION;
    }

    public void printHiddenCard()
    {
        System.out.println( "|*|" );
    }
}
