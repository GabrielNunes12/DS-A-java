package org.example.InterpolateSearch;

public class InterpolateSearch {
  public static void main(String[] args) {
    //Interpolation search - improvement over binary search best used for "uniformly" distributed data
    //                       "guesses" where the data might be based on calculated probe results
    //                        if the probe is incorrect, we narrow the search, and try again.
    //                        average cases: O(log(log(n)))
    //                        worst case: O(N) [values increased exponentially]
    //                        we'll return the index of that data
    //                        in that case works perfectly because all numbers are increasing by 1 "uniformly distributed data"
    int[] array = {1,2,4,8,16,32,64,128,512,1024,2048};
    int index = interpolationSearch(array, 32);
    if(index != -1) {
      System.out.println("Element found at: " + index);
    } else {
      System.out.println("Element not found!");
    }
  }

  private static int interpolationSearch(int[] array, int value) {
    int high = array.length - 1;
    int low = 0;
    while (value >= array[low] && value <= array[high] && low <= high) {
      int probe = low + (high - low) * (value - array[low]) / (array[high] - array[low]);
      System.out.println("Probe: " + probe);
      if(array[probe] == value) {
        return probe;
      } else if (array[probe] < value) {
        low = probe + 1;
      } else {
        high = probe - 1;
      }
    }
    return -1;
  }
}
