/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import static junit.framework.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Colton
 */
public class HandTest
{

   protected ArrayList<Card> cards;

   public HandTest ()
   {
      cards = new ArrayList<>();
   }

   @Before
   public void setUp ()
   {
   }

   /**
    * Test of add method, of class Hand.
    */
   @Test
   public void testAdd ()
   {
      System.out.println("add");
      Card card = new Card(Value.ACE, Suit.CLUBS);
      cards.add(card);
      cards.get(0).flipCard();
      String expResult = "Ace of Clubs";
      String result = cards.get(0).toString();
      assertEquals(expResult, result);
   }

   /**
    * Test of showHand method, of class Hand.
    */
   @Test
   public void testShowHand ()
   {
      System.out.println("showHand");

      Card card = new Card(Value.EIGHT, Suit.DIAMONDS);
      Hand instance = new Hand();
      card.flipCard();
      int expResult = 0;
      int result = instance.getTotalValue();
      assertEquals(expResult, result);
   }

   /**
    * Test of flipCards method, of class Hand.
    */
   @Test
   public void testFlipCards ()
   {
      System.out.println("flipCards");
      Hand instance = new Hand();
      instance.flipCards();
   }

   /**
    * Test of giveCard method, of class Hand.
    */
   @Test
   public void testGiveCard ()
   {
      System.out.println("giveCard");
      Card card = null;
      Hand otherHand = null;
      Hand instance = new Hand();
      boolean expResult = false;
      boolean result = instance.giveCard(card, otherHand);
      assertEquals(expResult, result);
   }

   /**
    * Test of getTotalValue method, of class Hand.
    */
   @Test
   public void testGetTotalValue ()
   {
      System.out.println("getTotalValue");
      Hand instance = new Hand();
      int expResult = 0;
      int result = instance.getTotalValue();
      assertEquals(expResult, result);
   }

   /**
    * Test of toString method, of class Hand.
    */
   @Test
   public void testToString ()
   {
      System.out.println("toString");
      Hand instance = new Hand();
      String expResult = " ";
      String result = instance.toString();
      assertEquals(expResult, result);
   }

}
