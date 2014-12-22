/*Copyright (c) Dec 22, 2014 CareerMonk Publications and others.
 * E-Mail           	: info@careermonk.com 
 * Creation Date    	: 2015-01-10 06:15:46 
 * Last modification	: 2006-05-31 
               by		: Narasimha Karumanchi 
 * File Name			: Trie.java
 * Book Title			: Data Structures And Algorithms Made In Java
 * Warranty         	: This software is provided "as is" without any 
 * 							warranty; without even the implied warranty of 
 * 							merchantability or fitness for a particular purpose. 
 * 
 */


package chapter15stringalgorithms;

public class Trie {

    private static final int ALPHABETS = 26;
    private Trie[] links;
    private boolean isEndOfString;

    public Trie() {
            links = new Trie[ALPHABETS];
            isEndOfString = false;
    }

    public void addString(String s) {
            Trie t = this;
            int k;
            int limit = s.length();
            for (k = 0; k < limit; k++) {
                    int index = s.charAt(k) - 'a';
                    if (t.links[index] == null)
                            t.links[index] = new Trie();
                    t = t.links[index];
            }
            t.isEndOfString = true;
    }

    void print(String s, Trie t) {
            if (t != null) {
                    if (t.isEndOfString)
                            System.out.println(s);
                    int k;
                    for (k = 0; k < ALPHABETS; k++)
                            if (t.links[k] != null)
                                    print(s + (char) (k + 'a'), t.links[k]);
            }
    }

    public boolean isEndOfString(String s) {
            Trie t = this;
            int k;
            int limit = s.length();
            for (k = 0; k < limit; k++) {
                    int index = s.charAt(k) - 'a';
                    if (t.links[index] == null)
                            return false;
                    t = t.links[index];
            }
            return t.isEndOfString;
    }

    public boolean isEndOfString() {
            return isEndOfString;
    }

    Trie childAt(char ch) {
            return links[ch - 'a'];
    }
    
    public static void main(String[] args) {
            Trie t = new Trie();
            t.addString("car"); t.addString("care"); t.addString("caree"); 
            t.addString("career"); t.addString("careerm"); t.addString("careermonk");
            System.out.println("Is careermo included? " + t.isEndOfString("careermo"));
            System.out.println("Is career included? " + t.isEndOfString("career"));
    }

}

