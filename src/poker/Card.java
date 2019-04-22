package poker;

/**
 * This class represents a playing card.
 * @author tquigley1
 */
public class Card {
    
    private int rank = 0;
    private int suit = 0;
    
    public Card() {
        this.rank = 0;
        this.suit = 0;
    }

    /**
     * 
     * @param cardNumber.  Number of input card (1-52).
     * @return Value of card rank (1-13), ranked from Ace low to King high. 
     */
    public int determineRank(int cardNumber) {
        int rankReturn = 0;
        if (cardNumber >= 1 && cardNumber <= 13) {
            rankReturn = cardNumber;
        } else if (cardNumber >= 14 && cardNumber <= 26) {
            rankReturn = cardNumber - 13;
        } else if (cardNumber >= 27 && cardNumber <= 39) {
            rankReturn = cardNumber - 26;
        } else {
            rankReturn = cardNumber - 39;
        }
        return rankReturn;
    }
    
    /**
     * 
     * @param cardNumber.  Number of input card (1-52).
     * @return Value of card suit (1-4), 1 is diamonds, 2 is hearts, 
     * 3 is spades, and 4 is clubs.
     */
    public int determineSuit(int cardNumber) {
        int suitReturn = 0;
        if (cardNumber >= 1 && cardNumber <= 13) {
            suitReturn = 1;
        } else if (cardNumber >= 14 && cardNumber <= 26) {
            suitReturn = 2;
        } else if (cardNumber >= 27 && cardNumber <= 39) {
            suitReturn = 3;
        } else {
            suitReturn = 4;
        }
        return suitReturn;
    }
    
    /**
     * 
     * @return Rank of playing card. 
     */
    public int getRank() {
        return rank;
    }

    /**
     * 
     * @param rank.  Set rank of playing card.
     */
    public void setRank(int rank) {
        this.rank = rank;
    }

    /**
     * 
     * @return Suit of playing card.
     */
    public int getSuit() {
        return suit;
    }

    /**
     * 
     * @param suit.  Set suit of playing card.
     */
    public void setSuit(int suit) {
        this.suit = suit;
    }
  
}
