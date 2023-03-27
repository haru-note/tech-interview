package net.harunote.collection;

import java.util.HashSet;
import java.util.Set;

//HashSet을 설명한다. 

public class HashSetDemo {

	public static void main(String args[]) {
		// 해시 집합을 생성한다.
		Set<String> hs = new HashSet<>();
		// 해시 집합에 요소를 추가한다. 
		hs.add("B"); 
		hs.add("A"); 
		hs.add("D");
		hs.add("E"); 
		hs.add("C"); 
		hs.add("F");
		hs.toString();
		
		System.out.println(hs);
	}
}