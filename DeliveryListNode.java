/**
 * @author Pushkar Taday
 */

package Homework2;

/**
 * This class helps create nodes for the delivery list.
 */

public class DeliveryListNode {

    private Delivery data;
    private DeliveryListNode next;
    private DeliveryListNode prev;

    /**
     * This method is a parameterized constructor which gets invoked when object of this class is created.
     * @param initData
     * the data which is passed through the parameter
     * @throws IllegalArgumentException
     * if the data passed is null.
     */

     DeliveryListNode(Delivery initData) throws IllegalArgumentException{

         if(initData==null)
             throw new IllegalArgumentException();

         else
         data=initData;

         next= null;
         prev=null;
     }

    /**
     * This method is a accessor method for the data of the node
     * @return
     * data of the node
     */

    public Delivery getData() {
        return data;
    }

    /**
     * This methods is a accessor method for the reference of the previous node
     * @return
     * reference to the previous node
     */

    public DeliveryListNode getPrev() {
        return prev;
    }

    /**
     * This methods is a accessor method for the reference of the next node
     * @return
     * reference to the next node
     */

    public DeliveryListNode getNext() {
        return next;
    }

    /**
     * This method is a mutator method which sets the data of the node
     * @param data
     * data of the node
     */

    public void setData(Delivery data) {
        this.data = data;
    }

    /**
     * This method is a mutator method which sets the reference of the next node
     * @param next
     * reference to the next node in the list
     */

    public void setNext(DeliveryListNode next) {
        this.next = next;
    }

    /**
     * This method is a mutator method which sets the reference of the previous node
     * @param prev
     * reference to the previous node in the list
     */

    public void setPrev(DeliveryListNode prev) {
        this.prev = prev;
    }
}
