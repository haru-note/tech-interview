package net.harunote.algorithm.complexity;

import java.util.Random;

public class ComplexityTest {
    public static void main(String[] args) {
        int[] arr = new int[10000000]; // 큰 배열 생성
        int target = 9999999; // 검색할 요소 (배열의 마지막 요소)

        // 배열에 무작위 데이터 채우기
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10000000); // 0부터 9999999 사이의 무작위 값
        }

        // 이진 검색 수행 및 실행 시간 측정
        long startTime = System.currentTimeMillis();
        int result1 = binarySearch(arr, target);
        long endTime = System.currentTimeMillis();
        long binarySearchTime = endTime - startTime;

        // 선형 검색 수행 및 실행 시간 측정
        startTime = System.currentTimeMillis();
        int result2 = linearSearch(arr, target);
        endTime = System.currentTimeMillis();
        long linearSearchTime = endTime - startTime;

        // 결과 출력
        System.out.println("이진 검색 결과: " + result1);
        System.out.println("이진 검색 실행 시간: " + binarySearchTime + " 밀리초");

        System.out.println("선형 검색 결과: " + result2);
        System.out.println("선형 검색 실행 시간: " + linearSearchTime + " 밀리초");
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
