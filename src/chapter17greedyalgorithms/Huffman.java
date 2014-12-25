/*Copyright (c) Dec 25, 2014 CareerMonk Publications and others.
 * E-Mail           	: info@careermonk.com 
 * Creation Date    	: 2015-01-10 06:15:46 
 * Last modification	: 2006-05-31 
               by		: Narasimha Karumanchi 
 * File Name			: HuffmanCoding.java
 * Book Title			: Data Structures And Algorithms Made In Java
 * Warranty         	: This software is provided "as is" without any 
 * 							warranty; without even the implied warranty of 
 * 							merchantability or fitness for a particular purpose. 
 * 
 */


package chapter17greedyalgorithms;
import chapter07priorityqueues.BinaryHeap;

public class Huffman{
	// Private variables w/ accessors
	private int SIZE;
	private int[] labels = null;         // Label associated with each node, maybe ASCII characters
	private int[] freq = null;           // Frequency array
	private String[] huffCodes = null;   // Huffman string for each label
	private boolean[][] huffBoolCodes = null; // Huffman boolean codes for each label
	
	// Private variables
	private BinaryHeap<HuffmanTreeNode> bh = null; // Generic binary heap
	private HuffmanTreeNode ht_root = null;
	
	// Public variables
	public int numUsedLabels;            // Number of labels with positive frequency
	
	// Constructor given frequencies
	public Huffman(int[] freq){
		SIZE = freq.length;
		labels = new int[SIZE];
		this.freq = new int[SIZE];
		huffCodes = new String[SIZE];
		huffBoolCodes = new boolean[SIZE][];
		numUsedLabels = 0;
		bh = new BinaryHeap<HuffmanTreeNode>(SIZE);
		
		// Copy input frequency array
		for(int i=0; i<SIZE; i++){
			this.freq[i] = freq[i];
			
			// Fill labels
			labels[i] = i;
		}
			
		// Build Huffman tree and set Huffman codes
		buildHuffmanTree();
	}
	
	// Static because of homework requirements!!
	public static boolean[][] makeHuffmanCodes(int[] freq){
		// Construct a Huffman tree with a frequency array
		Huffman ht = new Huffman(freq);
		
		// Return the Huffman boolean codes
		return ht.getHuffmanBoolCodes();
	}
	
	// Accessors
	public String[] getHuffmanCodes() {return huffCodes;}
	public boolean[][] getHuffmanBoolCodes() {return huffBoolCodes;}
	
	// After the labels and frequencies have been set internally, create Huffman
	// tree and set Huffman codes
	private String[] buildHuffmanTree(){
		// Filling the binary heap
		// (could make its own method)
		for(int i=0; i<SIZE; i++){	
			if(freq[i]>0){ 	// If the character doesnt appear in the input text
							// dont add it to priority queue.
				HuffmanTreeNode m = new HuffmanTreeNode(freq[i],labels[i]);
				bh.insert(m);
				numUsedLabels++;
			}
			else{
				huffCodes[i] = null;
				huffBoolCodes[i] = null;
			}
		}
		
		// Creating a huffman tree
		// (could make its own method)
		while ( !bh.isEmpty() ) {  
			// Get the first member from the binary heap
			HuffmanTreeNode m1 = (HuffmanTreeNode)bh.deleteMin();
			
			// If binary heap is now empty, exit this loop
			if( bh.isEmpty() ){
				// Special case
				if( numUsedLabels == 1 ){
					//HuffmanTreeNode m2 = new HuffmanTreeNode(0,-1);
					HuffmanTreeNode m3 = new HuffmanTreeNode(m1.getWeight(),-1);
					m3.setLeftNode(m1);
					m3.setRightNode(null);
					
					// Assign Huffman tree root
					ht_root = m3;
				}
				else{
					// Assign Huffman tree root
					ht_root = m1;
				}
				
				// Exit while loop
				break;
			}
			
			// Get the next member from the binary heap
			HuffmanTreeNode m2 = (HuffmanTreeNode)bh.deleteMin();
			
			// Create a new inner node
			HuffmanTreeNode m3 = new HuffmanTreeNode(m1.getWeight()+m2.getWeight(),-1);
			
			// Assign this new inner nodes children
			m3.setLeftNode(m1);
			m3.setRightNode(m2);
			
			// Insert this new node back into the binary heap
			bh.insert(m3);
		}		
		
		// Assign codes
		setHuffmanCodes();
		
		return huffCodes;
	}
	
	// Returns true if Huffman tree is empty
	private boolean isEmpty(){
		if( ht_root == null )
			return true;
		else
			return false;
	}
	
	// Traverses tree filling huffman codes for all nodes
    private void setHuffmanCodes( ){
        if( isEmpty( ) )
            System.out.println( "Empty tree" );
        else
            setHuffmanCodes( ht_root, "" );
    }
    
    // The recursive call to fill Huffman codes
    private void setHuffmanCodes(HuffmanTreeNode node, String code) {
		if ((node.getLeftNode()==null) && (node.getRightNode()==null)){
			// Sets Huffman string code
			huffCodes[node.getCharacter()]=code; // Storing the huff codes in an array
			
			// Sets Huffman boolean array code
			huffBoolCodes[node.getCharacter()]=convertStringToBoolArray(code);
			
			// Not really necessary
			node.setCode(code);
		}

		// Traverse left
		if(node.getLeftNode() != null)
			setHuffmanCodes(node.getLeftNode(),code+"0");

		// Traverse right
		if(node.getRightNode() != null)
			setHuffmanCodes(node.getRightNode(),code+"1");    	
    }
    
    // Converts a string of "001010101" to a boolean array
    private boolean[] convertStringToBoolArray(String s){
    	// Create output
    	boolean[] boolArray = new boolean[s.length()];
    	
    	// Assign output
    	for(int i=0; i<s.length(); i++){
    		if(s.charAt(i) == '1'){
    			boolArray[i] = true;
    		}
    		else if(s.charAt(i) == '0'){
    			boolArray[i] = false;
    		}
    		else{
    			// Ideally this code chunk would handle non 01 Strings
    			// Some sort of error message
    			
    			// But I won't worry about that
    			System.out.println("ERROR in String to boolean conversion");
    			boolArray[i] = false;
    		}
    	}
    	
    	return boolArray;
    }
    
    // Displays Huffman codes to the screen
    public void displayHuffmanCodes() {
    	System.out.println("Huffman Code Strings");
    	for(int i=0; i<SIZE; i++){
    		if(freq[i]>0)
    			System.out.println((char)i + ": " + huffCodes[i]);
    	}
    }
    
    // Displays Huffman boolean codes to the screen
    public void displayHuffmanBoolCodes(){
    	System.out.println("Huffman Boolean Codes");
    	for(int i=0; i<SIZE; i++){
    		if(freq[i]>0){
    			System.out.print((char)i + ": ");
    			for(int j=0; j<huffBoolCodes[i].length; j++){
    				System.out.print(huffBoolCodes[i][j] + " ");
    			}
    			System.out.println("");
    		}
    	}
    }
}