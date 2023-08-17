package net.harunote.collection.structure;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * @Author : CodeVillains
 * @Description : 큐의 양쪽에 삽입과 삭제가 모두 발생할 수 있는 큐로써 큐와 스택의 성질을 가지고 있는 자료 구조
 */
public class DequeExample {

    public static void main(String[] args) {
        Deque deque = new LinkedList<>();

        // We can add elements to the queue in various ways
        deque.add("Element 1 (Tail)"); // add to tail   // 4
        deque.addFirst("Element 2 (Head)");             // 3
        deque.addLast("Element 3 (Tail)");              // 5
        deque.push("Element 4 (Head)"); //add to head   // 2
        deque.offer("Element 5 (Tail)");                // 6
        deque.offerFirst("Element 6 (Head)");           // 1
        deque.offerLast("Element 7 (Tail)");            // 7

        deque.forEach((str) -> System.out.println(str));


        // Iterate through the queue elements.
        System.out.println("Standard Iterator");
        Iterator iterator = deque.iterator();
        while (iterator.hasNext())
            System.out.println("\t" + iterator.next());


        Iterator reverse = deque.descendingIterator();
        System.out.println("Reverse Iterator");
        while (reverse.hasNext())
            System.out.println("\t" + reverse.next());

        // Peek returns the head, without deleting
        // it from the deque
        System.out.println("Peek " + deque.peek());
        System.out.println("After peek: " + deque);

        // Pop returns the head, and removes it from
        // the deque
        System.out.println("Pop " + deque.pop());
        System.out.println("After pop: " + deque);

        // We can check if a specific element exists
        // in the deque
        System.out.println("Contains element 3: " +
                deque.contains("Element 3 (Tail)"));

        // We can remove the first / last element.
        deque.removeFirst();
        deque.removeLast();
        System.out.println("Deque after removing " +
                "first and last: " + deque);

    }
}
