package org.example.LinkedList;

import java.util.*;

public class LinkedLisT {
  public static void main(String[] args) {
    //LinkedList in Java can be treated as Stack or Queue
    //linked list is awesome to insert and deletion of values O(1)
    // but there's a catch to add a new node, LinkedList has to traverse the entire linkedlist
    // however Arrays or List doesn't know about the index to add a value
    //to add a new value linkedlist has a method called add( index, value );
    // to remove a value of a node LinkedList has a method called remove(Object object);
    // indexOf(); -> to retrieve only the object's index
    /*
    * Elements are linked using pointers
    *                     SINGLY linked list
    *      Node                  Node              Node
    *  [data | address] -> [data | address] -> [data | address]
    *
    *                     Doubly linked list
    *            Node                            Node                          Node
    * [address | data | address] <-> [address | data | address] <-> [address | data | address]
    * advantages ?
    *  1. Dynamic data structures (allocates needed memory while running (run-time))
    *  2. Insertion and deletion of nodes is easy
    *  3. no/low memory waste
    *  Disadvantages ?
    * 1. Greater memory usage (additional pointer)
    * 2. no random access of elements (by using index[i])
    * 3. Accessing / searching for a element is more time consuming. O(N)
    *
    * Uses?
    *  1. Implement stack / queue
    *  2. GPS navigation
    *  3. Music playlist
    * */
    LinkedList<String> linkedList = new LinkedList<>();
    //stack
    linkedList.push("A");
    linkedList.push("B");
    linkedList.push("C");
    linkedList.push("D");
    linkedList.push("F");
    System.out.println(linkedList); // F to A
    linkedList.pop();
    //Queue
    LinkedList<String> linkedList2 = new LinkedList<>();
    linkedList2.offer("A");
    linkedList2.offer("B");
    linkedList2.offer("C");
    linkedList2.offer("D");
    linkedList2.offer("F");
    System.out.println(linkedList2); // A to F
    linkedList2.poll();
    //adding values
    linkedList.offer("AAA");
    linkedList.offer("BBB");
    linkedList.offer("CCC");
    linkedList.offer("DDD");
    linkedList.offer("FFF");
    linkedList.add(3, "JJJ");
    System.out.println(linkedList);//[FFF, DDD, CCC, JJJ, BBB, AAA]
    System.out.println(linkedList.indexOf("FFF")); //[0]
    //peeking the head of the list
    System.out.println(linkedList.peekFirst());
    //peeking the tail of the list
    System.out.println(linkedList.peekLast());
    //adding element to the head
    linkedList2.addFirst("0");
    //adding element to the tail
    linkedList2.addLast("G");
    // retrieving the first data from our linkedlist
    String firstElement = linkedList2.removeFirst();
    //retrieving the last data from our linkedList
    String lastElement = linkedList2.removeLast();
    System.out.println(firstElement);
    System.out.println(lastElement);
  }
}
