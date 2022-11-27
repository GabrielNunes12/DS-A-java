package org.example.AdjacencyList;



public class AdjacencyList {
  public static void main(String[] args) {
    //Adjacency list -> an array/arraylist of linkedlists
    //                  Each linkedList has a unique node at the head.
    //                  All adjacency neighbors to that node are added to that node's Linkedlist
    //                  run time: O(n)
    //                  space complexity: o(n+n) dropping constants O(n)
    Graph graph = new Graph();
    graph.addNode(new Node('A'));
    graph.addNode(new Node('B'));
    graph.addNode(new Node('C'));
    graph.addNode(new Node('D'));
    graph.addNode(new Node('E'));
    graph.addEdge(0,1);
    graph.addEdge(1,2);
    graph.addEdge(2,4);
    graph.addEdge(2,3);
    graph.addEdge(3,4);
    graph.print();
  }
}
