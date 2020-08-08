/**
* This class decodes a new secret message that contains the pirate king's name
* @author Ananya Heroor
* The pirates' secret message code is different than in Attack.java
* After converting a letter to an integer, they multiply that value by 3, and then add 21
* Ex: Argh would be encoded to 216, 363, 330, 333
*/
public class King{
    public static void main (String [] args){
        //decode pirates' secret message
        char one = (char) (237 - 21)/3;
        char two = (char) (354 - 21)/3;
        char three = (char) (354- 21)/3;
        char four = (char) (342- 21)/3;
        //print decoded pirate king's name
        System.out.println(one + "" + two + "" + three + "" + four + "");
    }
}
