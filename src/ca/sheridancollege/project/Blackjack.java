/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Scanner;


public class Blackjack
{

   private ArrayList<Player> players = new ArrayList<Player>();
   private Dealer dealer = new Dealer(new Hand());
   private Deck deck = new Deck();
   Scanner scan = new Scanner(System.in);

   public void playGame ()
   {
      addPlayer();
      removePlayer();
      dealCards();
      playerLogic();
      dealerLogic();
      checkWinner();

   }

   public void addPlayer ()
   {
      System.out.println("Do you want to add a player? \n ENTER YES OR NO \n");

      String playerInput = scan.next();

      int playerIndex = 0;

      while (playerInput.equalsIgnoreCase("YES")) {

         System.out.println("Enter Player Name:  \n");
         String inputName = scan.next();

         players.add(new Player(inputName, new Hand()));
         System.out.println("Added " + players.get(playerIndex).getPlayerName() + " to the game \n");

         playerIndex++;

         System.out.println("Did you want to add another player? \n YES / NO \n");
         playerInput = scan.next();
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
         System.out.println("# " + i + " : " + players.get(i).getPlayerName() + "\n");
      }
   }

   public void dealCards ()
   {

      System.out.println(this.dealer.getDealerName() + " has joined the game! \n");
      deck.fillDeck();
      deck.shuffleDeck();
      for (int i = 0; i < players.size(); i++) {
         deck.deal(players.get(i).getPlayerHand(), 2);
         players.get(i).getPlayerHand().flipCards();
         System.out.println(players.get(i).getPlayerName() + "'s hand: \n");
         System.out.println(players.get(i).getPlayerHand().showHand());
      }
      deck.deal(dealer.getDealerHand(), 2);
      dealer.getDealerHand().cards.get(0).flipCard();
      System.out.println("The Dealer's hand: \n" + dealer.getDealerHand().showHand());
   }

   public void playerLogic ()
   {
      for (int i = 0; i < players.size(); i++) {
         System.out.println(players.get(i).getPlayerName() + " ( " + players.get(i).getPlayerHand().getTotalValue() + " ) will you HIT, or will you STAY ");
         String playerInput = scan.next();
         int numberOfCardsInHand = 2;
         while (playerInput.equalsIgnoreCase("HIT")) {
            hit(i, numberOfCardsInHand);
            numberOfCardsInHand++;
            if (players.get(i).getPlayerHand().getTotalValue() > 21) {
               System.out.println(players.get(i).getPlayerName() + " has busted!");
               break;
            }
            System.out.println("HIT or STAY?");
            playerInput = scan.next();
         }
         if (playerInput.equalsIgnoreCase("STAY")) {
            stay(i);
         }
      }
   }

   public void hit (int playerIndex, int numberOfCardsInHand)
   {
      deck.deal(players.get(playerIndex).getPlayerHand(), 1);
      players.get(playerIndex).getPlayerHand().cards.get(numberOfCardsInHand).flipCard();
      System.out.println(players.get(playerIndex).getPlayerHand().showHand());
   }

   public void stay (int playerIndex)
   {
      System.out.println(players.get(playerIndex).getPlayerName() + " has " + players.get(playerIndex).getPlayerHand().getTotalValue() + " points in total. \n");
   }

   public void dealerLogic ()
   {
      int numOfCardsInHand = 2;
      dealer.getDealerHand().cards.get(1).flipCard();
      System.out.println("Dealer's Hand:  \n" + dealer.getDealerHand().showHand() + "\n");
      while (dealer.getDealerHand().getTotalValue() <= 17) {
         deck.deal(dealer.getDealerHand(), 1);
         dealer.getDealerHand().cards.get(numOfCardsInHand).flipCard();
         System.out.println(dealer.getDealerHand().showHand());
         numOfCardsInHand++;
         if (dealer.getDealerHand().getTotalValue() > 21) {
            System.out.println("Dealer has busted! \n");
         }
      }
   }

   public void checkWinner ()
   {
      for (int i = 0; i < players.size(); i++) {
         if (players.get(i).getPlayerHand().getTotalValue() == 21) {
            System.out.println(players.get(i).getPlayerName() + " has a Blackjack!");
            break;
         }
         if (players.get(i).getPlayerHand().getTotalValue() > dealer.getDealerHand().getTotalValue() && players.get(i).getPlayerHand().getTotalValue() <= 21) {
            System.out.println(players.get(i).getPlayerName() + " is a winner!!!");
         }
         else if (dealer.getDealerHand().getTotalValue() <= 21) {
            System.out.println("The Dealer Wins!");
         }

         else if (players.get(i).getPlayerHand().getTotalValue() == dealer.getDealerHand().getTotalValue()) {
            System.out.println(" The Game is a draw");
         }
      }
   }

}//end class
