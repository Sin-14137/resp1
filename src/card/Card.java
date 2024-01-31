package card;

/**
 * A class that models playing card Objects. Cards have a value (note that Ace = 1, Jack = 11, Queen =12, King = 13)
 * A suit (clubs, hearts, spades, diamonds).
 * There are 52 cards in a deck, no jokers.
 * This code is to be used in ICE1. When you create your own branch,
 * add your name as a modifier.
 *
 * @author srinivsi
 * @modifier Aakashdeep Singh
 */

public class Card {

    private String suit; // Clubs, Spades, Diamonds, Hearts
    private int value; // 1-13 for Ace to King

    public static final String[] SUITS = {"Hearts", "Diamonds", "Spades", "Clubs"};

    // Constructor to create a card with a suit and value
    public Card(String suit, int value) {
        this.suit = suit;
        this.value = value;
    }

    // Returns the suit of the card
    public String getSuit() {
        return suit;
    }

    // Sets the suit of the card
    public void setSuit(String suit) {
        this.suit = suit;
    }

    // Returns the value of the card
    public int getValue() {
        return value;
    }

    // Sets the value of the card
    public void setValue(int value) {
        this.value = value;
    }

    // Returns a string representation of the card

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Card{" + "suit='" + suit + '\'' + ", value=" + value + '}';
    }
}
