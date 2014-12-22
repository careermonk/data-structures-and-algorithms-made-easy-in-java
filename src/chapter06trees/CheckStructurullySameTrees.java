/*Copyright (c) Dec 21, 2014 CareerMonk Publications and others.
 * E-Mail           	: info@careermonk.com 
 * Creation Date    	: 2015-01-10 06:15:46 
 * Last modification	: 2006-05-31 
               by		: Narasimha Karumanchi 
 * File Name			: CheckStructurullySameTrees.java
 * Book Title			: Data Structures And Algorithms Made In Java
 * Warranty         	: This software is provided "as is" without any 
 * 							warranty; without even the implied warranty of 
 * 							merchantability or fitness for a particular purpose. 
 * 
 */


package chapter06trees;

public class CheckStructurullySameTrees {
    public boolean checkStructurullySameTrees(BinaryTreeNode  root1, BinaryTreeNode  root2) {
    	if(root1 == null && root2 == null) 	
            return true;
    	if(root1 == null || root2 == null) 
            return false;
    	return (checkStructurullySameTrees(root1.getLeft(), root2.right) && 
    			checkStructurullySameTrees(root1.right, root2.getLeft()));
     }
}
