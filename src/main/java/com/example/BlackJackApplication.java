package com.example;

import com.example.player.Player;
import com.sun.istack.internal.NotNull;

public class BlackJackApplication {
    public static final String DEFAULT_GAME_CAPTION = "BlackJack";

    @NotNull
    private final String title;

    public BlackJackApplication(@NotNull String title) {
        this.title = title;
    }

    public static void main(String[] arguments) {
        String title = getTitle(arguments);

        BlackJackApplication application = new BlackJackApplication(title);

        application.run();

    }

    private void run() {
        printTitle();
        Player player = new Player();

        CardController cardController = new CardController();
        Card playerCard1 = cardController.generateRandomCard();
        Card playerCard2 = cardController.generateRandomCard();

        player.addCard(playerCard1);
        player.addCard(playerCard2);

        printHiddenCard();

        printOpenCard(playerCard1);
        printOpenCard(playerCard2);
    }

    private void printTitle() {
        printString(title);
    }

    private void printString(String string) {
        System.out.println(string);
    }

    private static String getTitle(String[] arguments) {
        return arguments.length > 0 ? arguments[0] : DEFAULT_GAME_CAPTION;
    }

    public void printHiddenCard() {
        System.out.println("|*|");
    }

    public void printOpenCard(Card card) {
        System.out.println(card.cardValue.toString() + card.cardType.toString());
    }
}
