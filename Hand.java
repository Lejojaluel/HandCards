/**
 * This will be the object that holds a the hand of cards.
 *
 * @author Leroy Valencia
 */
import java.util.Random;
import java.util.ArrayList;

public class Hand {
  /* To limit the arraylist size by the deck size.
  I went with an array list because I could easily add the cards to the list instead of having to deal with
  what index it is next to add the card in an array.
  */
  private int nCards = Deck.getDeckSize();
  private ArrayList<Card> hand = new ArrayList<Card>(nCards);

  /**
   * The constructor for the Hands.
   *
   * @param totalCards The total cards wanted by the caller in the hand.
   */
  public Hand(int totalCards) {
    // This will dictate how many total cards are in the hand
    // By limiting the ArrayList this also validates the number given before implementing
    if (!validateCardNum(totalCards)) {
      throw new IllegalArgumentException(
          "Invalid totalCard ("
              + totalCards
              + ") num in Constructor. Valid range [0,"
              + (nCards - 1)
              + "}.");
    }
    nCards = totalCards;
  }

  /**
   * Setter to add cards to the Hand.
   *
   * @param c The card that is going to be added.
   */
  public void addCard(Card c) {
    // This is validating the card is not going to be greater then the totalCard size of the
    // constructor
    if (hand.size() < nCards) {
      hand.add(c);
    } else {
      // throws exception if the Hand size is at the limit nCards
      throw new IllegalArgumentException(
          "Can't add card because the hand is at max capacity of Total Cards.");
    }
  }

  /**
   * Getter for the cards in Hand.
   *
   * @return the cards in the Hand
   */
  public ArrayList<Card> getCards() {
    return hand;
  }

  /**
   * Getter for a single card and index i.
   *
   * @param i location of the card in the hand
   * @return the card at i location
   */
  public Card getCardAt(int i) {
    // this works nicely because nCards is updated to the totalCards in a hand which will be the new
    // bounds for validateCardnNum
    if (!validateCardNum(i)) {
      throw new IllegalArgumentException(
          String.format("Invalid card num i (%d) in getCard. Valid range [0,%d]", i, nCards - 1));
    }
    return hand.get(i);
  }

  /**
   * Validate the card number
   *
   * @param num input of the card number
   * @return if num is within the range boolean
   */
  private boolean validateCardNum(int num) {
    return (num >= 0 && num < nCards);
  }
}
