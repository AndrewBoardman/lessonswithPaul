package direct.booleandirect.examples.cards;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeckTest {

    private Deck deck;

    @BeforeEach
    void shuffleDeck() {
        deck = new Deck();

        deck.push(2);
        deck.push(3);
        deck.push(5);
        deck.push(10);
        deck.push(1);
        deck.push(6);
        deck.push(4);
    }

    @Test
    void size() {
        assertEquals(7, deck.size());
    }

    @Test
    void peek() {
        assertEquals(4, deck.peekCard().getValue());
    }

    @Test
    void minCard() {
        assertEquals(1, deck.minCard().getValue());
    }

    @Test
    void maxCard() {
        assertEquals(10, deck.maxCard().getValue());
    }
}