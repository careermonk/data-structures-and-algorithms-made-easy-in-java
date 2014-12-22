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

public class RotateLinkedList {
    public ListNode rotateRight(ListNode head, int n) {
        if(head == null || head.next == null)
            return head;
        ListNode rotateStart = head, rotateEnd = head;
        while(n-- > 0){
            rotateEnd = rotateEnd.next;
            if(rotateEnd == null){
                rotateEnd = head;
            }
        }
        if(rotateStart == rotateEnd)
            return head;
        while(rotateEnd.next != null){
            rotateStart = rotateStart.next;
            rotateEnd = rotateEnd.next;
        }
        ListNode temp = rotateStart.next;
        rotateEnd.next = head;
        rotateStart.next = null;
        return temp;
    }
}