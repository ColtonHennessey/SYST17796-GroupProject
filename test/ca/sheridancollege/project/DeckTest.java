/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ca.sheridancollege.project;

import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Colton
 */
public class DeckTest
{

   public DeckTest ()
   {
   }

   @Before
   public void setUp ()
   {
   }

   /**
    * Test of fillDeck method, of class Deck.
    */
   @Test
   public void testFillDeck ()
   {
      System.out.println("fillDeck");
      Deck instance = new Deck();
      instance.fillDeck();
   }

   /**
    * Test of shuffleDeck method, of class Deck.
    */
   @Test
   public void testShuffleDeck ()
   {
      System.out.println("shuffleDeck");
      Deck instance = new Deck();
      instance.shuffleDeck();
   }

   /**
    * Test of deal method, of class Deck.
    */
   @Test
   public void testDeal ()
   {
      System.out.println("deal");
      Hand hand = null;
      int numOfCards = 0;
      Deck instance = new Deck();
      instance.deal(hand, numOfCards);
   }

   /**
    * Test of flipCard method, of class Deck.
    */
   @Test
   public void testFlipCard ()
   {
      System.out.println("flipCard");
      Card card = new Card(Value.ACE, Suit.CLUBS);
      Deck instance = new Deck();
      instance.flipCard(card);
   }

}
