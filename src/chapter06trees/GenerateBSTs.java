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

public class GenerateBSTs {
    public ArrayList<BinarySearchTreeNode> generateTrees(int n) {
        if(n == 0) return generateTrees(1, 0);
        return generateTrees(1, n);
        
    }
    public ArrayList<BinarySearchTreeNode> generateTrees(int start, int end) {
        ArrayList<BinarySearchTreeNode> subTrees = new ArrayList<BinarySearchTreeNode>();
        if(start > end){
            subTrees.add(null);
            return subTrees;
        }          
        for(int i = start; i <= end; i++){
            for(BinarySearchTreeNode left : generateTrees(start, i - 1)){
                for(BinarySearchTreeNode right : generateTrees(i + 1, end)){
                	BinarySearchTreeNode aTree = new BinarySearchTreeNode(i);
                    aTree.left = left;
                    aTree.right = right;
                    subTrees.add(aTree);
                }
            }
        }
        return subTrees;
    } 
}
