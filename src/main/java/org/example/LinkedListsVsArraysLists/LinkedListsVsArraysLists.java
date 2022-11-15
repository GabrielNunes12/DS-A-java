package org.example.LinkedListsVsArraysLists;
import java.util.*;
public class LinkedListsVsArraysLists {
  public static void main(String[] args) {
    LinkedList<Integer> linkedList = new LinkedList<>();
    ArrayList<Integer> arrayList = new ArrayList<>();
    //arrays lists is faster to access an element
    long startTime;
    long endTime;
    long elapsedTime;
    for(int i = 0; i < 100000; i++) {
      linkedList.add(i);
      arrayList.add(i);
    }
    // **** LINKED LIST *****
    startTime = System.nanoTime();

    // linkedList.get(0); 11900 ns
//    linkedList.get(500); 37000 ns
    linkedList.remove(0);

    endTime = System.nanoTime();
    elapsedTime = endTime - startTime;
    System.out.println("LinkedList:\t" + elapsedTime + " ns");

    // **** Arrays lists *****
    startTime = System.nanoTime();

    // arrayList.get(0); 2500 ns
//    arrayList.get(500); 2601 ns
    arrayList.remove(0);

    endTime = System.nanoTime();
    elapsedTime = endTime - startTime;
    System.out.println("ArrayLists:\t" + elapsedTime + " ns");

  }
}
