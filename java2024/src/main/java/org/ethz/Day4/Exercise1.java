package org.ethz.Day4;
import java.util.LinkedList;
import java.util.Iterator;
public class Exercise1 {
    public static void main(String[] args) {
        // Create a LinkedList and add 5 million integers
        LinkedList<Integer> linkedList = new LinkedList<>();
        int numberOfElements = 5_000_000;
        
        // Populate the list
        System.out.println("Adding elements to the LinkedList...");
        for (int i = 0; i < numberOfElements; i++) {
            linkedList.add(i);
        }

        // Measure time for Iterator traversal
        System.out.println("Traversing using Iterator...");
        long startTimeIterator = System.nanoTime();
        Iterator<Integer> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            iterator.next();
        }
        long endTimeIterator = System.nanoTime();
        long durationIterator = (endTimeIterator - startTimeIterator) / 1_000_000; // convert to milliseconds
        System.out.println("Time taken for Iterator traversal: " + durationIterator + " ms");

        // Measure time for get(index) traversal
        System.out.println("Traversing using get(index)...");
        long startTimeGet = System.nanoTime();
        for (int i = 0; i < numberOfElements; i++) {
            linkedList.get(i);
        }
        long endTimeGet = System.nanoTime();
        long durationGet = (endTimeGet - startTimeGet) / 1_000_000; // convert to milliseconds
        System.out.println("Time taken for get(index) traversal: " + durationGet + " ms");
    }
}
