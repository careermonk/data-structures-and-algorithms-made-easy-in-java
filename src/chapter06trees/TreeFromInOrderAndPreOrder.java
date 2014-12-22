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

public class TreeFromInOrderAndPreOrder {
    public BinaryTreeNode buildBinaryTree(int[] preorder, int[] inorder) {
        if(preorder.length == 0 || inorder.length != preorder.length)
            return null;
        return buildBT(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }
    public BinaryTreeNode buildBT(int[] preOrder, int preStart, int preEnd, int[] inOrder, int inStart, int inEnd){
        if(preStart > preEnd || inStart > inEnd)
            return null;
        int data = preOrder[preStart];
        BinaryTreeNode cur = new BinaryTreeNode(data);
        int offset = inStart;
        for(; offset < inEnd; offset++){
            if(inOrder[offset] == data)
                break;
        }
        cur.setLeft(buildBT(preOrder, preStart + 1, preStart + offset - inStart, inOrder, inStart, offset - 1));
        cur.right = buildBT(preOrder, preStart + offset - inStart + 1, preEnd, inOrder, offset + 1, inEnd);
        return cur;
    }
}
