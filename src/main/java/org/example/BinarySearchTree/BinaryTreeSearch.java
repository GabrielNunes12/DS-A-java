package org.example.BinarySearchTree;

public class BinaryTreeSearch {

  Node root;
  public void insertNode(Node node) {
    root = insertHelper(root, node);
  }
  //using recursion to do it
  private Node insertHelper(Node root, Node node) {
    int data = node.data;
    if(root == null) {
      root = node;
      return root;
    }
    else if(data < root.data) {
      root.left = insertHelper(root.left, node);
    } else {
      root.right = insertHelper(root.right, node);
    }
    return root;
  }
  public void display() {
    displayHelper(root);
  }
  private void displayHelper(Node root) {
    if(root != null) {
      //in order traversal
      displayHelper(root.left);
      System.out.println(root.data);
      displayHelper(root.right);
    }
  }
  public boolean search(int data) {
    return searchHelper(root, data);
  }
  private boolean searchHelper(Node root, int data) {
    if(root == null) return false;
    else if(root.data == data) {
      return true;
    }else if (root.data > data) {
      return searchHelper(root.left, data);
    }else {
      return searchHelper(root.right, data);
    }
  }
  public void remove(int data) {
    if(search(data)) {
      removeHelper(root, data);
    } else {
      System.out.println("Cannot find your data: " + data);
    }
  }
  private Node removeHelper(Node root, int data) {
    if(root == null) {
      return root;
    } else if (data < root.data){
      root.left = removeHelper(root.left,data);
    } else if(data > root.data) {
      root.right = removeHelper(root.right, data);
    } else {
      //if this is a leaf node
      if(root.left == null && root.right == null) {
        root = null;
      } else if(root.right != null){ // find the sucessor
        root.data = sucessor(root);
        root.right = removeHelper(root.right, root.data);
      } else { //find a predecessor to replace this node
        root.data = predecessor(root);
        root.left = removeHelper(root.left, root.data);
      }
    }
    return root;
  }
  private int sucessor(Node root) { //find the least value below the right child of this root node
    root = root.right;
    while (root.left != null) {
      root = root.left;
    }
    return root.data;
  }
  private int predecessor(Node root) { //find the greatest value below the right child of this root node
    root = root.left;
    while (root.right != null) {
      root = root.right;
    }
    return root.data;
  }
}
