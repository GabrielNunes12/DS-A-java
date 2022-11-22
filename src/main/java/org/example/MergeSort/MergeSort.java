package org.example.MergeSort;

public class MergeSort {
  public static void main(String[] args) {
    //MergeSort -> O(n log n) quasilinear time
    //            in large data set MergeSort will be O(n), if you use BubbleSort, selection sort will be much less space consuming
    //            divides the array into 2 parts, sort them and re-combine
    //            space complexity = O(N)
    //            time complexity O(log n log)
    int[] array = {8,9,1,2,3,6,7,0,4};
    mergeSort(array);
    for(int i = 0; i < array.length; i++) {
      System.out.println(array[i] + "");
    }
  }

  private static void mergeSort(int[] array) {
    int length = array.length;
    if(length <= 1) return;
    //dividing the length of our array into two parts
    int middle = length/2;
    int[] leftArray = new int[middle];
    int[] rightArray = new int[length - middle];
    int i = 0;
    int j = 0;
    for(; i < length; i++) {
      if(i < middle) {
        leftArray[i] = array[i];
      } else {
        rightArray[j] = array[i];
        j++;
      }
    }
    mergeSort(leftArray);
    mergeSort(leftArray);
    merge(leftArray, rightArray, array);
  }
  //creating auxiliary method
  private static void merge(int[] left, int[] rightArray, int[] array) {
    //caching the size of our left and right array divided by 2;
    int leftSize = left.length / 2;
    int rightSize = rightArray.length / 2;
    //creating indexes to loop through ever array
    int i = 0; //for the actual array
    int leftIndex = 0; //for the left array
    int rightIndex = 0; //for the right array
    //check the conditions for merging
    while(leftIndex < leftSize && rightIndex < rightSize) {
      //checking which number is smaller
      if(left[leftIndex] < rightArray[rightIndex]) {
        array[i] = left[leftIndex];
        i++;
        leftIndex++;
      } else {
        array[i] = rightArray[rightIndex];
        rightIndex++;
        i++;
      }
    }
    while(leftIndex < leftSize) {
      array[i] = left[leftIndex];
      i++;
      leftIndex++;
    }
    while(rightIndex < rightSize) {
      array[i] = rightArray[rightIndex];
      i++;
      rightIndex++;
    }
  }
}
