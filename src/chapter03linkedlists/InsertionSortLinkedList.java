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
public class InsertionSortLinkedList {
	public static ListNode insertionSortList(ListNode head) {
 		if (head == null || head.next == null)
			return head;
 
		ListNode newHead = new ListNode(head.data);
		ListNode pointer = head.next;
 
		// loop through each element in the list
		while (pointer != null) {
			// insert this element to the new list
 
			ListNode innerPointer = newHead;
			ListNode next = pointer.next;
 
			if (pointer.data <= newHead.data) {
				ListNode oldHead = newHead;
				newHead = pointer;
				newHead.next = oldHead;
			} else {
				while (innerPointer.next != null) {
 
					if (pointer.data > innerPointer.data && pointer.data <= innerPointer.next.data) {
						ListNode oldNext = innerPointer.next;
						innerPointer.next = pointer;
						pointer.next = oldNext;
					}
 
					innerPointer = innerPointer.next;
				}
 
				if (innerPointer.next == null && pointer.data > innerPointer.data) {
					innerPointer.next = pointer;
					pointer.next = null;
				}
			}
 
			// finally
			pointer = next;
		}
 
		return newHead;
	}
 
	public static void main(String[] args) {
		ListNode n1 = new ListNode(2);
		ListNode n2 = new ListNode(3);
		ListNode n3 = new ListNode(14);
 		ListNode n4 = new ListNode(13);
		ListNode n5 = new ListNode(44);
		ListNode n6 = new ListNode(5);
 
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
 
		n1 = insertionSortList(n1);
 
		printList(n1);
 
	}
 
	public static void printList(ListNode x) {
		if(x != null){
			System.out.print(x.data + " ");
			while (x.next != null) {
				System.out.print(x.next.data + " ");
				x = x.next;
			}
			System.out.println();
		}
 
	}
}