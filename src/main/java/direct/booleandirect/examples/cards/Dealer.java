package direct.booleandirect.examples.cards;

public class Dealer {
    public static void main(String[] args) {
        Deck BAGGS = new Deck();

        BAGGS.push(5);
        BAGGS.push(4);
        BAGGS.push(1);
        BAGGS.push(6);
        BAGGS.push(20);
        BAGGS.push(2);
        BAGGS.push(3);

        System.out.println("Deck size: " + BAGGS.size());
        System.out.println("Card on the top: " + BAGGS.peekCard());
        System.out.println("Lowest value card: " + BAGGS.minCard());
        System.out.println("Highest value card: " + BAGGS.maxCard());
    }
}
