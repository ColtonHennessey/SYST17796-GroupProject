package ca.sheridancollege.project;


public class Player
{
   private String playerName;
   private Hand playerHand;

   public Player (String playerName, Hand playerHand)
   {
      this.playerName = playerName;
      this.playerHand = playerHand;
   }

   public String getPlayerName ()
   {
      return playerName;
   }

   public void setPlayerName (String playerName)
   {
      this.playerName = playerName;
   }

   public Hand getPlayerHand ()
   {
      return playerHand;
   }

   public void setPlayerHand (Hand playerHand)
   {
      this.playerHand = playerHand;
   }

}
