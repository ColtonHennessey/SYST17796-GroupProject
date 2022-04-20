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
public class DealerTest
{

   public DealerTest ()
   {
   }

   @Before
   public void setUp ()
   {
   }

   /**
    * Test of getDealerName method, of class Dealer.
    */
   @Test
   public void testGetDealerNameGood ()
   {
      System.out.println("getDealerNameGood");
      Dealer instance = new Dealer(new Hand());
      String expResult = "Dealer";
      String result = instance.getDealerName();
      assertEquals(expResult, result);
   }

   @Test
   public void testGetDealerNameBad ()
   {
      System.out.println("getDealerNameBad");
      Dealer instance = new Dealer(new Hand());
      instance.setDealerName(" ");
      String expResult = " ";
      String result = instance.getDealerName();
      assertEquals(expResult, result);
   }

   @Test
   public void testGetDealerNameBoundary ()
   {
      System.out.println("getDealerNameBoundary");
      Dealer instance = new Dealer(new Hand());
      instance.setDealerName("deazel");
      String expResult = "deazel";
      String result = instance.getDealerName();
      assertEquals(expResult, result);
   }

   /**
    * Test of setDealerName method, of class Dealer.
    */
   @Test
   public void testSetDealerNameGood ()
   {
      System.out.println("setDealerNameGood");
      String dealerName = "Dealer";
      Dealer instance = new Dealer(new Hand());
      instance.setDealerName(dealerName);
   }

   @Test
   public void testSetDealerNameBad ()
   {
      System.out.println("setDealerNameBad");
      String dealerName = " ";
      Dealer instance = new Dealer(new Hand());
      instance.setDealerName(dealerName);
   }

   @Test
   public void testSetDealerNameBoundary ()
   {
      System.out.println("setDealerNameBoundary");
      String dealerName = "deazel";
      Dealer instance = new Dealer(new Hand());
      instance.setDealerName(dealerName);
   }

   /**
    * Test of getDealerHand method, of class Dealer.
    */
   @Test
   public void testGetDealerHandGood ()
   {
      System.out.println("getDealerHandGood");
      Dealer instance = new Dealer(new Hand());
      String expResult = instance.getDealerHand().showHand();
      String result = instance.getDealerHand().showHand();
      assertEquals(expResult, result);
   }

   @Test
   public void testGetDealerHandBad ()
   {
      System.out.println("getDealerHandBad");
      Dealer instance = new Dealer(null);
      Hand expResult = null;
      Hand result = instance.getDealerHand();
      assertEquals(expResult, result);
   }

   @Test
   public void testGetDealerHandBoundary ()
   {
      System.out.println("getDealerHandBoundary");
      Dealer instance = new Dealer(new Hand());
      String expResult = instance.getDealerHand().showHand();
      String result = instance.getDealerHand().showHand();
      assertEquals(expResult, result);
   }


   /**
    * Test of setDealerHand method, of class Dealer.
    */
   @Test
   public void testSetDealerHandGood ()
   {
      System.out.println("setDealerHandGood");
      Hand dealerHand = new Hand();
      Dealer instance = new Dealer(dealerHand);
      instance.setDealerHand(dealerHand);
   }

   @Test
   public void testSetDealerHandBad ()
   {
      System.out.println("setDealerHandBad");
      Hand dealerHand = null;
      Dealer instance = new Dealer(null);
      instance.setDealerHand(dealerHand);
   }

   @Test
   public void testSetDealerHandBoundary ()
   {
      System.out.println("setDealerHandBoundary");
      Hand dealerHand = new Deck();
      Dealer instance = new Dealer(dealerHand);
      instance.setDealerHand(dealerHand);
   }

}
