package org.example.HashTables;

import java.util.Hashtable;

public class HashTables {
  public static void main(String[] args) {
    /*
    * Hashtables -> a data structure that stores keys to values ex.<String, String>
                      Each key / value pairs is know as entry
    *                 FAST insertion, look up, deletion of key/value pairs
    *                 NOT ideal for small data sets, but it is GREAT with large data sets
    *
    * hashing -> takes a key and computes an integer (formula will vary based on key & data type)
    *            in a hashtable, we use the hash % capacity to calculate an index number
    *           key.hashCode() % capacity = index
    *
    * bucket -> an indexed storage location for one or more Entries
    *           can store multiple Entries in case of a collision (linked similarly a linkedlist)
    *
    * collisions -> hash function generates the same index for more than one key less collisions = more efficiency
    *
    * Run time complexity => Best case O(1)
    *                         Worst case O(n)
    * */
    Hashtable<Integer, String> hashtables = new Hashtable<>(10);
    hashtables.put(100, "spongebob");
    hashtables.put(201, "squidwards");
    hashtables.put(122, "seagal");
    for(Integer key : hashtables.keySet()) {
      System.out.println(key.hashCode() % 10 + "\t" + key + "\t" + hashtables.get(key));
    }
    Hashtable<String, String> hashtablesString = new Hashtable<>(10);
    hashtablesString.put("100", "spongebob");
    hashtablesString.put("201", "squidwards");
    hashtablesString.put("122", "seagal");
    for(String key : hashtablesString.keySet()) {
      System.out.println(key.hashCode() + "\t" + key + "\t" + hashtablesString.get(key));
    }
  }
}
