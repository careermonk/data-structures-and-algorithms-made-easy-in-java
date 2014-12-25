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

package chapter07priorityqueues;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MergingKSortedLists {
    public ListNode mergeKLists(ArrayList<ListNode> lists) {
        if (lists == null || lists.isEmpty()) 
            return null;
        PriorityQueue<ListNode> heap = new PriorityQueue<ListNode>(lists.size(), new Comparator<ListNode>(){
            public int compare(ListNode o1, ListNode o2) {
                return o1.data > o2.data ? 1 : (o1.data < o2.data ? -1 : 0);
            }
        });
        for (ListNode node : lists) {
            if (node != null) {
                heap.add(node);
            }
        }
        ListNode head = null, cur = null;
        while (!heap.isEmpty()) {
            if (head == null) {
                head = heap.poll();
                cur = head;
            } else {
                cur.next = heap.poll();
                cur = cur.next;
            }
            if (cur.next != null) {
                heap.add(cur.next);
            }
        }
        return head;
    }
}
