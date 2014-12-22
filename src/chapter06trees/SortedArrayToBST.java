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

package chapter06trees;
import chapter03linkedlists.*;
public class SortedArrayToBST {
    // bottom up
    public BinarySearchTreeNode sortedListToBST(ListNode head) {
       int len = 0;
       ListNode currentNode = head;
       while(currentNode != null){
           len++;
           currentNode = currentNode.next;
       }
       return construct(head, 0, len - 1);
    }
    
    public BinarySearchTreeNode construct(ListNode head, int start, int end){
        if(start > end)
            return null;
        int mid = start + (end - start) / 2;
        // build left first, since it is the bottom up approach. 
        BinarySearchTreeNode left = construct(head, start, mid - 1);
        BinarySearchTreeNode root = new BinarySearchTreeNode(head.data);
        root.left = left;
        if(head.next != null){
            head.data = head.next.data;
            head.next = head.next.next;
        }
        root.right = construct(head, mid + 1, end);
        return root;
    }
}
