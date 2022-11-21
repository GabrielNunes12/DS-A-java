package org.example.Recursion;

public class Recursion {
  public static void main(String[] args) {
    // recursion -> when a thing is defined in terms of itself. - WIKIPEDIA
    //              Apply the result of a procedure, to a procedure.
    //              A recursive method calls itself. Can be a substitute for iteration.
    //              Divide a problem into sub-problems of the same type as the original.
    //              commonly used with advanced sorting algorithms and navigating trees.
    // example:
    //  private void callFun() {
    //    callFun();
    //  }
    //advantages:
    //  easier to read, write
    //  easier to debug
    //disadvantages:
    //  Sometimes slower -> adding more frames to a callstack (LIFO data structure)
    //  uses more memory
    walk(5);
    walkRecursion(5);
    factorial(7);
  }

  private static int factorial(int num) {
    if(num < 1) return 1;
    return num * factorial(num - 1);
  }

  private static void walkRecursion(int steps) {
    //base case (if you want to stop this recursion)
    if(steps < 1) return;
    System.out.println("You take a step");
    walkRecursion(steps - 1); //recursive case
  }

  private static void walk(int steps) {
    for(int i = 0; i < steps; i++) {
      System.out.println("I'd walk: " + i + " steps");
    }
  }
}
