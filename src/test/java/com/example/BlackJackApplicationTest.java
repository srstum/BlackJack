package com.example;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.*;

public class BlackJackApplicationTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }

    @Test
    public void PrintCustomTitle() throws Exception {
        BlackJackApplication.main(new String[] { "Test" });

        assertThat(getConsoleText()).contains("Test");
    }

    private String getConsoleText() {
        return outContent.toString().trim();
    }

    @Test
    public void ShouldPrintDefaultTitle_WhenNoTitleProvided() throws Exception {
        BlackJackApplication.main(new String[] {});

        assertThat(getConsoleText()).contains("BlackJack");
    }

    @Test
    public void ShouldRunApplicationAndPrintHiddenCard() throws Exception {
        BlackJackApplication.main(new String[] {});

        assertThat(getConsoleText()).contains("|*|");
    }

    @Test
    public void testPrintOpenCard() {
        BlackJackApplication application = new BlackJackApplication("test");
        Card card = new Card(5, CardType.A);
        application.printOpenCard(card);
        assertThat(getConsoleText()).isEqualTo("5A");
    }

    @Test
    public void ShouldPrintClosedCard() throws Exception {
        BlackJackApplication application = new BlackJackApplication("test");

        application.printHiddenCard();

        assertThat(getConsoleText()).isEqualTo("|*|");
    }
}
