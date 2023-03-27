package net.harunote.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String args[]) {
		// 해시 맵을 만든다. 
		Map<String, Double> hm = new HashMap<String, Double>();
		// 맵에 요소들을 넣는다. 
		hm.put("홍길동이", new Double(1240.34)); 
		hm.put("김영순이", new Double(223.39)); 
		hm.put("퀵군", new Double(1378.00)); 
		hm.put("글라이더님", new Double(9999.55)); 
		hm.put("존 도", new Double(-122.08));
		hm.put("한효주님", null);
		
		// 맵 엔트리의 콜렉션 집합을 가져온다. 
		Set<?> set = hm.entrySet();
		
		// 반복자를 얻는다. 
		Iterator<?> i = set.iterator();
		
		// 요소들을 출력한다. 
		while(i.hasNext()) {
			Map.Entry me = (Map.Entry)i.next();
			System.out.print(me.getKey() + ": ");
			System.out.println(me.getValue());
		} 
		
		// 존 도의 계좌에 1000을 예금한다. 
		double bonus = hm.get("존 도").doubleValue(); 
		hm.put("존 도", new Double(bonus + 1000)); 
		System.out.println("존 도's new deposit: " + hm.get("존 도"));
		
	}
}