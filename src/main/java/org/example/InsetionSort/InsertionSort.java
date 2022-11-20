package org.example.InsetionSort;

public class InsertionSort {
  public static void main(String[] args) {
    //insertionSort -> after comparing elements to the left,
    //                 shift elements to the right to make room to insert value
    //                quadratic time O(n^2)
    //                small data set = decent
    //                large data set = bad
    //                less steps than bubble sort
    //                best case is O(n) compared to selection sort O(N^2)
    int[] array = {9,2,1,3,6,5,4,8,7};
    insertionSort(array);
    for(int i : array) {
      System.out.print(i + " ");
    }
  }

  //always start at 1 index
  private static void insertionSort(int[] array) {
    for(int i = 1; i < array.length; i++) {
      int temp = array[i];
      int j = i - 1;
      while(j >= 0 && array[j] > temp) {
        array[j + 1] = array[j];
        j--;
      }
      array[j + 1] = temp;
    }
  }
}
