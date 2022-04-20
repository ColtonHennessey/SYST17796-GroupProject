package ca.sheridancollege.project;


public class Card
{
   private Suit suit;
   private Value value;
   public boolean isCardUp;

   public Card (Value value, Suit suit)
   {
      this.value = value;
      this.suit = suit;
      this.isCardUp = false;
   }

   public String getSuit ()
   {
      return this.suit.printSuit();
   }

   public int getValue ()
   {
      return this.value.getValue();
   }

   public String printValue ()
   {
      return value.printValue();
   }

   public void flipCard ()
   {
      isCardUp = !isCardUp;
   }

   @Override
   public String toString ()
   {
      String str = "";
      if (isCardUp) {

         str += value.printValue() + " of " + suit.printSuit();
      }
      return str;
   }
}
