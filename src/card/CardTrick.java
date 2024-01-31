package card;

import java.util.Random;
import java.util.Scanner;

/*
*@modifier = Aakashdeep Singh
@student number = 991715817
*/

public class CardTrick {
    public static void main(String[] args) {
        Card[] magicHand = new Card[7]; 
        Random random = new Random();

       
        Card luckyCard = new Card("Hearts", 12); 

        
        for (int i = 0; i < magicHand.length; i++) {
            int value = random.nextInt(13) + 1; 
            String suit = Card.SUITS[random.nextInt(Card.SUITS.length)]; 
            magicHand[i] = new Card(suit, value);
        }

        try ( 
                Scanner scanner = new Scanner(System.in)) {
            System.out.println("Pick a card! Enter a value (1-13 where 1 is Ace and 13 is King):");
            int userValue = scanner.nextInt();
            System.out.println("Enter a suit (Hearts, Diamonds, Spades, Clubs):");
            String userSuit = scanner.next();
            
            
            boolean found = false;
            for (Card card : magicHand) {
                if ((card.getValue() == userValue && card.getSuit().equalsIgnoreCase(userSuit)) ||
                    (luckyCard.getValue() == userValue && luckyCard.getSuit().equalsIgnoreCase(userSuit))) {
                    found = true;
                    break;
                }
            }
            
            
            if (found) {
                System.out.println("Your card is in the magic hand or is the lucky card!");
            } else {
                System.out.println("Your card is not in the magic hand nor the lucky card.");
            }
        }
    }
}
