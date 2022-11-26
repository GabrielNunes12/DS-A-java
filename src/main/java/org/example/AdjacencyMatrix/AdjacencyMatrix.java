package org.example.AdjacencyMatrix;

public class AdjacencyMatrix {
  public static void main(String[] args) {
    //Adjacency matrix -> A 2D array to store 1's and 0's to represent edges
    //                    # of rows = # of unique nodes
    //                    # of columns = # of unique nodes
    //run time complexity to check on the edge O(1)
    // space complexity = O(n^2)
    Graph graph = new Graph(5);
    graph.addNode(new Node('A'));
    graph.addNode(new Node('B'));
    graph.addNode(new Node('C'));
    graph.addNode(new Node('D'));
    graph.addNode(new Node('E'));
    graph.addEdge(0,1);
    graph.addEdge(1,2);
    graph.addEdge(2,3);
    graph.addEdge(3,4);
    graph.print();
  }
}
