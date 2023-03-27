package net.harunote.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		// Key : 회원번호 , value : 이름 - map.put을 이용하여 데이터를 저장한다. 
		map.put(1, "홍길동이");
		map.put(2, "Samsig");
		map.put(3, "Harunote");
		map.put(100, "Kakao");

		System.out.println(map);
		System.out.println(map.get(100));

		// 값 찾기 (Key 혹은 Value) 존재하면 True
		System.out.println(map.containsKey(3));
		System.out.println(map.containsValue("Samsig"));

		
		// 키를 Set에 담기, Key는 Integer 로 정의 되어있다. 
		Set<Integer> keys = map.keySet();
		System.out.println(keys);

		
		// 값을 Collection에 담기, Value는 String으로 정의 되어있다. 
		Collection<String> values = map.values();
		System.out.println(values);

	}
}