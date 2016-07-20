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

public class CheckAVL {
    public boolean isAVL(BinarySearchTreeNode root, int min, int max) {
        if(root == null)
            return true;
        return root.data > min && root.data < max && isAVL(root.left, min, root.data) && isAVL(root.right, root.data, max) && Math.abs(getHeight(root.left) - getHeight(root.right)) <= 1;
    }
    public int getHeight(BinarySearchTreeNode root){
        int leftHeight, rightHeight;
        if(root == null)
            return 0;
        else{
            leftHeight = getHeight(root.left);
            rightHeight = getHeight(root.right);
            if(leftHeight > rightHeight)
                return leftHeight + 1;
            else
                return rightHeight + 1;
        }
    }
    
    public boolean isAVL(BinarySearchTreeNode root){
        return isAVL(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
}
