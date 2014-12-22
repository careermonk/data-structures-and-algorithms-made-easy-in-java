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

import java.util.HashMap;
import java.util.Map;

public class RandomPointerLinkedList {
    public RandomListNode copyRandomList(RandomListNode head) {
        RandomListNode X = head, Y;
        Map<RandomListNode, RandomListNode> map = new HashMap<RandomListNode, RandomListNode>();
        while(X != null) {
            Y = new RandomListNode(X.data);
            Y.next = null;
            Y.random = null;
            map.put(X, Y);
            X = X.next;
        }
        X = head;
        while(X != null){
            Y = map.get(X);
            Y.next = map.get(X.next);
            Y.random = map.get(X.random);
            X = X.next;
        }
        return map.get(head);
    }
}