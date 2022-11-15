package org.example.DynamicArray;

import java.util.Arrays;

public class DynamicArray {
  public static void main(String[] args) {
    //Dynamic array is resizable for capacity
    // ["A","B","C","D","E", null]
    //                            size = 5 and capacity is 6
    // Java = ArrayList
    // C++ = Vector
    // Javascript = Array
    // Python = List
    // Static Array has capacity fixed, you can not change it.
    // ["A","B","C","D","E", null]. To access random data via indexes is a constant time O(1)
    // advantages: easy to add or remove at the end, random access elements via indexes O(1) and good locality of reference and data cache utilization
    // disadvantages: wastes more memory, shifting elements is time consuming O(N), expanding / shrinking the array is time consuming O(N)
    DynamicArrayImp dynamicArrayImp = new DynamicArrayImp();
    dynamicArrayImp.add("A");
    dynamicArrayImp.add("B");
    dynamicArrayImp.add("C");
    dynamicArrayImp.insert(0, "B");
    System.out.println(dynamicArrayImp);

  }
  //Creating my own DynamicArray, but I can use ArrayList that Java's to offer;
  public static class DynamicArrayImp {
      int size;
      int capacity = 10;
      Object[] array;
      public DynamicArrayImp(int capacity) {
        this.capacity = capacity;
        this.array = new Object[capacity];
      }
      public DynamicArrayImp() {
        this.array = new Object[capacity];
      }
      public void add(Object data) {
        if(size >= capacity) {
          grow();
        }
        array[size] = data;
        size++;
      }
      public void insert(int index, Object data) {
        if(size >= capacity) {
          grow();
        }
        for(int indexArray = size; indexArray > index; indexArray--) {
          array[indexArray] = array[indexArray - 1]; // shifting position to the right
        }
        array[index] = data;
        size++;
      }
      public void delete(Object data) {
        for(int i = 0; i < size; i++) {
          if(array[i] == data) {
            for(int j = 0; j < (size - i - 1); j++) {
              array[i + j] = array[i + j + 1];
            }
            array[i - 1] = null;
            size--;
            if(size <= (int) (capacity / 3)) {
              shrink();
            }
            break;
          }
        }
      }
      public int search(Object data) {
        for(int i = 0; i < size; i++) {
          if(array[i] == data) {
            return i;
          }
        }
        return -1;
      }
      private void grow() {
        int newCapacity = (int) (capacity * 2);
        Object[] newArray = new Object[newCapacity];
        for(int i =0; i<size; i++) {
          newArray[i] = array[i];
        }
        capacity = newCapacity;
        array = newArray;
      }
      private void shrink() {
        int newCapacity = (int) (capacity / 2);
        Object[] newArray = new Object[newCapacity];
        for(int i =0; i<size; i++) {
          newArray[i] = array[i];
        }
        capacity = newCapacity;
        array = newArray;
      }
      public boolean isEmpty() {
        return size == 0;
      }
      @Override
      public String toString() {
        String string = "";
        for(int i = 0; i < size; i++) {
          string += array[i] + ",";
        }
        if(string != "") {
          string = string.substring(0, string.length() - 1);
        } else {
          string = "[]";
        }
        return string;
      }
  }
}

