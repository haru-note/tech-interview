package net.harunote.collection;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String args[]) {
		// 해시 맵을 만든다. 
		Map<String, Double> tm = new TreeMap<String, Double>();
		// 맵에 요소들을 넣는다. 
		tm.put("홍길동이", new Double(1240.34)); 
		tm.put("김영순이", new Double(223.39)); 
		tm.put("퀵군", new Double(1378.00)); 
		tm.put("글라이더님", new Double(9999.55)); 
		tm.put("존 도", new Double(-122.08));
		tm.put("한효주님", null);
		
		// 맵 엔트리의 콜렉션 집합을 가져온다. 
		Set<?> set = tm.entrySet();
		
		// 반복자를 얻는다. 
		Iterator<?> i = set.iterator();
		
		// 요소들을 출력한다. 
		while(i.hasNext()) {
			Map.Entry me = (Map.Entry)i.next();
			System.out.print(me.getKey() + ": ");
			System.out.println(me.getValue());
		} 
		
		// 존 도의 계좌에 1000을 예금한다. 
		double bonus = tm.get("존 도").doubleValue(); 
		tm.put("존 도", new Double(bonus + 1000)); 
		System.out.println("존 도's new deposit: " + tm.get("존 도"));
		
	}
}