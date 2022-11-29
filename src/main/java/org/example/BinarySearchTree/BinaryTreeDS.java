package org.example.BinarySearchTree;

public class BinaryTreeDS {
  public static void main(String[] args) {
    //Binary Tree Search -> binary tree has some rules, first the root node has to be greater than the left child and smaller
    //                      than the right child
    //                      Easy to locate a node when they are in this order
    //        run time complexity: best case O(log n)
    //                             worst case O(n)
    //        space complexity: O(n)
    BinaryTreeSearch binaryTreeSearch = new BinaryTreeSearch();

    binaryTreeSearch.insertNode(new Node(4));
    binaryTreeSearch.insertNode(new Node(8));
    binaryTreeSearch.insertNode(new Node(0));
    binaryTreeSearch.insertNode(new Node(1));
    binaryTreeSearch.insertNode(new Node(6));
    binaryTreeSearch.display();
    System.out.println(binaryTreeSearch.search(2));
    binaryTreeSearch.remove(8);
    binaryTreeSearch.display();
  }
}
