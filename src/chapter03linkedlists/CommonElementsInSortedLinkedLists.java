/*Copyright (c) Feb 21, 2016 CareerMonk Publications and others.
 * E-Mail           	: info@careermonk.com 
 * Creation Date    	: 2015-01-10 06:15:46 
 * Last modification	: 2006-05-31 
               by		: Narasimha Karumanchi 
 * File Name			: CommonElementsInSortedLinkedLists.java
 * Book Title			: Data Structures And Algorithms Made In Java
 * Warranty         	: This software is provided "as is" without any 
 * 							warranty; without even the implied warranty of 
 * 							merchantability or fitness for a particular purpose. 
 * 
 */

package chapter03linkedlists;

public class CommonElementsInSortedLinkedLists {
	public static ListNode commonElement(ListNode list1, ListNode list2) {
		ListNode temp =  new ListNode(0);
		ListNode head = temp;
		while (list1 != null && list2 != null) {
			if (list1.data == list2.data) {
				head.next = new ListNode(list1.data); // Copy common element.
				list1 = list1.next;
				list2 = list2.next;
				head = head.next;
			} else if (list1.data > list2.data) {
				list2 = list2.next;	
			} else { // list1.data < list2.data
				list1 = list1.next;	
			}
		}
		return temp.next;	
	}
}
