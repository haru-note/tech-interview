package net.harunote.algorithm.lru;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @Author : CodeVillains
 * @Description : 가장 오랫동안 사용되지 않은 엔트리(호출되지 않는)를 메모리의 후방에 위치하게 하여 메모리에서 삭제 하는 캐싱 알고리즘 LRU (최근사용우선) 와
 * 비슷한 알고리즘으로 LFU(Least Frequently Used : 참조 횟수 기준) 이 있다.
 */

public class LRUCache<K, V> extends LinkedHashMap<K, V> {
    private int cacheSize;

    // cacheSize는 생성할때 map의 크기를 얼마로 할 것인가가? loadFactor는 capacity의 몇 %가 차게되면 용량을 늘려야 할것인가
    // 마지막 불리언 값은 정렬을 삽입 순서(false)냐 접근 순서(true)냐에 대한 인자이다
    public LRUCache(int cacheSize) {
        super(cacheSize, 0.75f, true);
        this.cacheSize = cacheSize;
    }

    // 현재 맵의 크기보다 크면 true 리턴하고 first 노드를 찾아서 삭제함.
    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > cacheSize;
    }

    public static void main(String[] args) {
        LRUCache<Integer, String> cache = new LRUCache<>(3); // LRU 캐시 크기를 3으로 설정

        cache.put(1, "첫번째 항목");
        System.out.println(cache);

        cache.put(2, "두번째 항목");
        System.out.println(cache);
        cache.put(3, "세번째 항목");

        System.out.println(cache); // 출력: {1=첫번째 항목, 2=두번째 항목, 3=세번째 항목}

        cache.get(2); // 요소 2에 액세스하여 가장 최근 사용 위치로 이동 변경

        System.out.println(cache); // 출력: {1=첫번째 항목, 3=세번째 항목, 2=두번째 항목}

        cache.put(4, "네번째 항목"); // 용량 초과로 인해 LRU 항목의 first 노드 제거

        System.out.println(cache); // 출력: {1=첫번째 항목, 3=세번째 항목, 2=두번째 항목}
    }

}
