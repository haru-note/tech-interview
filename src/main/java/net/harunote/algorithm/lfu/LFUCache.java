package net.harunote.algorithm.lfu;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.PriorityQueue;

class LFUCache<K, V> {
    private final int capacity;
    private final Map<K, V> cache;
    private final Map<K, Integer> frequency;
    // 우선순위 큐 (가장 낮은 값이 우선순위가 높다)
    private final PriorityQueue<Map.Entry<K, Integer>> minHeap;

    public LFUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new LinkedHashMap<>(capacity, 0.75f, true);
        this.frequency = new HashMap<>(capacity);
        // 우선순위 큐의 빈도수 비교 (갸장 낮은 빈도수를 가진 항목이 맨 위에 위치)
        this.minHeap = new PriorityQueue<>((e1, e2) -> e1.getValue() - e2.getValue());
    }

    public V get(K key) {
        // 빈도수 증가 처리
        if (cache.containsKey(key)) {
            int freq = frequency.get(key);
            frequency.put(key, freq + 1);
            return cache.get(key);
        }
        return null;
    }

    public void put(K key, V value) {
        if (capacity == 0) {
            return;
        }

        if (cache.size() >= capacity) {
            evictLFU();
        }

        cache.put(key, value);
        frequency.put(key, 1);
        // minHeap에 항목을 추가
        minHeap.offer(new AbstractMap.SimpleEntry<>(key, 1));
    }

    private void evictLFU() {
        // 가장 낮은 항목의 key 조회
        Map.Entry<K, Integer> entry = minHeap.poll();
        K lfuKey = entry.getKey();
        cache.remove(lfuKey);
        frequency.remove(lfuKey);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<K, V> entry : cache.entrySet()) {
            sb.append(entry.getKey()).append(": ").append(entry.getValue()).append(", ");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        LFUCache<Integer, String> cache = new LFUCache<>(3); // LFU 캐시 크기를 3으로 설정

        cache.put(1, "첫번째 항목");
        cache.put(2, "두번째 항목");
        cache.put(3, "세번째 항목");
        System.out.println("초기값 : " + cache);
        System.out.println("두번째 항목, 세번째 항목 호출 빈도 증가");
        cache.get(2);
        cache.get(3);
        cache.get(2);
        System.out.println("증가 후 값: " + cache);
        cache.put(4, "네번째 항목");
        System.out.println("네번째 삽입 후 값 : " + cache);
    }
}
