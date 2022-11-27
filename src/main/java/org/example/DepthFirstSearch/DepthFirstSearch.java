package org.example.DepthFirstSearch;


public class DepthFirstSearch {
  public static void main(String[] args) {
    //Depth first search -> Pick a route, keep going.
    //                      If you reach a dead end, or an already visited node,
    //                      backtrack to a previous node with unvisited adjacent neighbors
    // using with Adjacency Matrix
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
    graph.depthFirstSearch(3);

  }
}
