public class Loss {
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
        System.out.println("Fresh lost $" + freshLoss);
        System.out.println("Subway lost $" + subwayLoss);
        System.out.println("QQ's lost $" + qqsLoss);
        System.out.println("Chipotle lost $" + chipotleLoss);
        System.out.println("Epic lost $" + epicLoss);
    }
}