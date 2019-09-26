/**
 * A deck of cards
 * 
 * @author Leroy Valencia
 */

import java.util.Random;

public class Deck {
    private static final int nCards = Suit.values().length * Value.values().length;
    private Card cards[] = new Card[nCards];

    /**
     * Constructor creates all valid cards in the deck
     */
    public Deck() {
        int i=0;
        for (Suit s: Suit.values()) {
            for (Value v: Value.values()) {
                cards[i++] = new Card(s, v);
            }
        }
    }
    /**
     * validate that the card number is valid.
     * 
     * @param num the card numer that should be in [0,nCards-1]
     * @return boolean indicating if num is in range.
     */
     private boolean validateCardNum(int num) {
        return  (num >= 0 && num < nCards);
     }
    
    /**
     * swap two cards
     * @param i the first card
     * @param j the second card
     */
    private void swap(int i, int j) {
        if (!validateCardNum(i)) {
            throw new IllegalArgumentException(
                String.format("Invalid subscript i (%d) in swap. Valid range [0,%d]",
                i, nCards-1));
        }
        if (!validateCardNum(j))
            throw new IllegalArgumentException(
                String.format("Invalid subscript j (%d) in swap. Valid range [0,%d]",
                j, nCards-1));

        Card temp;
        if (i == j)
            return; // nothing to do
        
        temp = cards[i];
        cards[i] = cards[j];
        cards[j] = temp;
    }
    
    /**
     * shuffle the deck.  Probably don't need to do it cards.length ^ 2 times.
     */
    public void shuffle() {
        Random r = new Random();
        for (int i=0; i<cards.length; ++i) {
            for (int j=0; j<cards.length; ++j) {
                swap(i, r.nextInt(nCards));
                swap(j, r.nextInt(nCards));
            }
        }
    }
    
    /**
     * get the deck of cards.
     * 
     * @return the current set of cards.
     */
    public Card[] getCards() {
        return cards;
    }

    /**
     * get a single card
     *
     * @param i the card to get; a card can be gotten more than once
     * @return the ith card
     */
     public Card getCardAt(int i) {
        if (!validateCardNum(i)) {
            throw new IllegalArgumentException(
                String.format("Invalid card num i (%d) in getCard. Valid range [0,%d]",
                i, nCards-1));
        }
         return cards[i];
     }

     /**
      * get the size of a deck
      *
      * @return nCards
      */
      public static int getDeckSize() {
          return nCards;
      }
}
