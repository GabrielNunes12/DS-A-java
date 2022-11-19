package org.example.SelectionSort;

public class SelectionSort {
  public static void main(String[] args) {
    // selection sort = search through an array and keep track of the minimum value during each iteration.
    //                  At the end of each iteration, we swap values
    //                Quadratic time = O(N^2)
    //                Small data-set = ok
    //                large data-set = bad
    int[] array = {2,3,1,4,5,7,8,9,6};
    selectionSort(array);
    for(int i : array) {
      System.out.print(i);
    }
  }

  private static void selectionSort(int[] array) {
    for(int i = 0; i < array.length - 1; i++) {
      int min = i;
      for(int j = i + 1; j < array.length; j++) {
        //ASCENDING ORDER
        if(array[min] > array[j]) {
          min = j;
        }
      }
      int temp = array[i];
      array[i] = array[min];
      array[min] = temp;
    }
  }
}
