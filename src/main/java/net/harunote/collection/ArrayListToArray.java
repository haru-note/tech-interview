package net.harunote.collection;

import java.util.ArrayList;
import java.util.List;

class ArrayListToArray {
	public static void main(String args[]) {

		// 배열 리스트를 만든다. 
		List<Integer> al = new ArrayList<>();
		// 배열 리스트에 요소를 추가한다. 
		al.add(new Integer(1)); 
		al.add(new Integer(2));
		al.add(new Integer(3)); 
		al.add(new Integer(4));
		System.out.println("Contents of al: " + al); 
		
		// 배열을 얻는다. 
		Object ia[] = al.toArray(); 
		int sum=0;
		
		// 배열 요소들의 합계를 구한다. 
		for(int i=0; i<ia.length; i++){
			sum += ((Integer) ia[i]).intValue();
		}			
		
		System.out.println("Sum is: " + sum);
	}
}