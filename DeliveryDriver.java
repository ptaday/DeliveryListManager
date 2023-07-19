/**
 * @author Pushkar Taday
 * SBU ID:114375166
 * Recitation:04
 */

package Homework2;

import java.util.Scanner;

     /**
      * This class represents a menu driven program for the driver of the delivery
      */

     public class DeliveryDriver {

         /**
          * This method represents a main methods which gets executed and runs the menu driven program
          *
          * @param args String arguments
          */

         public static void main(String[] args) {

             DeliveryList list = new DeliveryList();

             DeliveryList list1 = new DeliveryList();

             DeliveryList deliveryList = list;

             Scanner input = new Scanner(System.in);

             int c = 0;//counter variable for copy and paste

             Delivery cutDelivery = new Delivery();

             System.out.println("Welcome to Pushkar's amazin' Delivery Schedular");

             boolean check = true;

             while (check) {
                 try {
                     System.out.println("Menu:\n" +
                             "\n" +
                             "     A) Add a Delivery After Cursor\n" +
                             "\n" +
                             "     R) Remove Delivery At Cursor\n" +
                             "\n" +
                             "     X) Cut Cursor\n" +
                             "\n" +
                             "     V) Paste After Cursor\n" +
                             "\n" +
                             "     H) Cursor to Head\n" +
                             "\n" +
                             "     T) Cursor to Tail\n" +
                             "\n" +
                             "     F) Cursor Forward\n" +
                             "\n" +
                             "     B) Cursor Backward\n" +
                             "\n" +
                             "     S) Switch Delivery Lists\n" +
                             "\n" +
                             "     P) Print current list\n" +
                             "\n" +
                             "     Q) Quit");

                     System.out.println();

                     System.out.println("Please select an option:");
                     char option = input.next().charAt(0);

                     option = Character.toUpperCase(option);

                     input.nextLine();

                     switch (option) {
                         case 'A':
                             System.out.println("Please enter a source:");
                             String source = input.nextLine();

                             System.out.println("Please enter a destination:");
                             String destination = input.nextLine();

                             System.out.println("Please enter any special instructions:");
                             String instruction = input.nextLine();

                             Delivery delivery = new Delivery(source, destination, instruction);

                             deliveryList.insertAfterCursor(delivery);

                             System.out.println();

                             break;

                         case 'R':

                             Delivery removedDelivery = deliveryList.removeCursor();
                             System.out.println("Delivery to " + removedDelivery.getDest() + " has been removed.");
                             break;

                         case 'X':

                             cutDelivery = deliveryList.removeCursor();

                             System.out.println("Cursor is cut.");

                             c++;
                             break;

                         case 'V':
                             if (c == 1) {
                                 deliveryList.insertAfterCursor(cutDelivery);
                                 c = 0;
                             } else {
                                 System.out.println("There is no delivery present to be pasted. You need to cut something first. ");
                             }
                             break;

                         case 'H':
                             deliveryList.resetCursorToHead();

                             if(deliveryList.getHead()!=null)
                                 System.out.println("Cursor is at head.");

                             break;

                         case 'T':
                             deliveryList.setCursorToTail();

                             if(deliveryList.getTail()!=null)
                                 System.out.println("Cursor is at tail.");

                             break;

                         case 'F':
                             deliveryList.cursorForward();
                             System.out.println("Cursor moved forward.");
                             break;

                         case 'B':
                             deliveryList.cursorBackward();
                             System.out.println("Cursor moved backward.");
                             break;

                         case 'S':
                             if (deliveryList == list) {
                                 deliveryList = list1;
                                 System.out.println("Money Mike's list is selected.");
                             } else {
                                 deliveryList = list;
                                 System.out.println("Biz Billy's list is selected.");
                             }

                             break;

                         case 'P':

                             String print = "";

                             if (deliveryList == list1) {
                                 System.out.println("Money Mike's Deliveries");
                             } else {
                                 System.out.println("Biz Billy's Deliveries");
                             }

                             System.out.println("---------------------------------------------------");

                             if (deliveryList.numDelivers() != 0) {
                                 DeliveryListNode tempCursor = deliveryList.getCursorReference();

                                 deliveryList.resetCursorToHead();

                                 while (deliveryList.getCursorReference() != deliveryList.getTail()) {
                                     if (deliveryList.getCursorReference() == tempCursor)
                                         print = print + "->" + "\n";

                                     else {
                                         if(deliveryList.getCursorReference()!=deliveryList.getHead())
                                         print = print + "~" + "\n";
                                     }

                                     print = print + deliveryList.getCursor().toString();

                                     deliveryList.cursorForward();
                                 }

                                 if (deliveryList.numDelivers() == 1) {
                                     print = print + "->" + "\n";
                                     print = print + deliveryList.getCursor().toString();
                                 }

                                 if (deliveryList.numDelivers() > 1) {

                                     if (deliveryList.getCursorReference() == tempCursor)
                                         print = print + "->" + "\n";

                                     else
                                         print = print + "~" + "\n";

                                     deliveryList.setCursorToTail();

                                     print = print + deliveryList.getCursor().toString();
                                 }
                                 System.out.println(print);
                                 deliveryList.setCursorReference(tempCursor);
                             }

                             System.out.println("---------------------------------------------------");
                             System.out.println();
                             break;

                         case 'Q':
                             System.out.println("Next time, try UPS!");
                             check = false;
                             break;

                         default:
                             System.out.println("Wrong input. Please enter again.");
                     }
                 }

                 /**
                  * This method catches this customised exception if the main method encounters this exception.
                  */
                 catch (EndOfListException e) {
                     System.out.println(e.getMessage());
                 }

                 /**
                  * This method catches IllegalArgument exception if the main method encounters this exception
                  */
                 catch (IllegalArgumentException e) {
                     System.out.println(e.getMessage());
                 }
             }
         }
     }
