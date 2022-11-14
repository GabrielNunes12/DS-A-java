package org.example.Queues;

import java.util.LinkedList;

public class Queue {
  public static void main(String[] args) {
    // Queue it is a FIFO data structure (First in first out)
    // Collection designed for holding elements prior to processing.
    // Linear data structure
    // add element to a queue is -> enqueue() or offer()
    // to remove element from a queue is -> dequeue(); or poll();
    // to examine only the first element in our queue the peek() method do it for us.
    java.util.Queue<String> queue = new LinkedList<String>();
    queue.offer("Karen");
    queue.offer("Joseph");
    queue.offer("Paul");
    System.out.println(queue); // [Karen, Joseph, Paul]
    //Dequeueing
    queue.poll();
    queue.poll();
    System.out.println(queue); //[Paul]
    System.out.println(queue.peek());//[Paul]
    //Checking if a queue is empty
    System.out.println(queue.isEmpty());
    //Checking the size of this queue
    System.out.println(queue.size());
    //Contains method to retrieve that data from our queue
    System.out.println(queue.contains("Paul"));

    //What are Queues useful?
    // 1 - Keyboard buffer (Letters should appear on screen in the order they're pressed)
    // 2 - Printer queue (Print jobs should be completed in order)
    // 3 - used in LinkedList, PriorityQueues, Breadth-first search
  }
}
