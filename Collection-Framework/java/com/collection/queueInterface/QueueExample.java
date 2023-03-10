package com.collection.queueInterface;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueExample {
    public static void main(String[] args) {


        //internal data structure is FIFO (First in first Out)
        // add objects in queue in last
        // obj remove in first
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();


        priorityQueue.add("a");
        priorityQueue.add("b");

        // print
        System.out.println(priorityQueue);

        // access element head element
        System.out.println(priorityQueue.element());
        System.out.println(priorityQueue.peek());

        // iterator() available
        Iterator iterator = priorityQueue.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

        // remove collection
        priorityQueue.remove();

        // poll()
        System.out.println(priorityQueue.poll());
    }
}
