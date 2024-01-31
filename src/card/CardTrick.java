/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

import java.util.Random;
import java.util.Scanner;

public class CardTrick {
    public static void main(String[] args) {
        Card[] magicHand = new Card[7]; // Array to hold 7 cards
        Random random = new Random();

        // Generate 7 random cards and add to the magicHand
        for (int i = 0; i < magicHand.length; i++) {
            int value = random.nextInt(13) + 1; // 1-13 for Ace to King
            String suit = Card.SUITS[random.nextInt(Card.SUITS.length)]; // Random suit
            magicHand[i] = new Card(suit, value);
        }

        try ( // Scanner to get user input
                Scanner scanner = new Scanner(System.in)) {
            System.out.println("Pick a card! Enter a value (1-13 where 1 is Ace and 13 is King):");
            int userValue = scanner.nextInt();
            System.out.println("Enter a suit (Hearts, Diamonds, Spades, Clubs):");
            String userSuit = scanner.next();
            
            // Check if the user's card is in the magic hand
            boolean found = false;
            for (Card card : magicHand) {
                if (card.getValue() == userValue && card.getSuit().equalsIgnoreCase(userSuit)) {
                    found = true;
                    break;
                }
            }
            
            // Output the result
            if (found) {
                System.out.println("Your card is in the magic hand!");
            } else {
                System.out.println("Your card is not in the magic hand.");
            }
        }
    }
}

