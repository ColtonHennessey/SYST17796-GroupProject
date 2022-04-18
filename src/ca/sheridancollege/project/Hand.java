package ca.sheridancollege.project;
import java.util.ArrayList;
/**
 * @author Colton Hennessey
 */
public class Hand
{
   protected final ArrayList<Card> cards;

   public Hand ()
   {
      cards = new ArrayList<>();
   }

   public void add (Card card)
   {
      cards.add(card);
   }

   public String showHand ()
   {
      String str = "";
      for (Card card : cards) {
         str += card.toString() + "\n";
      }
      return str;
   }

   public boolean giveCard (Card card, Hand otherHand)
   {
      if (cards.contains(card)) {
         cards.remove(card);
         otherHand.add(card);
         return true;
      }
      else {
         return false;
      }
   }
}
