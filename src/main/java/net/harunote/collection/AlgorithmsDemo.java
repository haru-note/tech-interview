package net.harunote.collection;

import java.util.*;

public class AlgorithmsDemo {

	public static void main(String args[]) {

		// 링크드 리스트를 만들고 초기화한다.
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(new Integer(-8));
		ll.add(new Integer(20));
		ll.add(new Integer(-20));
		ll.add(new Integer(8));

		// 역순의 비교자를 생성.
		Comparator<Integer> r = Collections.reverseOrder();

		// 비교자를 사용해서 리스트를 정렬한다.
		Collections.sort(ll, r);

		// 반복자를 얻는다.
		Iterator<Integer> li = ll.iterator();

		System.out.print("List sorted in reverse: ");
		while (li.hasNext()) {
			System.out.print(li.next() + " ");
		}

		System.out.println();

		Collections.shuffle(ll);

		// 임의의 리스트를 표시한다.
		li = ll.iterator();
		System.out.print("List shuffled: ");

		while (li.hasNext()) {
			System.out.print(li.next() + " ");
		}
		System.out.println();

		System.out.println("Minimum: " + Collections.min(ll));
		System.out.println("Maximum: " + Collections.max(ll));

	}
}