/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ca.sheridancollege.project;

import static junit.framework.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Colton
 */
public class CardTest
{

   public CardTest ()
   {
   }

   @Before
   public void setUp ()
   {
   }

   /**
    * Test of getSuit method, of class Card.
    */
   @Test
   public void testGetSuit ()
   {
      System.out.println("getSuit");
      Card instance = new Card(Value.ACE, Suit.HEARTS);
      String expResult = "Hearts";
      String result = instance.getSuit();
      assertEquals(expResult, result);

   }

   /**
    * Test of getValue method, of class Card.
    */
   @Test
   public void testGetValue ()
   {
      System.out.println("getValue");
      Card instance = new Card(Value.JACK, Suit.CLUBS);
      int expResult = 10;
      int result = instance.getValue();
      assertEquals(expResult, result);
   }


   /**
    * Test of pirntValue method, of class Card.
    */
   @Test
   public void testPrintValue ()
   {
      System.out.println("printValue");
      Card instance = new Card(Value.FOUR, Suit.HEARTS);
      String expResult = "4";
      String result = instance.printValue();
      assertEquals(expResult, result);
   }

   /**
    * Test of flipCard method, of class Card.
    */
   @Test
   public void testFlipCard ()
   {
      System.out.println("flipCard");
      Card instance = new Card(Value.ACE, Suit.CLUBS);
      instance.flipCard();
   }

   /**
    * Test of toString method, of class Card.
    */
   @Test
   public void testToString ()
   {
      System.out.println("toString");
      Card instance = new Card(Value.FIVE, Suit.SPADES);
      String expResult = "5 of Spades";
      instance.flipCard();
      String result = instance.toString();
      assertEquals(expResult, result);
   }

}
