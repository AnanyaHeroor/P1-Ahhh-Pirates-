/**
* This class determines which businesses had a significant loss
* @author Ananya Heroor
* We are considering a loss to be significant if it is more than 43.21876% of the business' starting amount
*/
public class Significant {
    public static void main (String[] args){
        double freshBefore = 10000.00; //Money prior to robbery at Fresh
        double freshAfter = 4376.02; //Money after robbery at Fresh
        double subwayBefore = 2000.00; //Money prior to robbery at Subway
        double subwayAfter = 2.99; //Money after robbery at Subway
        double qqsBefore = 827.69; //Money prior to robbery at QQ's
        double qqsAfter = 543.21; //Money after robbery at QQ's
        double chipotleBefore = 188203.98; //Money prior to robbery at Chipotle
        double chipotleAfter = 25767.03; //Money after robbery at Chipotle
        double epicBefore = 2000000.00; //Money prior to robbery at Epic
        double epicAfter = 1999999.99; //Money after robbery at Epic
        double freshLoss = freshBefore - freshAfter; //Calculation of loss at Fresh
        double subwayLoss = subwayBefore - subwayAfter; //Calculation of loss at Subway
        double qqsLoss = qqsBefore - qqsAfter; //Calculation of loss at QQ's
        double chipotleLoss = chipotleBefore - chipotleAfter; //Calculation of loss at Chipotle
        double epicLoss = epicBefore - epicAfter; //Calculation of loss at Epic
        double freshLossPercent = freshLoss/freshBefore*100.00; //Calculation of percentage lost at Fresh
        double subwayLossPercent = subwayLoss/subwayBefore*100.00; //Calculation of percentage lost at Subway
        double qqsLossPercent = qqsLoss/qqsBefore*100.00; //Calculation of percentage lost at QQ's
        double chipotleLossPercent = chipotleLoss/chipotleBefore*100.00; //Calculation of percentage lost at Chipotle
        double epicLossPercent = epicLoss/epicBefore*100.00; //Calculation of percentage lost at Epic
        /**
        * Print each store's percentage loss and the stores that lost a significant amount (i.e. greater than 43.21876%)
        */
        System.out.println("Fresh lost " + freshLossPercent +"% of their money");
        System.out.println("Subway lost " + subwayLossPercent +"% of their money");
        System.out.println("QQ's lost " + qqsLossPercent +"% of their money");
        System.out.println("Chipotle lost " + chipotleLossPercent +"% of their money");
        System.out.println("Epic lost " + epicLossPercent +"% of their money");
        System.out.println("Stores that lost a significant amount: Fresh, Subway, Chipotle");
    }
}
// from the percentage values, I know that: Fresh, Subway, and Chipotle lost a significant amount
// from the percentage values, I know that: QQ's and Epic did not lose a significant amount
// if it is significant: greater than 43.21876% of starting amount lost
