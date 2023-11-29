package PriorityQueue;

import java.util.PriorityQueue;

public class Main {
    static{
        System.out.println("\n\t PriorityQueue is used whenever we want the priority element or the smallest element at the top in such cases priorityQueue is used .");
        System.out.println("\n\t Whenever numnbers are passed to the priorityQueue it will bring smallest numbers at the top .");
    }
    final public static void main(String args[]) {
        PriorityQueue pq=new PriorityQueue();

        pq.add("Vikram");
        pq.add("ram");
        pq.add("markiv");
        pq.add("mark");
        System.out.println("\n\t The priority queue : "+pq);

        
    }
    
}

// The priority queue : [Vikram, mark, markiv, ram]

