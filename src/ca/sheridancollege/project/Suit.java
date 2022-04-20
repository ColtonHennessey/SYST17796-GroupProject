package ca.sheridancollege.project;

public enum Suit
{
   HEARTS("Hearts"),
   DIAMONDS("Diamonds"),
   SPADES("Spades"),
   CLUBS("Clubs");
   private final String suitText;

   private Suit (String suitText)
   {
      this.suitText = suitText;
   }

   public String printSuit ()
   {
      return this.suitText;
   }
}
