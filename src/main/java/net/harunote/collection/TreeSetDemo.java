package net.harunote.collection;

import java.util.Set;
import java.util.TreeSet;


/**
 * @Author : CodeVillains
 * @Description :
 */
public class TreeSetDemo {
	public static void main(String[] args) {
		// 트리 집합을 만든다. 
		Set<String> ts = new TreeSet<String>();
		// 트리 집합에 요소들을 추가한다. 
		ts.add("C"); 
		ts.add("A"); 
		ts.add("B");
		ts.add("E"); 
		ts.add("F"); 
		ts.add("D");
		System.out.println(ts);
	}
}