package ca.sheridancollege.project;


public class Player
{
   private String playerName;
   private int playerNumber;

   public Player (String playerName, int playerNumber)
   {
      this.playerName = playerName;
      this.playerNumber = playerNumber;
   }

   public String getPlayerName ()
   {
      return playerName;
   }

   public void setPlayerName (String playerName)
   {
      this.playerName = playerName;
   }

   public int getPlayerNumber ()
   {
      return playerNumber;
   }

   public void setPlayerNumber (int playerNumber)
   {
      this.playerNumber = playerNumber;
   }



}
