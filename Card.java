/**
 * A single card in a deck.
 * 
 * @author Kenneth Ingham
 */
public class Card {
    final private Suit s;
    final private Value v;
    
    /**
     * Construct a card give the suit and value.
     * 
     * @param s the suit for the card
     * @param v the value for the card
     */
    public Card(Suit s, Value v) {
        this.s = s;
        this.v = v;
    }
    
    /**
     * Get the card's suit.
     * 
     * @return the suit
     */
    public Suit getSuit() { return s; }
    
    /**
     * Get the card's value.
     * 
     * @return the value
     */
    public Value getValue() { return v; }
    
    /**
     * Convert the card into a string describing the card.
     * 
     * @return a string containing the value and suit.
     */
    //public String toString() { return v.toString() + " of " + s.toString(); }
    public String toString() { return Value.toString(v) + " of " +
    Suit.toString(s); }
}
