/**
* This class translates the pirate code and prints out the location of the pirate headquarters
* @author Ananya Heroor
* Each letter is translated to an integer, then multiplied by its position in the word (starting at 1)
* then that value is divided by 77
* Ex: Argh would be encoded to 0.8441558441558441, 2.961038961038961, 4.012987012987013, 5.402597402597403
* The secret message is: 0.8701298701298701, 2.155844155844156, 1.9090909090909092, 2.6493506493506493, 3.116883116883117, 3.8181818181818183
*/
public class HQ{
    public static void main (String [] args){
        // translate and assign each letter
        double one = 0.8701298701298701*77.0/1;
        double two = 2.155844155844156*77.0/2;
        double three = 1.9090909090909092*77.0/3;
        double four = 2.6493506493506493*77.0/4;
        double five = 3.116883116883117*77.0/5;
        double six = 3.8181818181818183*77.0/6;
        // print the complete location
        System.out.println((char)one + "" + (char)two + "" + (char)three + "" + (char)four + "" + (char)five + "" + (char)six + "");
    }
}
