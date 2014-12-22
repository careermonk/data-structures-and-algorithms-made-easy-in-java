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

import java.util.ArrayList;
import java.util.Stack;

public class PreOrderIterative {
    public ArrayList<Integer> preorderTraversal(BinaryTreeNode root) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        if(root == null)
            return res;
        Stack<BinaryTreeNode> s = new Stack<BinaryTreeNode>();
        s.push(root);
        while(!s.isEmpty()){
        	BinaryTreeNode tmp = s.pop();
            res.add(tmp.data);
            // pay more attention to this sequence. 
            if(tmp.right != null)
                s.push(tmp.right);
            if(tmp.getLeft() != null)
                s.push(tmp.getLeft());  
        }
        return res;
    }
}
