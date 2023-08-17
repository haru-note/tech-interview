package net.harunote.collection;

import java.util.ArrayList;
import java.util.List;


/**
 * @Author : CodeVillains
 * @Description :
 */
class ArrayListDemo {
	public static void main(String args[]) {

		// 배열 리스트를 만든다. 
		List<String> al = new ArrayList<>();
		System.out.println("Initial size of al: " + al.size());
		
		// 배열 리스트에 요소들을 추가한다. 
		al.add("C"); 
		al.add("A"); 
		al.add("E");
		al.add("B");
		al.add("D");
		al.add("F");
		al.add(1, "A2");  // index 1에 A2 값을 추가함 
		System.out.println("Size of al after additions: " + al.size());
		
		// 배열 리스트를 출력한다. 
		System.out.println("Contents of al: " + al);
		
		// 배열 리스트에서 요소들을 삭제한다. 
		al.remove("F"); 
		al.remove(2);
		
		System.out.println("Size of al after deletions: " + al.size());
		System.out.println("Contents of al: " + al);
	}
}