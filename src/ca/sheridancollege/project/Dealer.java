package ca.sheridancollege.project;

public class Dealer
{
   private String dealerName = "Dealer";
   private Hand dealerHand;

   public Dealer (Hand dealerHand)
   {
      this.dealerHand = dealerHand;
   }

   public String getDealerName ()
   {
      return dealerName;
   }

   public void setDealerName (String dealerName)
   {
      this.dealerName = dealerName;
   }

   public Hand getDealerHand ()
   {
      return dealerHand;
   }

   public void setDealerHand (Hand dealerHand)
   {
      this.dealerHand = dealerHand;
   }


}
