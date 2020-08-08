/**
* This class computes and prints the average amount lost by the businesses that were robbed by pirates
* Only contains a main method
* Each store should be on its own line
*/
public class Average {
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
        double freshLoss = freshBefore - freshAfter; //Calculation of Loss at Fresh
        double subwayLoss = subwayBefore - subwayAfter; //Calculation of Loss at Subway
        double qqsLoss = qqsBefore - qqsAfter; //Calculation of Loss at QQ's
        double chipotleLoss = chipotleBefore - chipotleAfter; //Calculation of Loss at Chipotle
        double epicLoss = epicBefore - epicAfter; //Calculation of Loss at Epic
        double averageLoss = (double) (freshLoss + subwayLoss + qqsLoss + chipotleLoss + epicLoss)/5.0; //Calculation of average Loss of all businesses
        System.out.println("The average loss was $" + averageLoss); //Print average loss
    }
}
