package org.example.AdjacencyMatrix;

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
}
