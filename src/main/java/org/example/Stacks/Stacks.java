package org.example.Stacks;

import java.util.Stack;

public class Stacks {
  public static void main(String[] args) {
    //Stacks is similar to array in Javascript
    // Stacks are LIFO (Last in first out) and stores data sort of "Vertical tower"
    Stack<String> games = new Stack<>();
    // .empty() -> check if the stack is empty
    games.empty();
    //.push(Object object) -> is to add a new object to the list (LIFO) - last in first out
    games.push("WWE");
    games.push("Burnout paradise");
    games.push("Batman Arkham asylum");
    //.pop() -> to remove the last element in the stack
    String removedGame = games.pop();
    System.out.println(removedGame);
    //.peek() -> retrieve the top object in our stack -> in that case will be 'burnout paradise'
    String game = games.peek();
    System.out.println(game);
    //.search(Object object) -> will search for a value, *BUT* if not found a object will give -1 response
    games.search("Burnout paradise");
    System.out.println(games);
  }
}
