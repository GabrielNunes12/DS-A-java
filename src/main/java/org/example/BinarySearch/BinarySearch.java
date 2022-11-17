package org.example.BinarySearch;

import java.util.Arrays;

public class BinarySearch {
  public static void main(String[] args) {
    //binary search -> Search algorithm that finds the position of a target value within a sorted array
    //                 Half of the array is eliminated during each "step" *MUST BE SORTED COLLECTION IN ORDER
    //                 TO WORK* searching of this binary search is O(n log N) -> is fantastic to work with a huge
    //                 data sets
    int[] array = new int[1000000];
    int target = 10000;
    for(int i = 0; i < array.length; i++) {
      array[i] = i;
    }
    // using binarySearch from Arrays (native from Java)
    int index = Arrays.binarySearch(array, target);
    if(index == -1) {
      System.out.println("Element not found");
    } else {
      System.out.println("Element was found at index: " + index);
    }
    //Implementing my own BinarySearch
    int indeArray = binarySearch(array, target);
    if(indeArray == -1) {
      System.out.println("Element not found");
    } else {
      System.out.println("Element was found at index: " + index);
    }
  }

  private static int binarySearch(int[] array, int target) {
    int counter = 0;
    int low = 0;
    int high = array.length;
    while (low <= high) {
      int middle = low + (high - low) / 2;
      int value = array[middle];
      System.out.println("Middle: " + middle + " and tries: " + counter++);
      if(value < target) low = middle + 1;
      else if(value > target) high = middle - 1;
      else return middle; //found the element
    }
    return -1; // in case it didn't find it.
  }
}
