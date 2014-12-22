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

public class TreeFromInOrderAndPostOrder {
    public BinaryTreeNode buildBinaryTree(int[] inorder, int[] postorder) {
        if(postorder.length == 0 || postorder.length != inorder.length)
            return null;
        return buildBT(postorder, 0, postorder.length - 1, inorder, 0, inorder.length - 1);
    }
    
    public BinaryTreeNode buildBT(int[] postOrder, int postStart, int postEnd, int[] inOrder, int inStart, int inEnd){
        if(postStart > postEnd || inStart > inEnd)
            return null;
        int val = postOrder[postEnd];
        int offset = inStart;
        BinaryTreeNode cur = new BinaryTreeNode(val);
        // search for the inorder index
        for(; offset < inEnd; offset++){
            if(inOrder[offset] == val)
                break;
        }
        cur.setLeft(buildBT(postOrder, postStart, postStart + offset - inStart - 1, inOrder, inStart, offset - 1));
        cur.right = buildBT(postOrder, postStart + offset - inStart, postEnd - 1, inOrder, offset + 1, inEnd);
        return cur;
    }
}
