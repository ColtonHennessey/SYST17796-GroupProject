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
      boolean allCardsUp = true;
      String str = "";
      for (Card card : cards) {
         str += card.toString() + "\n";
         if (!card.isCardUp) {
            allCardsUp = false;
         }
      }
      if (allCardsUp) {
         str += "Total score = " + getTotalValue() + " \n";
      }
      return str;
   }

   public void flipCards ()
   {
      for (Card card : cards) {
         card.flipCard();
      }
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

   public int getTotalValue ()
   {
      int totalScore = 0;
      boolean hasAce = false;
      for (int i = 0; i < cards.size(); i++) {
         totalScore += cards.get(i).getValue();
         if (cards.get(i).printValue().equals("Ace")) {
            hasAce = true;
         }
         if (hasAce && totalScore <= 11) {
            totalScore += 10;
         }
      }
      return totalScore;
   }

   @Override
   public String toString ()
   {
      String str = " ";
      for (Card card : cards) {
         str += card.toString() + " \n";
      }
      return str;
   }
}
