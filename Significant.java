public class Significant {
    public static void main (String[] args){
        double freshBefore = 10000.00;
        double freshAfter = 4376.02;
        double subwayBefore = 2000.00;
        double subwayAfter = 2.99;
        double qqsBefore = 827.69;
        double qqsAfter = 543.21;
        double chipotleBefore = 188203.98;
        double chipotleAfter = 25767.03;
        double epicBefore = 2000000.00;
        double epicAfter = 1999999.99;
        double freshLoss = freshBefore - freshAfter;
        double subwayLoss = subwayBefore - subwayAfter;
        double qqsLoss = qqsBefore - qqsAfter;
        double chipotleLoss = chipotleBefore - chipotleAfter;
        double epicLoss = epicBefore - epicAfter;
        double freshLossPercent = freshLoss/freshBefore*100.00;
        double subwayLossPercent = subwayLoss/subwayBefore*100.00;
        double qqsLossPercent = qqsLoss/qqsBefore*100.00;
        double chipotleLossPercent = chipotleLoss/chipotleBefore*100.00;
        double epicLossPercent = epicLoss/epicBefore*100.00;
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