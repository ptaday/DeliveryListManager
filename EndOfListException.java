/**
 * @author Pushkar Taday
 */


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
