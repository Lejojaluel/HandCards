/**
 * Driver for testing the classes related to a deck of cards
 *
 * @author Leroy Valencia
 */
import java.util.Random;

public class CardsTest {
  public static void main(String[] args) throws IllegalArgumentException {
    Deck d = new Deck();
    Random r = new Random();
    // Random placeholder variable to have randoms cards chosen from deck
    int ra = 0;
    // The constructor for Hand as well as hand2 to test functionality
    Hand hand = new Hand(6);
    Hand hand2 = new Hand(1);
    Hand hand4 = new Hand(5);

    // This is a for loop that adds random cards into hand referencing the deck for cards
    int howManyCards = 6;
    for (int i = 0; i < howManyCards; i++) {
      ra = r.nextInt(d.getDeckSize()); // Generates random number to pick from deck
      if (ra < 0) {
        ra *= -1;
      } // Some weird bug would have ra be not positive. This fixes that
      hand.addCard(d.getCardAt(r.nextInt(ra))); // Adds this card from getCardAt(ra) to the Hand
    }

    // -------------------------
    // --------Test 1----------- Tests adding a card after max capacity
    // -------------------------
    // This was to just test functionality of another constructor and its bound limits
    hand2.addCard(d.getCardAt(2));
    try {
      hand2.addCard(d.getCardAt(23));
    } catch (IllegalArgumentException e) {
      System.err.println(e);
    }
    // -------------------------
    // --------Test 2----------- This is the test you marked me points off for.
    // ------------------------- GettingACardAt an index more than the total cards
    try {
      hand4.getCardAt(23);
    } catch (IllegalArgumentException e) {
      System.err.println(e);
    }
    // -------------------------
    // --------Test 3----------- Tests totalcards more than deck limit in hand capacity
    // -------------------------
    try {
      Hand hand5 = new Hand(60);
    } catch (IllegalArgumentException e) {
      System.err.println(e);
    }
    // -------------------------
    // --------Test 4----------- Tests totalcards in hand to 0
    // -------------------------
    try {
      Hand hand5 = new Hand(-1);
    } catch (IllegalArgumentException e) {
      System.err.println(e);
    }
    // -------------------------
    // --------Test 5----------- Tests for getting a card number lower than the number of cards
    // -------------------------
    try {
      hand2.getCardAt(-1);
    } catch (IllegalArgumentException e) {
      System.err.println(e);
    }
    // -------------------------
    // --------Test 6----------- Adding a card that isnt from the deck after max capacity
    // -------------------------
    try {
      hand2.addCard(new Card(Suit.CLUBS, Value.ACE));
    } catch (IllegalArgumentException e) {
      System.err.println(e);
    }
    // -------------------------
    // --------Test 7----------- Tests if adding a new card that isnt a valid card
    // ------------------------- the compiler catches this so uncomment the statement in the try
    // block
    try {
      // hand2.addCard(new Card(Suit., Value.ACE));
    } catch (IllegalArgumentException e) {
      System.err.println(e);
    }

    //    // This for loop, loops through the hand.getCards() method that returns the hand as array
    //    for (Card c : hand.getCards()) {
    //      System.out.println(c.toString());
    //    }
    System.out.println("===End of Hand==="); // signify end of Hand 1 just for debugging

    // Simple test for the hand.getCardAt(index) function
    System.out.println("\nGet Card at 5 is: " + hand.getCardAt(5) + "\n");

    // This for loop, loops through hand2 constructor getCards()
    for (Card a : hand2.getCards()) {
      System.out.println(a.toString());
    }
    System.out.println("===End of Hand2===");

    //        d.shuffle(); //I turned off shuffle to be able to see the cards in order

    // This for loop loops through the Deck of cards
    //    for (Card c : d.getCards()) {
    //      System.out.println(c.toString());
    //    }
  }
}
