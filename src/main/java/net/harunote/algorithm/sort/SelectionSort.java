package net.harunote.algorithm.sort;

import java.util.Arrays;

/**
 * @Author : CodeVillains
 * @Description : 구현하기 쉬움 주어진 리스트에서 최소값을 찾아 맨 앞에 위치값과 비교하여 교체한다. 목록의 각 위치에 대해서 이러한 과정을 계속한다.
 * Performance :  O(n^2)
 */
public class SelectionSort {

    public static void main(String[] args) {
        final int[] numbers = {11, 2, 6, 3, 9, 8};

        System.out.println("Result = " + Arrays.toString(selectSort(numbers)));

    }

    private static int[] selectSort(int[] numbers) {

        // 전체 요소를 순회 한다. 마지막 공간은 자동으로 위치 교환을 통해 정렬된다.
        for (int index = 0; index < numbers.length - 1; index++) {
            int min = index;

            // 다음 요소를 현재요소와 비교한다. 다음요소가 현재의 요소바다 작을 경우 요소의 인덱스를 바꿔준다.
            for (int scan = index + 1; scan < numbers.length; scan++) {
                if (numbers[scan] < numbers[min]) {     // 2 가 11보다 작으니
                    min = scan;                         // 작은 인덱스를 min에 할당 0 = 1;
                }
            }

            int smaller = numbers[min];                 // 1번째 공간값인 2가 가장 작은값이므로 smaller 에 저장
            numbers[min] = numbers[index];              // 1번째 공간에 0번째 값을 할당
            numbers[index] = smaller;                   // 0번째 공간에 가장 작은값을 할당

        }

        return numbers;
    }


}
