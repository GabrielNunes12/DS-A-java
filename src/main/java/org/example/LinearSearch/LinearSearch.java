package org.example.LinearSearch;

public class LinearSearch {
  public static void main(String[] args) {
    // Linear search -> iterates through a collection one element at a time;
    //                  runtime complexity: O(N)
    //                  disadvantages: Slow for large dataset
    //                  advantages: Fast for searches of small to medium data sets, does not need to be sorted, useful for data structures
    //                  doesn't have random access <LinkedList>
    int[] arrayInt = {1,2,3,3,3,4,5,5,6,71,2,32,4};
    int index = linearSearch(arrayInt, 1);
    if(index != -1) {
      System.out.println("element found at index: " + index);
    } else {
      System.out.println("Element not found!");
    }
  }

  private static int linearSearch(int[] array, int value) {
    for(int i = 0; i < array.length; i++) {
      if(array[i] == value) {
        return i;
      }
    }
    return -1;
  }
}
