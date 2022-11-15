package org.example.PriorityQueue;

import java.util.Queue;

public class PriorityQueue {
  public static void main(String[] args) {
    //Priority queue -> FIFO data structure that serves elements with the highest
    //                  priorities first before elements with lower priority
    // serves first the highest priority to lowest (example: ASC order)
    Queue<Double> alumniGPAs = new java.util.PriorityQueue<Double>();
    alumniGPAs.offer(40.00);
    alumniGPAs.offer(2.00);
    alumniGPAs.offer(3.00);
    alumniGPAs.offer(1.00);
    while(!alumniGPAs.isEmpty()) {
      System.out.println(alumniGPAs.poll()); // 1.0 to 40.00
    }

    Queue<String> alphabetical = new java.util.PriorityQueue<String>();
    alphabetical.offer("F");
    alphabetical.offer("V");
    alphabetical.offer("B");
    alphabetical.offer("C");
    while(!alphabetical.isEmpty()) {
      System.out.println(alphabetical.poll()); // B to V
    }
  }
}
