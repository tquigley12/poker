package poker;

/**
 * The purpose of this class is to represent a hand of poker.
 * @author tquigley1
 */
public class Hand {
    private Card[] hand;
    
    public Hand() {
        hand = new Card[5];
    }

    /**
     * 
     * @param hand.  Set hand from input Card array.
     */
    public void setHand(Card[] hand) {
        this.hand = hand;
    }

    /**
     * 
     * @return Hand of playing cards.
     */
    public Card[] getHand() {
        return hand;
    }
    
    /**
     * 
     * @param cardNumber.  Number of input card (1-52).
     * @return Rank of card.
     */
    public String getRank(int cardNumber) {
        int rankValue = 0;
        String str = "";
        rankValue = hand[cardNumber].getRank();
        switch (rankValue) {
            case 1:
                str = "A";
                break;
            case 2:
                str = "2";
                break;
            case 3:
                str = "3";
                break;
            case 4:
                str = "4";
                break;
            case 5:
                str = "5";
                break;
            case 6:
                str = "6";
                break;
            case 7:
                str = "7";
                break;
            case 8:
                str = "8";
                break;
            case 9:
                str = "9";
                break;
            case 10:
                str = "10";
                break;
            case 11:
                str = "J";
                break;
            case 12:
                str = "Q";
                break;
            case 13:
                str = "K";
                break;                        
        }
        return str;
    }
    
    /**
     * 
     * @param cardNumber.  Number of input card (1-52).
     * @return Suit of card.
     */
    public String getSuit(int cardNumber) {
        int suitValue = 0;
        String str = "";
        suitValue = hand[cardNumber].getSuit();
        switch (suitValue) {
            case 1:
                str = "Diamonds";
                break;
            case 2:
                str = "Hearts";
                break;
            case 3:
                str = "Spades";
                break;
            case 4:
                str = "Clubs";
                break;
        }
        return str;
    }
    
    /**
     * 
     * @return True if hand is royal flush.
     */
    public boolean isRoyalFlush() {
        boolean isRoyalFlush = false;
        if ((hand[0].getRank() == 10 && hand[1].getRank() == 11 && hand[2].getRank() == 12 &&
             hand[3].getRank() == 13 && hand[4].getRank() == 1) &&
            (hand[0].getSuit() == hand[1].getSuit() && hand[0].getSuit() == hand[2].getSuit() && 
             hand[0].getSuit() == hand[3].getSuit() && hand[0].getSuit() == hand[4].getSuit())){
            isRoyalFlush = true;
        }
        return isRoyalFlush;
    }
    
    /**
     * 
     * @return True if hand is straight flush.
     */
    public boolean isStraightFlush() {
        boolean isStraightFlush = false;
        if (((hand[1].getRank() == (hand[0].getRank() + 1)) &&
             (hand[2].getRank() == (hand[1].getRank() + 1)) &&
             (hand[3].getRank() == (hand[2].getRank() + 1)) &&
             (hand[4].getRank() == (hand[3].getRank() + 1))) &&
            ((hand[0].getSuit() == hand[1].getSuit() && hand[0].getSuit() == hand[2].getSuit() && 
              hand[0].getSuit() == hand[3].getSuit() && hand[0].getSuit() == hand[4].getSuit()))) {
            isStraightFlush = true;
        }
        return isStraightFlush;
    }
    
    /**
     * 
     * @return True if hand is four of a kind.
     */
    public boolean isFourOfaKind() {
        boolean isFourOfaKind = false;
        if (((hand[0].getRank() == hand[1].getRank() && hand[0].getRank() == hand[2].getRank() &&
              hand[0].getRank() == hand[3].getRank())) ||
            ((hand[1].getRank() == hand[2].getRank() && hand[1].getRank() == hand[3].getRank() &&
              hand[1].getRank() == hand[4].getRank()))) {
            isFourOfaKind = true;
        }
        return isFourOfaKind;
    }
    
    /**
     * 
     * @return True if hand is full house. 
     */
    public boolean isFullHouse() {
        boolean isFullHouse = false;
        if ((((hand[0].getRank() == hand[1].getRank() && hand[0].getRank() == hand[2].getRank())) &&
              (hand[3].getRank() == hand[4].getRank())) ||
            (((hand[2].getRank() == hand[3].getRank() && hand[2].getRank() == hand[4].getRank())) &&
              (hand[0].getRank() == hand[1].getRank()))) {
            isFullHouse = true;
        }
        return isFullHouse;
    }
    
    /**
     * 
     * @return True if hand is flush.
     */
    public boolean isFlush() {
        boolean isFlush = false;
        if  (hand[0].getSuit() == hand[1].getSuit() && hand[0].getSuit() == hand[2].getSuit() && 
             hand[0].getSuit() == hand[3].getSuit() && hand[0].getSuit() == hand[4].getSuit()){
            isFlush = true;
        }
        return isFlush;
    }
    
    /**
     * 
     * @return True if hand is straight. 
     */
    public boolean isStraight() {
        boolean isStraight = false;
        if (((hand[1].getRank() == (hand[0].getRank() + 1)) &&
             (hand[2].getRank() == (hand[1].getRank() + 1)) &&
             (hand[3].getRank() == (hand[2].getRank() + 1)) &&
             (hand[4].getRank() == (hand[3].getRank() + 1)))) {
            isStraight = true;
        }
        return isStraight;
    }
    
    /**
     * 
     * @return True if hand is three of a kind. 
     */
    public boolean isThreeOfaKind() {
        boolean isThreeOfaKind = false;
        if (((hand[0].getRank() == hand[1].getRank() && hand[0].getRank() == hand[2].getRank())) ||
            ((hand[1].getRank() == hand[2].getRank() && hand[1].getRank() == hand[3].getRank())) ||
            ((hand[2].getRank() == hand[3].getRank() && hand[2].getRank() == hand[4].getRank()))) {
            isThreeOfaKind = true;
        }
        return isThreeOfaKind;
    }
    
    /**
     * 
     * @return True if hand is two pair. 
     */
    public boolean isTwoPair() {
        boolean isTwoPair = false;
        if (((hand[0].getRank() == hand[1].getRank() && 
             (hand[2].getRank() == hand[3].getRank() || hand[3].getRank() == hand[4].getRank()))) ||
            ((hand[1].getRank() == hand[2].getRank() &&
             (hand[3].getRank() == hand[4].getRank())))) {
            isTwoPair = true;
        }
        return isTwoPair;
    }
    
    /**
     * 
     * @return True if hand is one pair. 
     */
    public boolean isOnePair() {
        boolean isOnePair = false;
        if (hand[0].getRank() == hand[1].getRank() ||
           (hand[1].getRank() == hand[2].getRank() ||
           (hand[2].getRank() == hand[3].getRank() ||
           (hand[3].getRank() == hand[4].getRank())))) {
            isOnePair = true;
        }
        return isOnePair;
    }
    
    @Override
    public String toString() {
        String str = ("The player's hand is: \n" +
                      "\t" + getRank(0) + " of " + getSuit(0) + "\n" +
                      "\t" + getRank(1) + " of " + getSuit(1) + "\n" +
                      "\t" + getRank(2) + " of " + getSuit(2) + "\n" +
                      "\t" + getRank(3) + " of " + getSuit(3) + "\n" +
                      "\t" + getRank(4) + " of " + getSuit(4) + "\n\n");
        return str;
    }
    
}
