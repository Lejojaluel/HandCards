/**
 * Simple example of an enum class.
 *
 * @author Kenneth Ingham
 */
public enum Suit {
  HEARTS,
  DIAMONDS,
  SPADES,
  CLUBS;

  /**
   * Convert the enum value to a string. Note that there is a non-static version provided by Java.
   * However, the names of the constants are ugly, so this cleans them up.
   *
   * @param s the suit to convert
   * @return the string value of s
   */
  public static String toString(Suit s) {
    switch (s) {
      case HEARTS:
        return "Hearts";
      case DIAMONDS:
        return "Diamonds";
      case SPADES:
        return "Spades";
      case CLUBS:
        return "Clubs";
      default:
        System.err.println("Impossible suit value in Suit.toString" + s);
        System.exit(1);
    }
    /*NOTREACHED*/
    return "Impossible";
  }
}
