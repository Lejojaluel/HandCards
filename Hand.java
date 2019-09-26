/**
 * This will be the object that holds a the hand of cards.
 * @author Leroy Valencia
 */
import java.util.Random;
public class Hand {
    private int nCards = Deck.getDeckSize();
    private Card hand[] = new Card[nCards];

    /**
     * The constructor for the Hands.
     * @param totalCards
     */
    public Hand(int totalCards){

    }

    /**
     * Setter to add cards to the Hand.
     * @param c The card that is going to be added.
     */
    public void addCard(Card c){

    }

    /**
     * Getter for the cards in Hand.
     * @return the cards in the Hand
     */
    public Card[] getCards(){
        return hand;
    }

    /**
     * Getter for a single card and index i.
     * @param i location of the card in the hand
     * @return the card at i location
     */
    public Card getCardAt(int i){
        if (!validateCardNum(i)) {
            throw new IllegalArgumentException(
                    String.format("Invalid card num i (%d) in getCard. Valid range [0,%d]",
                            i, nCards-1));
        }
        return hand[i];
    }

    /**
     * Validate the card number
     * @param num input of the card number
     * @return if num is within the range boolean
     */
    private boolean validateCardNum(int num) {
        return  (num >= 0 && num < nCards);
    }
}
