package net.harunote.algorithm.lru;

import java.util.Collection;
import java.util.Map;

public class TestLRUCache {

    public static void main(String[] args) {
        // LRU 캐시 객체 생성 (캐시 크기: 3)
        LRUCache<Integer, String> lruCache = new LRUCache<Integer, String>(3);

        // 데이터 추가
        lruCache.put(1, "One");
        lruCache.put(2, "Two");
        lruCache.put(3, "Three");
        lruCache.put(4, "Four");

        // 데이터 조회
        System.out.println("key 1: " + lruCache.get(1));
        System.out.println("key 2: " + lruCache.get(2));

        // 현재 캐시에 저장된 데이터 개수
        System.out.println("entries: " + lruCache.usedEntries());

        // 캐시에 저장된 모든 데이터 출력
        Collection<Map.Entry<Integer, String>> allData = lruCache.getAll();
        System.out.println("All data in cache:");
        for (Map.Entry<Integer, String> entry : allData) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        lruCache.clear();
        System.out.println("clearing cache: " + lruCache.usedEntries());
    }
}