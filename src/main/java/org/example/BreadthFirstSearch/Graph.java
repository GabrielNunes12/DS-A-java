package org.example.BreadthFirstSearch;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {
  ArrayList<Node> nodes;
  int[][] matrix;

  public Graph(int size) {
    nodes = new ArrayList<>();
    this.matrix = new int[size][size];
  }

  public void addNode(Node node) {
    nodes.add(node);
  }

  //source will be the row, destination will be the column
  public void addEdge(int source, int destination) {
    matrix[source][destination] = 1;
  }
  public boolean checkEdge(int source, int destination) {
    if(matrix[source][destination] == 1) return true;
    else return false;
  }
  public void print() {
    System.out.print("  ");
    //Printing the columns
    for(Node node : nodes) {
      System.out.print(node.data + " ");
    }
    System.out.println();
    for(int row = 0; row < matrix.length; row++) {
      //Printing for every line the name of it
      System.out.print(nodes.get(row).data + " ");
      for(int column = 0; column < matrix[row].length; column++) {
        System.out.print(matrix[row][column] + " ");
      }
      System.out.println();
    }
  }
  //source params will be the index of a starting point
  public void breadthFirstSearch(int source) {
    Queue<Integer> queue = new LinkedList<>();
    boolean[] visited = new boolean[matrix.length];
    queue.offer(source);
    visited[source] = true;
    while (queue.size() != 0) {
      source = queue.poll();
      System.out.println(nodes.get(source).data + " -> visited");
      for(int i = 0; i < matrix[source].length; i++) {
        if(matrix[source][i] == 1 && !visited[i]) {
          queue.offer(i);
          visited[i] = true;
        }
      }
    }
  }
}
