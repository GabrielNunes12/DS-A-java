package org.example.DepthFirstSearch;

import java.util.ArrayList;

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
  //Creating a depth first search method
  public void depthFirstSearch(int source) {
    boolean[] visited = new boolean[matrix.length];
    depthFirsSearchHelper(source, visited);
  }

  private void depthFirsSearchHelper(int source, boolean[] visited) {
    if(visited[source]) {
      return;
    } else {
      visited[source] = true;
      System.out.println(nodes.get(source).data + " = Visited");
    }
    //iterating over the matrix
    for(int i = 0; i < matrix[source].length; i++) {
      //checking if a row and column has 1
      if(matrix[source][i] == 1) {
        //calling a stack recursively
        depthFirsSearchHelper(i, visited);
      }
    }
  }
}
