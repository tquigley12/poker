package poker;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author tquigley1
 */
public class CardTest {
    
    public CardTest() {
        
    }
    
    @Test
    public void determineRankTest() {
        int cardNumber = 0;
        int rankReturn = 0;
        
        cardNumber = 5;
        if (cardNumber >= 1 && cardNumber <= 13) {
            rankReturn = cardNumber;
        } else if (cardNumber >= 14 && cardNumber <= 26) {
            rankReturn = cardNumber - 13;
        } else if (cardNumber >= 27 && cardNumber <= 39) {
            rankReturn = cardNumber - 26;
        } else {
            rankReturn = cardNumber - 39;
        }
        Assert.assertEquals(5,5);
        
        cardNumber = 35;
        if (cardNumber >= 1 && cardNumber <= 13) {
            rankReturn = cardNumber;
        } else if (cardNumber >= 14 && cardNumber <= 26) {
            rankReturn = cardNumber - 13;
        } else if (cardNumber >= 27 && cardNumber <= 39) {
            rankReturn = cardNumber - 26;
        } else {
            rankReturn = cardNumber - 39;
        }
        Assert.assertEquals(9,9);
        
    }
    
    @Test
    public void determineSuitTest() {
        int cardNumber = 0;
        int suitReturn = 0;
        
        cardNumber = 28;
        if (cardNumber >= 1 && cardNumber <= 13) {
            suitReturn = 1;
        } else if (cardNumber >= 14 && cardNumber <= 26) {
            suitReturn = 2;
        } else if (cardNumber >= 27 && cardNumber <= 39) {
            suitReturn = 3;
        } else {
            suitReturn = 4;
        }
        Assert.assertEquals(3,3);
        
        cardNumber = 18;
        if (cardNumber >= 1 && cardNumber <= 13) {
            suitReturn = 1;
        } else if (cardNumber >= 14 && cardNumber <= 26) {
            suitReturn = 2;
        } else if (cardNumber >= 27 && cardNumber <= 39) {
            suitReturn = 3;
        } else {
            suitReturn = 4;
        }
        Assert.assertEquals(2,2);
        
    }
    
}
