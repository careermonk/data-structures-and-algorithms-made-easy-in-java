/*Copyright (c) Dec 22, 2014 CareerMonk Publications and others.
 * E-Mail           	: info@careermonk.com 
 * Creation Date    	: 2015-01-10 06:15:46 
 * Last modification	: 2006-05-31 
               by		: Narasimha Karumanchi 
 * File Name			: RemoveDuplicatesHashing.java
 * Book Title			: Data Structures And Algorithms Made In Java
 * Warranty         	: This software is provided "as is" without any 
 * 							warranty; without even the implied warranty of 
 * 							merchantability or fitness for a particular purpose. 
 * 
 */


package chapter03linkedlists;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicatesHashing {
    // using a temporary buffer O(n)
    public static void removeDuplicates(ListNode head) {
        Map<Integer, Boolean> mapper = new HashMap<Integer, Boolean>();
        ListNode curr = head;
        ListNode next;
        while (curr.getNext() != null) {
            next = curr.getNext();
            if(mapper.get(next.getData()) != null) {
                // already seen it, so delete
                curr.setNext(next.getNext());
            } else {
                mapper.put(next.getData(), true);
                curr = curr.getNext();
            }
        }
    }
}
