package org.example.BreadthFirstSearch;


public class BreadthFirstSearch {
  public static void main(String[] args) {
    // BFS => A breadth first search is an algo that uses a queue to traverses a tree or graph data structure.
    //        this is done one "level" at a time.
    //        rather than one "branch" at a time.

    // Depth First Search -> Traverse a graph branch by branch
    //                       utilizes stack
    //                       better if destination is on average far from the start
    //                       Children are visited before siblings
    //                       More popular for games/puzzles
    Graph graph = new Graph(5);
    graph.addNode(new Node('A'));
    graph.addNode(new Node('B'));
    graph.addNode(new Node('C'));
    graph.addNode(new Node('D'));
    graph.addNode(new Node('E'));
    graph.addEdge(0,1);
    graph.addEdge(1,2);
    graph.addEdge(1,4);
    graph.addEdge(2,3);
    graph.addEdge(2,4);
    graph.addEdge(3,4);
    graph.addEdge(4,0);
    graph.addEdge(4,2);

    graph.breadthFirstSearch(2);
    graph.print();

  }
}
