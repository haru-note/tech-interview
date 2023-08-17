package net.harunote.collection.structure;

import java.util.NoSuchElementException;

/**
 * @Author : CodeVillains
 * @Description : 데이터를 순차적으로 저장하는 자료구조(브라우저 히스토리등). LIFO(Last In, First Out) 구조로 새로운 데이터는 스택의 최 상위에 위치하고 추출시 최상위 데이터를 가져올 수 있다
 * pop(추출)
 *  - 가장 최 상위에 위치한 자료를 추출한 후에 스택에서 제거한다. 이 작업은 O(1)의 복잡도를 가진다
 * push(삽입)
 *  - 스택의 최 상위에 새로운 자료를 삽입한다. 이 작업은 O(1)의 복잡도를 가진다
 * isEmpty
 *  - 스택이 empty 상태인지 확인한다
 * clear
 *  - 스택에 존재하는 모든 자료들을 삭제한다
 * peek
 *  - 가장 최 상위에 위치한 자료를 추출한다. pop 메소드와는 달리 스택에서 제거하지는 않는다.이 작업은 O(1)의 복잡도를 가진다
 */
public class StackExample {
    private int[] array;
    private int cursor = 0;

    public StackExample(int stackSize) {
        this.array = new int[stackSize];
    }

    public static void main(String[] args) {
        StackExample stack = new StackExample(4);

        stack.push(1);  // 저장
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
    }

    private int peek() {
        return array[cursor - 1];
    }

    private int pop() {
        if (cursor > 0) {
            return array[--cursor];
        } else {
            throw new NoSuchElementException();
        }
    }

    private void push(int i) {
        if (cursor < array.length) {
            array[cursor++] = i;
            System.out.println("push completed");
        } else {
            System.out.println("stack is full");
        }
    }
}
