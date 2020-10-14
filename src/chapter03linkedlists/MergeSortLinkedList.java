class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;
    
    public LinkedListNode(T data) {
        this.data = data;
    }
}

public class MergeSortLinkedList{
    
    	public static LinkedListNode<Integer> mergeSort(LinkedListNode<Integer> head) {
	
if (head == null || head.next == null) { 
            return head; 
        } 
  
       LinkedListNode<Integer> middle = getMiddle(head); 
        LinkedListNode<Integer> nextofmiddle = middle.next; 
  
       middle.next = null; 
  
      LinkedListNode<Integer> left = mergeSort(head); 
  
        LinkedListNode<Integer> right = mergeSort(nextofmiddle); 
  
        LinkedListNode<Integer> sortedlist = sortedMerge(left, right); 
        return sortedlist; 
	}
  public static LinkedListNode<Integer> sortedMerge(LinkedListNode<Integer> a, LinkedListNode<Integer> b) 
    { 
        LinkedListNode<Integer> result = null; 
        if (a == null) 
            return b; 
        if (b == null) 
            return a; 
  
        if (a.data <= b.data) { 
            result = a; 
            result.next = sortedMerge(a.next, b); 
        } 
        else { 
            result = b; 
            result.next = sortedMerge(a, b.next); 
        } 
        return result; 
    } 
  

  
   public static LinkedListNode<Integer> getMiddle(LinkedListNode<Integer> h) 
    { 
         if (h == null) 
            return h; 
        LinkedListNode<Integer> fastptr = h.next; 
        LinkedListNode<Integer> slowptr = h; 
  
          while (fastptr != null) { 
            fastptr = fastptr.next; 
            if (fastptr != null) { 
                slowptr = slowptr.next; 
                fastptr = fastptr.next; 
            } 
        } 
        return slowptr; 
    } 



  
}