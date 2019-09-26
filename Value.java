/**
 * Values for cards.  Cx are because we need an identifier, not an integer.
 * 
 * @author Kenneth Ingham
 */
public enum Value {
    ACE, C2, C3, C4, C5, C6, C7, C8, C9, C10, JACK, QUEEN, KING;
    
    /**
     * Convert the enum value to a string.  Note that there is a non-static
     * version provided by Java.  However, the names of the constants are ugly, 
     * so this cleans them up.
     * 
     * @param v the value to convert
     * @return the string value of v
     */
    public static String toString(Value v) {
        switch(v) {
            case ACE: return "Ace";
            case C2: return "2";
            case C3: return "3";
            case C4: return "4";
            case C5: return "5";
            case C6: return "6";
            case C7: return "7";
            case C8: return "8";
            case C9: return "9";
            case C10: return "10";
            case JACK: return "Jack";
            case QUEEN: return "Queen";
            case KING: return "King";
            default: 
                System.err.println("Missing value in value.toString?");
                System.exit(1);
        }
        /*NOTREACHED*/
        return "Impossible";
    }
}
