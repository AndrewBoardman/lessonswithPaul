package direct.booleandirect.examples.cards;

public class Deck {

    private int numberOfCards;
    private Card topCard;
    private Card minimumCard;
    private Card maximumCard;

    public void push(int value) {
        numberOfCards++;
        var card = new Card(value);
        if (topCard == null) {
            minimumCard = card;
            maximumCard = card;
        } else {
            if (card.getValue() < minimumCard.getValue()) {
                minimumCard = card;
            }
            if (card.getValue() > maximumCard.getValue()) {
                maximumCard = card;
            }
        }
        topCard = card;
    }

    public int size() {
        return numberOfCards;
    }

    public Card peekCard() {
        return topCard;
    }

    public Card minCard() {
        return minimumCard;
    }

    public Card maxCard() {
        return maximumCard;
    }
}
