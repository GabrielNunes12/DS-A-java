package org.example.BubbleSort;

public class BubbleSort {
  public static void main(String[] args) {
    //Bubble sort is a algorithm that checks if the adjacent number is in order if not, then swap positions to put 'em in order.
    //                int[] array
    //        (light)  [9,2,1,3,4,6,8,7] (heavy)
    //        (everything is light in water contained by a box, will float) <- [array] -> (everything is a heavier ones will remain in deep of the box)
    //        BIG O(N^2) isn't efficient
    //        for small data-set = okay-ish
    //        for big data-set = bad
    int[] array = {9,3,2,5,6,0,1,7,4,8};
    bubbleSort(array);
    for(int i : array) {
      System.out.print(i);
    }
  }
  //O(N^2)
  public static void bubbleSort(int array[]) {
    for(int i = 0; i < array.length - 1; i++) {
      for(int j = 0; j < array.length - i - 1; j++) {
        if(array[j] > array[j + 1]) {
          int temp = array[j];
          array[j] = array[j + 1];
          array[j+1] = temp;
        }
      }
    }
  }
}
