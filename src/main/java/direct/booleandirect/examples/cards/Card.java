package direct.booleandirect.examples.cards;

public class Card {

    private final int value;

    Card(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Card{" +
                "value=" + value +
                '}';
    }
}
