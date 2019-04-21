package poker;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author tquigley1
 */
public class HandTest {
    
    public HandTest() {
        
    }
    
    @Test
    public void isRoyalFlushTest() {
        Card[] hand = new Card[5];
        Card cardObj0 = new Card();
        Card cardObj1 = new Card();
        Card cardObj2 = new Card();
        Card cardObj3 = new Card();
        Card cardObj4 = new Card();
        cardObj0.setRank(10);
        cardObj1.setRank(11);
        cardObj2.setRank(12);
        cardObj3.setRank(13);
        cardObj4.setRank(1);
        cardObj0.setSuit(1);
        cardObj1.setSuit(1);
        cardObj2.setSuit(1);
        cardObj3.setSuit(1);
        cardObj4.setSuit(1);
        hand[0] = cardObj0;
        hand[1] = cardObj1;
        hand[2] = cardObj2;
        hand[3] = cardObj3;
        hand[4] = cardObj4;

        boolean isRoyalFlush = false;
        if ((hand[0].getRank() == 10 && hand[1].getRank() == 11 && hand[2].getRank() == 12 &&
             hand[3].getRank() == 13 && hand[4].getRank() == 1) &&
            (hand[0].getSuit() == hand[1].getSuit() && hand[0].getSuit() == hand[2].getSuit() && 
             hand[0].getSuit() == hand[3].getSuit() && hand[0].getSuit() == hand[4].getSuit())){
            isRoyalFlush = true;
        }
        
        Assert.assertTrue(isRoyalFlush);
        
    }
    
    
    @Test
    public void isStraightFlushTest() {
        Card[] hand = new Card[5];
        Card cardObj0 = new Card();
        Card cardObj1 = new Card();
        Card cardObj2 = new Card();
        Card cardObj3 = new Card();
        Card cardObj4 = new Card();
        cardObj0.setRank(2);
        cardObj1.setRank(3);
        cardObj2.setRank(4);
        cardObj3.setRank(5);
        cardObj4.setRank(6);
        cardObj0.setSuit(1);
        cardObj1.setSuit(1);
        cardObj2.setSuit(1);
        cardObj3.setSuit(1);
        cardObj4.setSuit(1);
        hand[0] = cardObj0;
        hand[1] = cardObj1;
        hand[2] = cardObj2;
        hand[3] = cardObj3;
        hand[4] = cardObj4;
        
        boolean isStraightFlush = false;
        if (((hand[1].getRank() == (hand[0].getRank() + 1)) &&
             (hand[2].getRank() == (hand[1].getRank() + 1)) &&
             (hand[3].getRank() == (hand[2].getRank() + 1)) &&
             (hand[4].getRank() == (hand[3].getRank() + 1))) &&
            ((hand[0].getSuit() == hand[1].getSuit() && hand[0].getSuit() == hand[2].getSuit() && 
              hand[0].getSuit() == hand[3].getSuit() && hand[0].getSuit() == hand[4].getSuit()))) {
            isStraightFlush = true;
        }
        
        Assert.assertTrue(isStraightFlush);

    }
    
    @Test
    public void isFourOfaKindTest() {
        Card[] hand = new Card[5];
        Card cardObj0 = new Card();
        Card cardObj1 = new Card();
        Card cardObj2 = new Card();
        Card cardObj3 = new Card();
        Card cardObj4 = new Card();
        cardObj0.setRank(2);
        cardObj1.setRank(2);
        cardObj2.setRank(2);
        cardObj3.setRank(2);
        cardObj4.setRank(6);
        cardObj0.setSuit(1);
        cardObj1.setSuit(3);
        cardObj2.setSuit(3);
        cardObj3.setSuit(2);
        cardObj4.setSuit(4);
        hand[0] = cardObj0;
        hand[1] = cardObj1;
        hand[2] = cardObj2;
        hand[3] = cardObj3;
        hand[4] = cardObj4;
        
        boolean isFourOfaKind = false;
        if (((hand[0].getRank() == hand[1].getRank() && hand[0].getRank() == hand[2].getRank() &&
              hand[0].getRank() == hand[3].getRank())) ||
            ((hand[1].getRank() == hand[2].getRank() && hand[1].getRank() == hand[3].getRank() &&
              hand[1].getRank() == hand[4].getRank()))) {
            isFourOfaKind = true;
        }
        
        Assert.assertTrue(isFourOfaKind);
        
    }
    
    @Test
    public void isFullHouseTest() {
        Card[] hand = new Card[5];
        Card cardObj0 = new Card();
        Card cardObj1 = new Card();
        Card cardObj2 = new Card();
        Card cardObj3 = new Card();
        Card cardObj4 = new Card();
        cardObj0.setRank(2);
        cardObj1.setRank(2);
        cardObj2.setRank(2);
        cardObj3.setRank(6);
        cardObj4.setRank(6);
        cardObj0.setSuit(1);
        cardObj1.setSuit(3);
        cardObj2.setSuit(3);
        cardObj3.setSuit(2);
        cardObj4.setSuit(4);
        hand[0] = cardObj0;
        hand[1] = cardObj1;
        hand[2] = cardObj2;
        hand[3] = cardObj3;
        hand[4] = cardObj4;
        
        boolean isFullHouse = false;
        if ((((hand[0].getRank() == hand[1].getRank() && hand[0].getRank() == hand[2].getRank())) &&
              (hand[3].getRank() == hand[4].getRank())) ||
            (((hand[2].getRank() == hand[3].getRank() && hand[2].getRank() == hand[4].getRank())) &&
              (hand[0].getRank() == hand[1].getRank()))) {
            isFullHouse = true;
        }
        
        Assert.assertTrue(isFullHouse);
        
    }
    
    @Test
    public void isFlushTest() {
        Card[] hand = new Card[5];
        Card cardObj0 = new Card();
        Card cardObj1 = new Card();
        Card cardObj2 = new Card();
        Card cardObj3 = new Card();
        Card cardObj4 = new Card();
        cardObj0.setRank(2);
        cardObj1.setRank(3);
        cardObj2.setRank(7);
        cardObj3.setRank(9);
        cardObj4.setRank(11);
        cardObj0.setSuit(1);
        cardObj1.setSuit(1);
        cardObj2.setSuit(1);
        cardObj3.setSuit(1);
        cardObj4.setSuit(1);
        hand[0] = cardObj0;
        hand[1] = cardObj1;
        hand[2] = cardObj2;
        hand[3] = cardObj3;
        hand[4] = cardObj4;
        
        boolean isFlush = false;
        if  (hand[0].getSuit() == hand[1].getSuit() && hand[0].getSuit() == hand[2].getSuit() && 
             hand[0].getSuit() == hand[3].getSuit() && hand[0].getSuit() == hand[4].getSuit()){
            isFlush = true;
        }
        
        Assert.assertTrue(isFlush);
        
    }
    
    @Test
    public void isStraightTest() {
        Card[] hand = new Card[5];
        Card cardObj0 = new Card();
        Card cardObj1 = new Card();
        Card cardObj2 = new Card();
        Card cardObj3 = new Card();
        Card cardObj4 = new Card();
        cardObj0.setRank(2);
        cardObj1.setRank(3);
        cardObj2.setRank(4);
        cardObj3.setRank(5);
        cardObj4.setRank(6);
        cardObj0.setSuit(1);
        cardObj1.setSuit(1);
        cardObj2.setSuit(2);
        cardObj3.setSuit(3);
        cardObj4.setSuit(1);
        hand[0] = cardObj0;
        hand[1] = cardObj1;
        hand[2] = cardObj2;
        hand[3] = cardObj3;
        hand[4] = cardObj4;
        
        boolean isStraight = false;
        if (((hand[1].getRank() == (hand[0].getRank() + 1)) &&
             (hand[2].getRank() == (hand[1].getRank() + 1)) &&
             (hand[3].getRank() == (hand[2].getRank() + 1)) &&
             (hand[4].getRank() == (hand[3].getRank() + 1)))) {
            isStraight = true;
        }
        
        Assert.assertTrue(isStraight);
        
    }
    
    @Test
    public void isThreeOfaKindTest() {
        Card[] hand = new Card[5];
        Card cardObj0 = new Card();
        Card cardObj1 = new Card();
        Card cardObj2 = new Card();
        Card cardObj3 = new Card();
        Card cardObj4 = new Card();
        cardObj0.setRank(2);
        cardObj1.setRank(3);
        cardObj2.setRank(4);
        cardObj3.setRank(4);
        cardObj4.setRank(4);
        cardObj0.setSuit(1);
        cardObj1.setSuit(1);
        cardObj2.setSuit(2);
        cardObj3.setSuit(3);
        cardObj4.setSuit(1);
        hand[0] = cardObj0;
        hand[1] = cardObj1;
        hand[2] = cardObj2;
        hand[3] = cardObj3;
        hand[4] = cardObj4;
        
        boolean isThreeOfaKind = false;
        if (((hand[0].getRank() == hand[1].getRank() && hand[0].getRank() == hand[2].getRank())) ||
            ((hand[1].getRank() == hand[2].getRank() && hand[1].getRank() == hand[3].getRank())) ||
            ((hand[2].getRank() == hand[3].getRank() && hand[2].getRank() == hand[4].getRank()))) {
            isThreeOfaKind = true;
        }
        
        Assert.assertTrue(isThreeOfaKind);
        
    }
    
    @Test
    public void isTwoPairTest() {
        Card[] hand = new Card[5];
        Card cardObj0 = new Card();
        Card cardObj1 = new Card();
        Card cardObj2 = new Card();
        Card cardObj3 = new Card();
        Card cardObj4 = new Card();
        cardObj0.setRank(2);
        cardObj1.setRank(3);
        cardObj2.setRank(3);
        cardObj3.setRank(4);
        cardObj4.setRank(4);
        cardObj0.setSuit(1);
        cardObj1.setSuit(1);
        cardObj2.setSuit(2);
        cardObj3.setSuit(3);
        cardObj4.setSuit(1);
        hand[0] = cardObj0;
        hand[1] = cardObj1;
        hand[2] = cardObj2;
        hand[3] = cardObj3;
        hand[4] = cardObj4;
        
        boolean isTwoPair = false;
        if (((hand[0].getRank() == hand[1].getRank() && 
             (hand[2].getRank() == hand[3].getRank() || hand[3].getRank() == hand[4].getRank()))) ||
            ((hand[1].getRank() == hand[2].getRank() &&
             (hand[3].getRank() == hand[4].getRank())))) {
            isTwoPair = true;
        }
        
        Assert.assertTrue(isTwoPair);
        
    }
    
    @Test
    public void isOnePairTest() {
        Card[] hand = new Card[5];
        Card cardObj0 = new Card();
        Card cardObj1 = new Card();
        Card cardObj2 = new Card();
        Card cardObj3 = new Card();
        Card cardObj4 = new Card();
        cardObj0.setRank(2);
        cardObj1.setRank(3);
        cardObj2.setRank(3);
        cardObj3.setRank(4);
        cardObj4.setRank(5);
        cardObj0.setSuit(1);
        cardObj1.setSuit(1);
        cardObj2.setSuit(2);
        cardObj3.setSuit(3);
        cardObj4.setSuit(1);
        hand[0] = cardObj0;
        hand[1] = cardObj1;
        hand[2] = cardObj2;
        hand[3] = cardObj3;
        hand[4] = cardObj4;
        
        boolean isOnePair = false;
        if (hand[0].getRank() == hand[1].getRank() ||
           (hand[1].getRank() == hand[2].getRank() ||
           (hand[2].getRank() == hand[3].getRank() ||
           (hand[3].getRank() == hand[4].getRank())))) {
            isOnePair = true;
        }
        
        Assert.assertTrue(isOnePair);
        
    }

}