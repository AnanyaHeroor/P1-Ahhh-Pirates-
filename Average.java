public class Average {
    public static void main (String[] args){
        //when we write the other files do we need the code from previous
        //or does that make the doc too difficult to read
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
        double averageLoss = (double) (freshLoss + subwayLoss + qqsLoss + chipotleLoss + epicLoss)/5.0;
        System.out.println("The average loss was $" + averageLoss);
    }
}