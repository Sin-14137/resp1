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
 * student number: 991715817
 */

public class Card {

    private String suit; 
    private int value; 

    public static final String[] SUITS = {"Hearts", "Diamonds", "Spades", "Clubs"};


    public Card(String suit, int value) {
        this.suit = suit;
        this.value = value;
    }


    public String getSuit() {
        return suit;
    }


    public void setSuit(String suit) {
        this.suit = suit;
    }


    public int getValue() {
        return value;
    }


    public void setValue(int value) {
        this.value = value;
    }

 

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Card{" + "suit='" + suit + '\'' + ", value=" + value + '}';
    }
}
