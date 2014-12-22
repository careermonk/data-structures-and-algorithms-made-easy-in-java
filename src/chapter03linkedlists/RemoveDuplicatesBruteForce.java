/*Copyright (c) Dec 22, 2014 CareerMonk Publications and others.
 * E-Mail           	: info@careermonk.com 
 * Creation Date    	: 2015-01-10 06:15:46 
 * Last modification	: 2006-05-31 
               by		: Narasimha Karumanchi 
 * File Name			: RemoveDuplicatesBruteForce.java
 * Book Title			: Data Structures And Algorithms Made In Java
 * Warranty         	: This software is provided "as is" without any 
 * 							warranty; without even the implied warranty of 
 * 							merchantability or fitness for a particular purpose. 
 * 
 */


package chapter03linkedlists;

public class RemoveDuplicatesBruteForce {
	public static void removeDuplicates(ListNode head) {
		ListNode curr = head;
		if(curr == null || curr.getNext() == null) {
			return; // 0 or 1 nodes in the list so no duplicates
		}
		ListNode curr2;
		ListNode prev;
		while(curr != null) {
			curr2 = curr.getNext();
			prev = curr;
			while(curr2 != null) {
				// check and see if curr and curr2 values are the same, if they are then delete curr2
				if(curr.getData()==curr2.getData()) {
					prev.setNext(curr2.getNext());
				}
				prev = curr2;
				curr2 = curr2.getNext();
			}
			curr = curr.getNext();
		}
	}
}
