/*Copyright (c) Feb 22, 2016 CareerMonk Publications and others.
 * E-Mail           	: info@careermonk.com 
 * Creation Date    	: 2015-01-10 06:15:46 
 * Last modification	: 2006-05-31 
               by		: Narasimha Karumanchi 
 * File Name			: SkylinesDivideandConquer.java
 * Book Title			: Data Structures And Algorithms Made In Java
 * Warranty         	: This software is provided "as is" without any 
 * 							warranty; without even the implied warranty of 
 * 							merchantability or fitness for a particular purpose. 
 * 
 */


package chapter18divideandconquer;
class Building{
	int left, right, h;
	public Building(int x1, int h1, int x2) { left = x1; h = h1; right = x2; }
}
class strip{
    int left, h;
    strip(int x1, int h1) { left = x1; h = h1; }
 }
class Skyline{
	 strip[] strips;
	 public int Count;
	 int StartLoc;
	 public Skyline(int n) { 
        Count = 0; StartLoc = 0; strips = new strip[n]; 
	 }
	 public void Append(strip str) { 
        strips[StartLoc+Count] = str; Count++; 
	 }
	 public strip Head() { 
        return strips[StartLoc]; 
	 }
	 public strip RemoveHead(){
        strip str = strips[StartLoc];
        Count--; StartLoc++;
        return str;
	 }
	 public String ToString(){
		 String str = "";
         for(int i = StartLoc; i < StartLoc+Count; i++){
           if (i > StartLoc) 
               str = str + ",";
           str = str + strips[i].left + "," + strips[i].h;
         }
         return "(" + str + ")";
	 }
   }
public class SkylinesDivideandConquer {
    static Skyline GetSkyline(Building[] buildings, int start, int end){ 
		if (start == end){
            Skyline skl = new Skyline(2);
            skl.Append(new strip(buildings[start].left, buildings[start].h) );
            skl.Append(new strip(buildings[start].right, 0));
            return skl;
		 }
		 int mid = (start+end)/2;
		 Skyline sk1 = GetSkyline(buildings, start, mid);
		 Skyline sk2 = GetSkyline(buildings, mid+1, end);
		 return MergeSkylines(sk1, sk2);
	    }
    static Skyline MergeSkylines(Skyline SK1, Skyline SK2){
		 Skyline newSkl = new Skyline(SK1.Count + SK2.Count); // Allocate array space
		 int currentHeight1 = 0; int currentHeight2 = 0;
		 while ((SK1.Count > 0) && (SK2.Count > 0))
		     if (SK1.Head().left < SK2.Head().left){
                int CurX = SK1.Head().left;
                currentHeight1 = SK1.Head().h;
                int MaxH = currentHeight1;
                if (currentHeight2 > MaxH) MaxH = currentHeight2;
                    newSkl.Append(new strip(CurX, MaxH));
                SK1.RemoveHead();
		     }
		     else{
                int CurX = SK2.Head().left;
                currentHeight2 = SK2.Head().h;
                int MaxH = currentHeight1;
                if (currentHeight2 > MaxH) MaxH = currentHeight2;
                    newSkl.Append(new strip(CurX, MaxH));
                SK2.RemoveHead();
		     }
		 while (SK1.Count > 0){
	            strip str = SK1.RemoveHead(); newSkl.Append(str); 
		 }
		 while (SK2.Count > 0){
	            strip str = SK2.RemoveHead(); newSkl.Append(str); 
		 }
		 return newSkl;
    } 
}
