package org.example.AdjacencyList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Graph {
  ArrayList<LinkedList<Node>> alist;

  public Graph() {
    alist = new ArrayList<>();
  }

  public void addNode(Node node) {
    LinkedList<Node> currentNode = new LinkedList<>();
    currentNode.add(node);
    alist.add(currentNode);
  }

  public void addEdge(int source, int destination) {
    //Retrieving the head of a list
    LinkedList<Node> currentList = alist.get(source);
    //Retrieving the last node in our list
    Node destinationNode = alist.get(destination).get(0);
    currentList.add(destinationNode);
  }
  public boolean checkEdge(int source, int destination) {
    LinkedList<Node> currentList = alist.get(source);
    Node destinationNode = alist.get(destination).get(0);
    for(Node node : currentList) {
      if(node == destinationNode) {
        return true;
      }
    }
    return false;
  }
  public void print() {
    for(LinkedList<Node> currentList : alist) {
      for(Node node : currentList) {
        System.out.print(node.data + " -> ");
      }
      System.out.println();
    }
  }
}
