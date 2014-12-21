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

package chapter11searching;

public class SearchInSorted2DMatrix {
    public boolean searchMatrix(int[][] A, int target) {
        int length = A.length;
        int width = A[0].length;
        int start = 0; 
        int end = width * length - 1;
        while(start <= end){
            int mid = (start + end) / 2;
            int x = mid / width;
            int y = mid % width;
            if(A[x][y] == target)
                return true;
            else if(A[x][y] > target)
                end = mid - 1;
            else 
                start = mid + 1;
        }
        return false;
    }
}
