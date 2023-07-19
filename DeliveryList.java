/**
 * @author Pushkar Taday
 */


/**
 * This class contains different methods which carry out different operations on the list containing deliveries
 */

public class DeliveryList {

    private DeliveryListNode head;
    private DeliveryListNode tail;
    private DeliveryListNode cursor;
    int count; //keeps the count of nodes in the list

    /**
     * This method is a default constructor when invoked will assign members variable with default values
     */

    public DeliveryList() {
        head = null;
        tail = null;
        cursor = null;
    }

    /**
     * This method is a accessor method for the reference of the head in the list
     * @return
     * reference of head node
     */
    public DeliveryListNode getHead() {
        return head;
    }

    /**
     * This method is a accessor method for the reference of the tail in the list
     * @return
     * reference of tail node
     */
    public DeliveryListNode getTail() {
        return tail;
    }

    /**
     * This method when called returns the reference of the cursor in the list
     * @return
     * reference of cursor node
     */

    public DeliveryListNode getCursorReference() {
        return cursor;
    }

    /**
     * This method is a mutator method which sets the reference of the cursor
     * @param cursor
     * reference of the cursor
     */

    public void setCursorReference(DeliveryListNode cursor) {
        this.cursor = cursor;
    }

    /**
     * This method is an O(1) method used to return the number of deliveries in the list
     * @return
     * count of nodes in the list
     */

    public int numDelivers() {
        return count;
    }

    /**
     * This method is an accessor methods for the data of the node the cursor points at
     * @return
     * data of the node the cursor points at
     */

    public Delivery getCursor() {

        if (this.cursor.getData() == null)
            return null;

        else
            return cursor.getData();

    }

    /**
     * This method resets the cursor and makes it point towards the head of the list
     */

    public void resetCursorToHead() {
        if (this.head == null) {
            cursor = null;
            System.out.println("Currently there are no deliveries in the list");
        } else {
            cursor = head;
        }
    }

    /**
     * This method resets the cursor and makes it point towards the tail of the list
     */

    public void setCursorToTail() {
        if (this.tail == null) {
            cursor = null;
            System.out.println("Currently, there are no deliveries in the list.");

        } else {
            cursor = tail;
        }
    }

    /**
     * This methods makes the cursor move forward by one node
     * @throws EndOfListException
     * throws if both cursor and tail hold the same references
     */

    public void cursorForward() throws EndOfListException {

        if (cursor == null && tail == null)
            throw new EndOfListException("There are no deliveries in the list.");

        else if (cursor == tail)
            throw new EndOfListException("Reached end of list. Cannot move forward.");

        else
            cursor = cursor.getNext();
    }

    /**
     * This method makes the cursor move backward by one node
     * @throws EndOfListException
     * throws if both cursor and head hold the same reference
     */

    public void cursorBackward() throws EndOfListException {

        if (cursor == null && head == null)
            throw new EndOfListException("There are no deliveries in the list.");

        else if (cursor == head)
            throw new EndOfListException("Reached end of list. Cannot move backwards.");

        else
            cursor = cursor.getPrev();
    }

    /**
     * This methods is used to add a node after the cursor
     * @param newDelivery
     * data of the delivery which has to be wrapped into the node
     * @throws IllegalArgumentException
     * throws if data of the delivery is null
     */

    public void insertAfterCursor(Delivery newDelivery) throws IllegalArgumentException {
        if (newDelivery == null)
            throw new IllegalArgumentException("Delivery does not contain any data.");

        else {
            DeliveryListNode newNode = new DeliveryListNode(newDelivery);

            if (cursor == null) {//if there is no node present

                newNode.setPrev(null);
                newNode.setNext(null);
                head = newNode;
                cursor = newNode;
                tail = newNode;

                count++;
                System.out.println("Order Inserted.");

            } else if (cursor == tail) {// if the node needs to be added at the tail
                cursor.setNext(newNode);
                newNode.setPrev(cursor);
                newNode.setNext(null);

                tail = newNode;
                count++;

                System.out.println("Order Inserted.");
            } else { //if node needs to be added in the middle of the list

                newNode.setNext(cursor.getNext());
                cursor.getNext().setPrev(newNode);
                cursor.setNext(newNode);
                newNode.setPrev(cursor);

                count++;

                System.out.println("Order Inserted.");
            }
        }
    }

    /**
     * This method adds a node to the tail of the list
     * @param newDelivery
     * data of the delivery which has to be wrapped into the node
     * @throws IllegalArgumentException
     * throws if data of the delivery is null
     */

    public void appendToTail(Delivery newDelivery) throws IllegalArgumentException {
        if (newDelivery == null)
            throw new IllegalArgumentException("Delivery does not contain any data.");

        else {
            DeliveryListNode newNode = new DeliveryListNode(newDelivery);

            if(tail == null) {

                newNode.setPrev(null);
                newNode.setNext(null);
                head = newNode;
                cursor = newNode;
                tail = newNode;

                count++;
            } else {

                newNode.setPrev(tail);
                newNode.setNext(null);
                tail.setNext(newNode);
                tail = newNode;

                count++;
            }
        }
    }

    /**
     * This method removes the node which cursor points at
     * @return
     * data of the node which was at cursor
     * @throws EndOfListException
     * throws if cursor does not point to any node
     */

    public Delivery removeCursor() throws EndOfListException {
        if (cursor == null)
            throw new EndOfListException("No Delivery to be removed. Enter wisely.");

        else if (cursor == tail && count == 1) //if there is only one node
        {
            DeliveryListNode returningNode = cursor;
            cursor = null;
            head = null;
            tail = null;
            count--;

            return returningNode.getData();
        } else if (cursor == head) //if there are multiple nodes and head has to be removed
        {
            DeliveryListNode returningNode = cursor;

            cursor.getNext().setPrev(null);

            head = cursor.getNext();
            cursor = cursor.getNext();

            count--;

            return returningNode.getData();
        } else if (cursor == tail) //if there are multiple nodes and tail has to be removed
        {

            DeliveryListNode returningNode = cursor;
            cursor.getPrev().setNext(null);

            tail = cursor.getPrev();
            cursor = cursor.getPrev();
            count--;

            return returningNode.getData();
        } else //if the node to be removed is in the middle of the list
        {
            DeliveryListNode returningNode = cursor;

            cursor.getNext().setPrev(cursor.getPrev());
            cursor.getPrev().setNext(cursor.getNext());

            cursor = cursor.getNext();

            count--;

            return returningNode.getData();
        }

    }
}

