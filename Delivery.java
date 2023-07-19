/**
 * @author Pushkar Taday
 * SBU ID:114375166
 * Recitation:04
 */

package Homework2;

/**
 * This class represents a delivery with a source, destination and instruction.
 */

public class Delivery {

    private String source;
    private String dest;
    private String instruction;

    /**
     * This method is a default constructor for this class which assigns the data member's with the default values.
     */
    Delivery() {
        source = "";
        dest = "";
        instruction = "";
    }

    /**
     * This method is a parameterized constructor which gets invoked when object of this class is instantiated.
     * @param source
     *             source for delivery
     * @param dest
     *            destination for delivery
     * @param instruction
     *            instruction for delivery
     */

    Delivery(String source, String dest, String instruction) {
        this.source = source;
        this.dest = dest;
        this.instruction = instruction;
    }

    /**
     * This methods is a accessor method for the source member variable
     * @return
     *       a string containing the source for the delivery
     */

    public String getSource() {
        return source;
    }

    /**
     * This methods is a accessor method for the destination member variable
     * @return
     *       a string containing the destination for the delivery
     */

    public String getDest() {
        return dest;
    }

    /**
     * This methods is a accessor method for the instruction member variable
     * @return
     *       a string containing the instruction for the delivery
     */

    public String getInstruction() {
        return instruction;
    }

    /**
     * This method is a mutator method for the source member variable
     * @param source
     * source of the delivery
     */

    public void setSource(String source) {
        this.source = source;
    }

    /**
     * This method is a mutator method for the source member variable
     * @param dest
     * destination of the delivery
     */

    public void setDest(String dest) {
        this.dest = dest;
    }

    /**
     * This method is a mutator method for the source member variable
     * @param instruction
     * instruction of the delivery
     */

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    /**
     * This method returns information regarding the delivery
     * @return
     * a string containing the details of the delivery
     */

    public String toString() {
        String s = ""; //local variable that would store the sentence to be printed

        s = "To: " + this.getDest() + " | " + "From: " + this.getSource() + "\n" + "Instruction: " + this.getInstruction() + "\n";

        return s;
    }
}
