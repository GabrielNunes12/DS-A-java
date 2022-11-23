package org.example.QuickSort;

public class QuickSort {
  /*
  * Quick sort -< moves smaller elements to left of a pivot.
  *               recursevily divide array in 2 partitions
  * run-time: Best case O(n log(n))
  *           average case O(n log(n))
  *           Worst case O(N^2) if already sorted
  * Space complexity -> O(log(n)) due to recursion
  * */
  public static void main(String[] args) {
    int[] array = {8,2,5,3,9,4,7,6,1};
    quickSort(array, 0, array.length - 1);
    for(int i : array) {
      System.out.println(i + "");
    }
  }

  private static void quickSort(int[] array, int start, int end) {
    if(end <= start) return;
    int pivot = partition(array, start, end);
    quickSort(array, start, pivot - 1);
    quickSort(array, pivot + 1, end);
  }
  private static int partition(int[] array, int start, int end){
    int pivot = array[end];
    int i = start - 1;
    for(int indexJ = start; indexJ <= end - 1; indexJ++) {
      if(array[indexJ] < pivot) {
        i++;
        int temp = array[i];
        array[i] = array[indexJ];
        array[indexJ] = temp;
      }
    }
    i++;
    int temp = array[i];
    array[i] = array[end];
    array[end] = temp;
    return i;
  }

}
