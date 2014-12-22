/*Copyright (c) Dec 22, 2014 CareerMonk Publications and others.
 * E-Mail           	: info@careermonk.com 
 * Creation Date    	: 2015-01-10 06:15:46 
 * Last modification	: 2006-05-31 
               by		: Narasimha Karumanchi 
 * File Name			: CheckEndian.java
 * Book Title			: Data Structures And Algorithms Made In Java
 * Warranty         	: This software is provided "as is" without any 
 * 							warranty; without even the implied warranty of 
 * 							merchantability or fitness for a particular purpose. 
 * 
 */


package chapter21miscconcepts;

import java.nio.ByteOrder;
public class CheckEndian {
	public static boolean isBigEndian() {
	   if(ByteOrder.nativeOrder().equals(ByteOrder.BIG_ENDIAN))
	      return true;
	   return false;
	}
	public static boolean isLittleEndian() {
	   if(ByteOrder.nativeOrder().equals(ByteOrder.LITTLE_ENDIAN))
	      return true;
	   return false;
	}
}
