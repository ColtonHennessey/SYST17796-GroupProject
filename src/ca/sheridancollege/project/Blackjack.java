/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * The class that models your game. You should create a more specific child of
 * this class and instantiate the methods
 * given.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 */
public class Blackjack
{

   private final ArrayList<Player> players = new ArrayList<>();
   private int roundNumber;
   private int playerCount;
   Scanner scan = new Scanner(System.in);

   public void playGame ()
   {
      addPlayer();
      removePlayer();
   }

   public void addPlayer ()
   {
      System.out.println("Do you want to add a player? \n ENTER YES OR NO \n");
      String playerInput = scan.next();
      while (playerInput.equalsIgnoreCase("YES")) {
         System.out.println("Enter Player Name:  \n");
         String inputName = scan.next();
         players.add(new Player(inputName, this.playerCount));
         System.out.println("Added " + players.get(this.playerCount).getPlayerName() + " to the game \n");
         this.playerCount++;
         System.out.println("Did you want to add another player? \n YES / NO \n");
         playerInput = scan.next();
      }
      System.out.println("List of Players: \n");
      for (int i = 0; i < players.size(); i++) {
         System.out.println(" # " + players.get(i).getPlayerNumber() + " : " + players.get(i).getPlayerName() + "\n");
      }
   }

   public void removePlayer ()
   {
      System.out.println("Do you want to remove a player? \n ENTER YES OR NO \n ");
      String playerInput = scan.next();
      while (playerInput.equalsIgnoreCase("YES")) {
         System.out.println("Enter Player Name \n ");
         String inputName = scan.next();
         for (int i = 0; i < players.size(); i++) {
            if (inputName.equalsIgnoreCase(players.get(i).getPlayerName())) {
               System.out.println("Removed " + players.get(i).getPlayerName() + " from the game \n");
               players.remove(i);
            }
         }
         System.out.println("Do you want to remove another player? \n ENTER YES OR NO \n");
         playerInput = scan.next();
      }
      System.out.println("List of Players: \n");
      for (int i = 0; i < players.size(); i++) {
         System.out.println("# " + players.get(i).getPlayerNumber() + " : " + players.get(i).getPlayerName() + "\n");
      }
   }


}//end class
