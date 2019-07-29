/*Copyright (c) Dec 21, 2014 CareerMonk Publications and others.
 * E-Mail           	: info@careermonk.com 
 * Creation Date    	: 2015-01-10 06:15:46 
 * Last modification	: 2006-05-31 
               by		: Narasimha Karumanchi 
 * File Name			: CLLNode.java
 * Book Title			: Data Structures And Algorithms Made In Java
 * Warranty         	: This software is provided "as is" without any 
 * 							warranty; without even the implied warranty of 
 * 							merchantability or fitness for a particular purpose. 
 * 
 */

import java.io.*;
import java.util.*;

class LinkedList<Integer> implements Iterable<Integer> {
    private ListNode<Integer> head;     // beginning of linked list
    private int n;                      // number of elements in linked list

    // helper linked list class
    private static class ListNode<Integer> {
        private Integer data;
        private ListNode<Integer> next;
    }

    public LinkedList() {
        head = null;
        n = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        return n;
    }

    public void add(Integer data) {
        ListNode<Integer> oldfirst = head;
        head = new ListNode<Integer>();
        head.data = data;
        head.next = oldfirst;
        n++;
    }

    public Iterator<Integer> iterator()  {
        return new ListIterator(head);
    }

    // an iterator, doesn't implement remove() since it's optional
    private class ListIterator implements Iterator<Integer> {
        private ListNode<Integer> current;

        public ListIterator(ListNode<Integer> head) {
            current = head;
        }

        public boolean hasNext()  { return current != null;                     }
        public void remove()      { throw new UnsupportedOperationException();  }

        public Integer next() {
            if (!hasNext()) throw new NoSuchElementException();
            Integer data = current.data;
            current = current.next;
            return data;
        }
    }
}
public class Graph {
    private static final String NEWLINE = System.getProperty("line.separator");

    private final int V;
    private int E;
    private LinkedList<Integer>[] adjList;

    // Initializes an empty graph with V vertices and 0 edges.
    public Graph(int V) {
        if (V < 0) throw new IllegalArgumentException("Number of vertices must be nonnegative");
        this.V = V;
        this.E = 0;
        adjList = (LinkedList<Integer>[]) new LinkedList[V];
        for (int u = 0; u < V; u++) {
            adjList[u] = new LinkedList<Integer>();
        }
    }

    // random graph with V vertices and E edges
    public Graph(int V, int E) {
        this(V);
        if (E > (long) V*(V-1)/2 + V) throw new IllegalArgumentException("Too many edges");
        if (E < 0)                    throw new IllegalArgumentException("Too few edges");
        Random random = new Random();

        // can be inefficient
        while (this.E != E) {
            int u = random.nextInt(V);
            int v = random.nextInt(V);
            addEdge(u, v);
        }
    }


    // Initializes a new graph.
    public Graph(Graph G) {
        this(G.V());
        this.E = G.E();
        for (int u = 0; u < G.V(); u++) {
            // reverse so that adjacency list is in same order as original
            Stack<Integer> reverse = new Stack<Integer>();
            for (int v : G.adjList[u]) {
                reverse.push(v);
            }
            for (int v : reverse) {
                adjList[u].add(v);
            }
        }
    }

    // Returns the number of vertices in this graph.
    public int V() {
        return V;
    }

    // Returns the number of edges in this graph.
    public int E() {
        return E;
    }

    // throw an IllegalArgumentException unless {@code 0 <= u < V}
    private void validateVertex(int u) {
        if (u < 0 || u >= V)
            throw new IllegalArgumentException("vertex " + u + " is not between 0 and " + (V-1));
    }

    public void addEdge(int u, int v) {
        validateVertex(u);
        validateVertex(v);
        E++;
        adjList[u].add(v);
        adjList[v].add(u);
    }

    // Returns the vertices adjacent to vertex {@code u}.
    public Iterable<Integer> adjList(int u) {
        validateVertex(u);
        return adjList[u];
    }

    public int degree(int u) {
        validateVertex(u);
        return adjList[u].size();
    }

    // Returns a string representation of this graph.
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("Undirected graph" + NEWLINE);
        s.append(V + " vertices, " + E + " edges " + NEWLINE);
        for (int u = 0; u < V; u++) {
            s.append(u + ": ");
            for (int v : adjList[u]) {
                s.append(v + " ");
            }
            s.append(NEWLINE);
        }
        return s.toString();
    }

    // test code
    public static void main(String[] args) {
        Graph G = new Graph(5, 7);
        System.out.println(G.toString());
    }

}
