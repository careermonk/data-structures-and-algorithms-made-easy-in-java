/*Copyright (c) Dec 21, 2014 CareerMonk Publications and others.
 * E-Mail           	: info@careermonk.com 
 * Creation Date    	: 2015-01-10 06:15:46 
 * Last modification	: 2006-05-31 
               by		: Narasimha Karumanchi 
 * Book Title			: Data Structures And Algorithms Made In Java
 * Warranty         	: This software is provided "as is" without any 
 * 							warranty; without even the implied warranty of 
 * 							merchantability or fitness for a particular purpose. 
 * 
 */

package chapter03linkedlists;
public class ReverseKNodesAsBlockRecursive{
    public static ListNode reverseKNodesRecursive(ListNode head, int k){
        ListNode current = head;
        ListNode next = null;
        ListNode prev = null;
        int count = k;

        //Reverse K nodes
        while (current != null && count > 0) {
            next = current.getNext();
            current.setNext(prev);
            prev = current;
            current = next;
            count--;
        }

        //Now next points to K+1 th node, returns the pointer to the head node
        if (next != null) {
            head.setNext(reverseKNodesRecursive(next, k));
        }
        //return head node
        return prev;
    }

    public static ListNode reverseKNodes(ListNode head, int k){
        //Start with head
        ListNode current = head;
        //last node after reverse
        ListNode prevTail = null;
        //first node before reverse
        ListNode prevCurrent = head;
        while (current != null) {
            //loop for reversing K nodes
            int count = k;
            ListNode tail = null;
            while (current != null && count > 0) {
                ListNode next = current.getNext();
                current.setNext(tail);
                tail = current;
                current = next;
                count--;
            }
            //reversed K Nodes
            if (prevTail != null) {
                //Link this set and previous set
                prevTail.setNext(tail);
            } else {
                //We just reversed first set of K nodes, update head point to the Kth Node
                head = tail;
            }
            //save the last node after reverse since we need to connect to the next set.
            prevTail = prevCurrent;
            //Save the current node, which will become the last node after reverse
            prevCurrent = current;
        }
        return head;
    }
}