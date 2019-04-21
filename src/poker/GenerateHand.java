package poker;

import java.util.Random;

/**
 * This class will generate a random 5-card hand.
 * @author tquigley1
 */
public class GenerateHand {

    private int card1, card2, card3, card4, card5 = 0;
    private int rank1, rank2, rank3, rank4, rank5 = 0;
    private int suit1, suit2, suit3, suit4, suit5 = 0;
    private final int MAX_VALUE = 52;
    
    public GenerateHand(Card[] card) {
        
        Random randomNumber = new Random();
        boolean validCard = false;
        int[] order = new int[5];
        Card cardTest = new Card();
        Card cardObj0 = new Card();
        Card cardObj1 = new Card();
        Card cardObj2 = new Card();
        Card cardObj3 = new Card();
        Card cardObj4 = new Card();
        
        /**
         * Generate hand of poker, one card at a time.
         */
        
        validCard = false;
        do {
            card1 = randomNumber.nextInt(MAX_VALUE) + 1;
            if ((card1 != card2) &&
                (card1 != card3) &&
                (card1 != card4) &&
                (card1 != card5))
                validCard = true;
        } while (!validCard);
        rank1 = cardTest.determineRank(card1);
        suit1 = cardTest.determineSuit(card1);

        validCard = false;
        do {
            card2 = randomNumber.nextInt(MAX_VALUE) + 1;
            if ((card2 != card1) &&
                (card2 != card3) &&
                (card2 != card4) &&
                (card2 != card5))
                validCard = true;
        } while (!validCard);
        rank2 = cardTest.determineRank(card2);
        suit2 = cardTest.determineSuit(card2);

        validCard = false;
        do {
            card3 = randomNumber.nextInt(MAX_VALUE) + 1;
            if ((card3 != card1) &&
                (card3 != card2) &&
                (card3 != card4) &&
                (card3 != card5))
                validCard = true;
        } while (!validCard);
        rank3 = cardTest.determineRank(card3);
        suit3 = cardTest.determineSuit(card3);

        validCard = false;
        do {
            card4 = randomNumber.nextInt(MAX_VALUE) + 1;
            if ((card4 != card1) &&
                (card4 != card2) &&
                (card4 != card3) &&
                (card4 != card5))
                validCard = true;
        } while (!validCard);
        rank4 = cardTest.determineRank(card4);
        suit4 = cardTest.determineSuit(card4);

        validCard = false;
        do {
            card5 = randomNumber.nextInt(MAX_VALUE) + 1;
            if ((card5 != card1) &&
                (card5 != card2) &&
                (card5 != card3) &&
                (card5 != card4))
                validCard = true;
        } while (!validCard);
        rank5 = cardTest.determineRank(card5);
        suit5 = cardTest.determineSuit(card5);
        
        cardObj0.setRank(rank1);
        cardObj0.setSuit(suit1);

        cardObj1.setRank(rank2);
        cardObj1.setSuit(suit2);

        cardObj2.setRank(rank3);
        cardObj2.setSuit(suit3);

        cardObj3.setRank(rank4);
        cardObj3.setSuit(suit4);

        cardObj4.setRank(rank5);
        cardObj4.setSuit(suit5);
        
        order[0] = rank1;
        order[1] = rank2;
        order[2] = rank3;
        order[3] = rank4;
        order[4] = rank5;
        
        /**
         * Sort cards in increasing order by rank.
         */
        IntBubbleSorter.bubbleSort(order);
        
        /**
         * Re-arrange cards if hand is 10, J, Q, K and A.
         */
        if (order[0] == 1 && order[1] == 10 && order[2] == 11 && order[3] == 12 && order[4] == 13) {
            order[0] = 10;
            order[1] = 11;
            order[2] = 12;
            order[3] = 13;
            order[4] = 1;
        }
        
        /**
         * Create array of Card objects for population to Hand object.
         */
        boolean[] rankFound = new boolean[5];
        rankFound[0] = false;
        rankFound[1] = false;
        rankFound[2] = false;
        rankFound[3] = false;
        rankFound[4] = false;
        boolean found = false;
        int i = 0;
        
        i = 0;
        found = false;
        do {
            if (rank1 == order[i] && !rankFound[i]) {
                rankFound[i] = true;
                card[i] = cardObj0;
                found = true;
            } else {
                i++;
            }
        } while (!found);
        
        i = 0;
        found = false;
        do {
            if (rank2 == order[i] && !rankFound[i]) {
                rankFound[i] = true;
                card[i] = cardObj1;
                found = true;
            } else {
                i++;
            }
        } while (!found);
        
        i = 0;
        found = false;
        do {
            if (rank3 == order[i] && !rankFound[i]) {
                rankFound[i] = true;
                card[i] = cardObj2;
                found = true;
            } else {
                i++;
            }
        } while (!found);
        
        i = 0;
        found = false;
        do {
            if (rank4 == order[i] && !rankFound[i]) {
                rankFound[i] = true;
                card[i] = cardObj3;
                found = true;
            } else {
                i++;
            }
        } while (!found);
        
        i = 0;
        found = false;
        do {
            if (rank5 == order[i] && !rankFound[i]) {
                rankFound[i] = true;
                card[i] = cardObj4;
                found = true;
            } else {
                i++;
            }
        } while (!found);
        
    }
    
}