/**
 * Driver for testing the classes related to a deck of cards
 * 
 * @author Kenneth Ingham
 */

public class CardsTest {
    public static void main(String[] args) {
        Deck d = new Deck();
        //d.shuffle();
        for (Card c : d.getCards()) {
            System.out.println(c.toString());
        }
    }
}
