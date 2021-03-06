package com.example;

import com.example.card.Card;
import com.example.card.CardController;
import com.example.player.Player;
import com.sun.istack.internal.NotNull;

public class BlackJackApplication {
    public static final String DEFAULT_GAME_CAPTION = "BlackJack";

    public static ApplicationFactory applicationFactory = new ApplicationFactory();

    @NotNull
    private final String title;

    public BlackJackApplication(@NotNull String title) {
        this.title = title;
    }

    public static void main(String[] arguments) {
        String title = getTitle(arguments);

        BlackJackApplication application = applicationFactory.createApplication(title);

        application.run();

    }

    public void run() {
        printTitle();
        Player player = new Player();

        CardController cardController = new CardController();
        Card playerCard1 = cardController.generateRandomCard();
        Card playerCard2 = cardController.generateRandomCard();

        player.addCard(playerCard1);
        player.addCard(playerCard2);

        printHiddenCard();

        printPlayer(player);
    }

    public void printPlayer(Player player) {
        String info = "Player:";
        for (Card card : player.getCards()) {
            info = info + " " + card.cardValue.toString() + card.cardType.toString();
        }
        System.out.println(info);
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
        System.out.println("|" + card.cardValue.toString() + card.cardType.toString() + "|");
    }

    public static class ApplicationFactory {
        public BlackJackApplication createApplication(String title) {
            return new BlackJackApplication(title);
        }
    }
}
