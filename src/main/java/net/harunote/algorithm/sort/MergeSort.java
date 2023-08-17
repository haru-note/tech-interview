package net.harunote.algorithm.sort;

import java.util.Arrays;

/**
 * @Author : CodeVillains
 * @Description : 병합정렬 (Divide & Conquer) : 안정적인 정렬 주워진 배열을 두 부분씩 나누워 정렬한 후 하나로 합치는 방식 두 번의 재귀 호출과 한
 * 번의 합병으로 구성되며 재귀 호출 시 배열 크기가 절반으로 줄어 들어 깊이가  log n 으로 된다. 즉, 두 배열의 합은 두 배열의 크기의 합에 비례 함으로 전체 수행 시간
 * 복잡도는 최악, 최선, 평균 모두 O(n log n). 분할정복 방식의 알고리즘의 한 종류 (1/2 씩 분할)… Performance : O(n log n)
 */
public class MergeSort {

    public static void main(String[] args) {
        Integer[] a = {2, 6, 3, 5, 1};
        mergeSort(a);
        System.out.println(Arrays.toString(a));
    }

    private static Comparable[] mergeSort(Comparable[] list) {
        // 리스트가 1 이하이면 연산할 필요 없음
        if (list.length <= 1) {
            return list;
        }

        // 리스트를 반으로 나누어 두 부분으로 분리
        Comparable[] first = new Comparable[list.length / 2];  // 5 일 경우 2.5 (2)
        Comparable[] second = new Comparable[list.length - first.length];  // 5 - 2 : 3개의 배열 요소를 처리

        // 배열에서 원하는 요소를 부분을 복사한다.
        // 원본, 원본 시작점, 복사본, 복사본 시작점, 길이
        System.arraycopy(list, 0, first, 0, first.length);  // 첫 파트 배열 카피   list, 0, first, 0, 2
        System.arraycopy(list, first.length, second, 0,
            second.length); // 두번째 파트 배열 카피  list, 2, second, 0, 3

        // 재귀 호출로 각 요소를 분리한다.(첫 번째 배열 분해 후 두번째 배열 분해)
        mergeSort(first);
        mergeSort(second);

        // 각 배열을 병합하여 원래 배열을 덮어쓴다.
        merged(first, second, list);

        return list;
    }

    private static void merged(Comparable[] first, Comparable[] second, Comparable[] result) {
        // 첫번째 배열의 인덱스 위치 - 첫 요소 부터 시작
        int firstIndex = 0;

        // 두번째 배열의 인덱스 위치 - 첫 요소 부터 시작
        int secondIndex = 0;

        // 병합된 배의 인덱스 위치 - 첫번째 위치부터 시작
        int merged = 0;

        // 첫 배열의 요소와 두번째 배열의 요소를 비교함
        // 그 중 작은 요소를 배열병합에 저장
        while (firstIndex < first.length && secondIndex < second.length) {
            System.out.println(
                "first[firstIndex] : " + first[firstIndex] + " second[secondIndex] : "
                    + second[secondIndex] + " result = " +
                    first[firstIndex].compareTo(second[secondIndex]));

            if (first[firstIndex].compareTo(second[secondIndex]) < 0) {
                result[merged] = first[firstIndex];
                firstIndex++;
            } else {
                result[merged] = second[secondIndex];
                secondIndex++;
            }
            merged++;
        }

        System.arraycopy(first, firstIndex, result, merged, first.length - firstIndex);
        System.arraycopy(second, secondIndex, result, merged, second.length - secondIndex);
    }
}
