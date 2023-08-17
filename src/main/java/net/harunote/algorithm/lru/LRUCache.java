package net.harunote.algorithm.lru;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @Author : CodeVillains
 * @Description : 가장 오랫동안 사용되지 않은 엔트리(호출되지 않는)를 메모리의 후방에 위치하게 하여 메모리에서 삭제 하는 캐싱 알고리즘 LRU (최근사용우선) 와
 * 비슷한 알고리즘으로 LFU(Least Frequently Used : 참조 횟수 기준) 이 있다.
 */
public class LRUCache<K, V> {

    // 용량을 늘릴 때 참고할 값 (몇 프로일 때 용량을 늘릴것인가?)
    private static final float hashTableLoadFactor = 0.75f;
    // LinkedHashMap로 삽입순서를 유지면서 최근에 접근한 데이터가 가장 앞에 위치하도록 함
    private LinkedHashMap<K, V> map;

    // 캐시 사이즈
    private int cacheSize;

    public LRUCache(int cacheSize) {
        this.cacheSize = cacheSize;

        // LinkedHashMap의 초기 용량 (3 / 0.75) + 1 = 5로 설정
        int capacity = (int) Math.ceil(cacheSize / hashTableLoadFactor) + 1;

        // capacity는 생성할때 map의 크기를 얼마로 할 것인가가? loadFactor는 capacity의 몇 %가 차게되면 용량을 늘려야 할것인가
        // 마지막 불리언 값은 정렬을 삽입 순서(false)냐 접근 순서(true)냐에 대한 인자이다
        map = new LinkedHashMap<K, V>(capacity, hashTableLoadFactor, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
                return size() > LRUCache.this.cacheSize;
            }
        };
    }

    public synchronized V get(K key) {
        return map.get(key);
    }

    public synchronized void put(K key, V value) {
        map.put(key, value);
    }

    public synchronized void clear() {
        map.clear();
    }

    public synchronized int usedEntries() {
        return map.size();
    }

    public synchronized Collection<Map.Entry<K, V>> getAll() {
        return new ArrayList<>(map.entrySet());
    }
}
