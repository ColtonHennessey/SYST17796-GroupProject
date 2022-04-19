/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;
import java.util.Collections;
public class Deck extends Hand
{
   public void fillDeck ()
   {
      for (Suit suit : Suit.values()) {
         for (Value value : Value.values()) {
            Card card = new Card(value, suit);
            this.add(card);
         }
      }
   }

   public void shuffleDeck ()
   {
      Collections.shuffle(cards);
   }

   public void deal (Hand hand, int numOfCards)
   {
      for (int i = 0; i < numOfCards; i++) {
         this.giveCard(cards.get(0), hand);
      }
   }

   public void flipCard (Card card)
   {
      card.flipCard();
   }
}
