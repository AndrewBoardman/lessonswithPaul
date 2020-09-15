package direct.booleandirect.examples.cards;

public class Card {

    private final int value;
    private final Card prevCard;

    Card(int value, Card prevCard){
        this.prevCard = prevCard;
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public Card getPrevCard() {
        return prevCard;
    }

    @Override
    public String toString() {
        return "Card{" +
                "value=" + value +
                '}';
    }
}
