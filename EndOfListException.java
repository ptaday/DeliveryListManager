/**
 * @author Pushkar Taday
 * SBU ID:114375166
 * Recitation:04
 */

package Homework2;

/**
 * This class represents a customised exception which helps to handle exception when encountered.
 */
public class EndOfListException extends Exception{

    /**
     * This method is a parameterized constructor for this class.
     * @param str
     * string which is passed through the parameter
     */

    public EndOfListException(String str){ super(str);}

}
