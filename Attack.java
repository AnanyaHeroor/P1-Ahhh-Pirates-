/**
* We have discovered pirate code and the message is:
* 83,116,97,114,114,114,98,117,99,107,115.
* This class translates the pirate code and prints out the location at which the pirates will attack
* 
*/
public class Attack {
    public static void main (String [] args){
        //assign each part of the pirate code to a char variable 
        //we are translating the numbers to chars to decode
      char one = (char) 83; 
      char two = (char) 116;
      char three = (char) 97;
      char four = (char) 114;
      char five = (char) 114;
      char six = (char) 114;
      char seven = (char) 98;
      char eight = (char) 117;
      char nine = (char) 99;
      char ten = (char) 107;
      char eleven = (char) 115;
        //print the decoded pirate attack location
      System.out.println(one + "" + two + "" + three + "" + four + "" + five + "" + six + "" + seven + "" + eight + "" + nine + "" + ten + eleven);
    }
}
