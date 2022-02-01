
package cardgame;

public class CardTrick {
    public static final String[] SUITS = {"Hearts",
        "Spaces", "Diamonds", "Clubs"};
    private final int value;
    private final String suit;

    public CardTrick(int value, String suit) {
        this.value = value;
        this.suit = suit;
    }

    public String getSuit() {
        return suit;
    }

    public int getValue() {
        return value;
    }
}
