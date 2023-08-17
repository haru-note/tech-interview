package net.harunote.collection.structure;

import java.util.PriorityQueue;

/**
 * @Author : CodeVillains
 * @Description : 우선 순위 큐
 */
public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        // enqueue
        priorityQueue.add(3);
        priorityQueue.add(1);
        priorityQueue.add(2);
        // dequeue
        int element = priorityQueue.poll();

        System.out.println(element); // 출력: 1 (우선순위가 가장 높은 값이 먼저 꺼내짐)
        priorityQueue.peek();
        printQueue(priorityQueue);

        priorityQueue.add(5);
        priorityQueue.add(4);
        priorityQueue.add(3);

        if (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
            printQueue(priorityQueue);
        }
    }

    private static void printQueue(PriorityQueue<Integer> priorityQueue) {
        while (!priorityQueue.isEmpty()) {
            System.out.println("priorityQueue : " + priorityQueue.poll());
        }
    }
}