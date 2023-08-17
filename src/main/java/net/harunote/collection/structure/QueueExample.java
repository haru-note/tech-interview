package net.harunote.collection.structure;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;


/**
 * @Author : CodeVillains
 * @Description : FIFO 형태의 자료 구조(프린터 출력 등) , 배열이나 리스트 링크드 리스트 등을 통해 구현할 수 있다.
 * 연결 리스트를 이용하여 큐를 구현할 경우 데이터가 저장될 큐의 크기를 미리 지정하지 않아도 되며 배열처럼 front 보다 작은 인덱스 공간(삭제한 공간)을 낭비하지 않아도 된다는 장점을 가지고 있다.
 * 삽입 - insert, 삭제(추출) - remove,  읽기 -
 * Peek Enqueue(삽입) - 큐(Queue)의 끝에 새로운 자료를 삽입한다. 이 작업은 O(1)의 복잡도를 가진다
 * Dequeue(제거) - 큐(Queue)의 가장 첫 위치에 존재하는 자료를 반환하고 제거한다. 이 작업은 O(1)의 복잡도를 가진다 Peek - 큐(Queue)의 처음에 존재하는 자료를 반환한다. Dequeue 메소드와는 달리, 처음에 존재하는 자료를 제거하지는 않는다.
 * isEmpty - 큐(Queue) 가 Empty 상태인지 확인한다. clear - 큐(Queue) 내부의 모든 자료들을 삭제한다.
 */
public class QueueExample {

    private List<Integer> queue = new ArrayList<>();

    public void enqueue(Integer data) {
        queue.add(data);
    }

    public Integer dequeue() {
        if (queue.isEmpty()) {
            System.out.println("Queue is Empty");
            throw new NoSuchElementException();
        }

        return queue.remove(0);
    }

    public Boolean isEmpty() {
        return queue.isEmpty();
    }

    public Integer peek() {
        return queue.get(0);
    }

    public static void main(String[] args) {
        QueueExample queue = new QueueExample();
        queue.enqueue(2);
        queue.enqueue(1);
        queue.enqueue(3);
        queue.enqueue(4);
        System.out.println("Queue peek = " + queue.peek());
        remove(queue);

        queue.enqueue(7);
        queue.enqueue(8);
        queue.enqueue(9);
        queue.dequeue();
        remove(queue);

    }

    private static void remove(QueueExample queue) {
        while (!queue.isEmpty()) {
            System.out.println("Element : " + queue.dequeue());
        }
    }
}
