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
public class PlayerTest
{

   public PlayerTest ()
   {
   }

   @Before
   public void setUp ()
   {
   }

   /**
    * Test of getPlayerName method, of class Player.
    */
   @Test
   public void testGetPlayerNameGood ()
   {
      System.out.println("getPlayerNameGood");
      Player instance = new Player("John", new Hand());
      String expResult = "John";
      String result = instance.getPlayerName();
      assertEquals(expResult, result);
   }

   @Test
   public void testGetPlayerNameBad ()
   {
      System.out.println("getPlayerNameBad");
      Player instance = new Player(" ", new Hand());
      String expResult = " ";
      String result = instance.getPlayerName();
      assertEquals(expResult, result);
   }

   @Test
   public void testGetPlayerNameBoundary ()
   {
      System.out.println("getPlayerNameBoundary");
      Player instance = new Player("j", new Hand());
      String expResult = "j";
      String result = instance.getPlayerName();
      assertEquals(expResult, result);
   }

   /**
    * Test of setPlayerName method, of class Player.
    */
   @Test
   public void testSetPlayerNameGood ()
   {
      System.out.println("setPlayerName");
      String playerName = "John";
      Player instance = new Player(playerName, new Hand());
      instance.setPlayerName(playerName);
   }

   @Test
   public void testSetPlayerNameBad ()
   {
      System.out.println("setPlayerName");
      String playerName = " ";
      Player instance = new Player(playerName, new Hand());
      instance.setPlayerName(playerName);
   }

   @Test
   public void testSetPlayerNameBoundary ()
   {
      System.out.println("setPlayerName");
      String playerName = "j";
      Player instance = new Player(playerName, new Hand());
      instance.setPlayerName(playerName);
   }

   /**
    * Test of getPlayerHand method, of class Player.
    */

   @Test
   public void testGetPlayerHandGood ()
   {
      System.out.println("getPlayerHandGood");
      Player instance = new Player("Name", new Hand());
      String expResult = instance.getPlayerHand().showHand();
      String result = instance.getPlayerHand().showHand();
      assertEquals(expResult, result);
   }

   @Test
   public void testGetPlayerHandBad ()
   {
      System.out.println("getPlayerHand");
      Player instance = new Player("Name", null);
      Hand expResult = null;
      Hand result = instance.getPlayerHand();
      assertEquals(expResult, result);
   }

   @Test
   public void testGetPlayerHandBoundary ()
   {
      System.out.println("getPlayerHandBoundary");
      Player instance = new Player("Name", new Hand());
      String expResult = instance.getPlayerHand().showHand();
      String result = instance.getPlayerHand().showHand();
      assertEquals(expResult, result);
   }

   /**
    * Test of setPlayerHand method, of class Player.
    */
   @Test
   public void testSetPlayerHandGood ()
   {
      System.out.println("setPlayerHand");
      Hand playerHand = new Hand();
      Player instance = new Player("John", playerHand);
      instance.setPlayerHand(playerHand);
   }

   @Test
   public void testSetPlayerHandBad ()
   {
      System.out.println("setPlayerHand");
      Hand playerHand = null;
      Player instance = new Player("John", null);
      instance.setPlayerHand(playerHand);
   }

   @Test
   public void testSetPlayerHandBoundary ()
   {
      System.out.println("setPlayerHand");
      Hand playerHand = new Deck();
      Player instance = new Player("John", playerHand);
      instance.setPlayerHand(playerHand);

   }

}
