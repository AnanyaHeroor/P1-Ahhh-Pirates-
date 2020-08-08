/**
*We would like to know how much money each business lost due to the pirate attack
*This program prints each store's name and how much money they lost
*Calculate thee loss amount for each store, and assign it in a variable
* @author Ananya Heroor
*Each store should be on its own line
*This code only uses a main function
**/

public class Loss {
    public static void main (String[] args){
        double freshBefore = 10000.00; //starting money at Fresh
        double freshAfter = 4376.02; //money after pirate attack at Fresh
        double subwayBefore = 2000.00; //starting money at Subway
        double subwayAfter = 2.99; //money after pirate attack at Subway
        double qqsBefore = 827.69; //starting money at QQ's
        double qqsAfter = 543.21;//money after pirate attack at QQ's
        double chipotleBefore = 188203.98; //starting money at Chipotle
        double chipotleAfter = 25767.03;//money after pirate attack at Chipotle
        double epicBefore = 2000000.00; //starting money at Epic
        double epicAfter = 1999999.99;//money after pirate attack at Epic
        double freshLoss = freshBefore - freshAfter; //Fresh's money loss
        double subwayLoss = subwayBefore - subwayAfter; //Subway's money loss
        double qqsLoss = qqsBefore - qqsAfter; //QQ's money loss
        double chipotleLoss = chipotleBefore - chipotleAfter; //Chipotle's money loss
        double epicLoss = epicBefore - epicAfter; //Epic's money loss
        
        /**
        * print each store's loss in dollars
        **/
        System.out.println("Fresh lost $" + freshLoss);
        System.out.println("Subway lost $" + subwayLoss);
        System.out.println("QQ's lost $" + qqsLoss);
        System.out.println("Chipotle lost $" + chipotleLoss);
        System.out.println("Epic lost $" + epicLoss);
    }
}
