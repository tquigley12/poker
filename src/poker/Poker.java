package poker;

/**
 * This is the main driver program to draw a standard 5-card hand of poker
 * and analyze the hand.
 * @author tquigley1
 */
public class Poker {

    public static void main(String[] args) {
        new Poker();
    }
    
    public Poker() {

        Hand hand = new Hand();
        Card[] card = new Card[5];
        
        /**
         * Generate hand of poker.
         */
        GenerateHand generateHand = new GenerateHand(card);
        
        /**
         * Populate the hand and print it.
         */
        hand.setHand(card);
        
        System.out.print(hand);
        
        /**
         * Evaluate the hand and print the result.
         */
        System.out.print("Hand value: ");
        if (hand.isRoyalFlush()) {
            System.out.println("Royal Flush");
        } else if (hand.isStraightFlush()) {
            System.out.println("Straight Flush");
        } else if (hand.isFourOfaKind()) {
            System.out.println("Four of a Kind");
        } else if (hand.isFullHouse()) {
            System.out.println("Full House");
        } else if (hand.isFlush()) {
            System.out.println("Flush");
        } else if (hand.isStraight()) {
            System.out.println("Straight");
        } else if (hand.isThreeOfaKind()) {
            System.out.println("Three of a Kind");
        } else if (hand.isTwoPair()) {
            System.out.println("Two Pair");
        } else if (hand.isOnePair()) {
            System.out.println("One Pair");
        } else {
            System.out.println("High Card");
        }
    }
    
}