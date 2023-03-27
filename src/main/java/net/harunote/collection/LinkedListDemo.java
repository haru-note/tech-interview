package net.harunote.collection;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String args[]) {
		// 링크드 리스트를 생성.
		LinkedList<String> ll = new LinkedList<String>();
		
		// 링크드 리스트에 요소를 추가한다. 
		ll.add("F"); 
		ll.add("B"); 
		ll.add("D");
		ll.add("E"); 
		ll.add("C"); 
		ll.addLast("Z"); 
		ll.addFirst("A");
		
		ll.add(1, "A2"); 
		
		System.out.println("Original contents of ll: " + ll);
		
		// 링크드 리스트에서 요소를 삭제한다.
		ll.remove("F"); 
		ll.remove(2);
		
		System.out.println("Contents of ll after deletion: " + ll);
		
		// 첫 번째와 마지막 요소를 삭제한다. 
		ll.removeFirst(); 
		ll.removeLast(); 
		System.out.println("ll after deleting first and last: " + ll);
		
		// 값을 가져오고 값을 설정한다. 
		Object val = ll.get(2); 
		ll.set(2, (String) val + " Changed");
		
		System.out.println("ll after change: " + ll);	
	}
}