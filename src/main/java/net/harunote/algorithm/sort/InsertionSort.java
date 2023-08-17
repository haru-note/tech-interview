package net.harunote.algorithm.sort;

import java.util.Arrays;

/**
 * @Author : CodeVillains
 * @Description : 삽입 정렬, 배열의 모든 요소를 앞에서부터 차례대로 이미 정렬된 배열 부분과 비교하여, 자신의 위치를 찾아 삽입함. 대상을 기준값의 왼쪽 요소부터
 * 비교해서 기준값의 크기가 비교값보다 작을 경우 두개의 위치를 바꿔주고 기준값을 저장한다. (반복하면서 정렬) performance : O(n^2)
 */
public class InsertionSort {

    public static void main(String[] args) {
        int[] numbers = {9, 10, 2, 6, 8};

        for (int i = 1; i < numbers.length; i++) {
            int standard = numbers[i]; // 기준값 (제일 처음 비교시 1번째 방이 기준점으로 왼쪽을 비교, 최초값은 10

            int compare = i - 1;    // 비교대상 (기준값의 왼쪽 요소를 비교), 최초값은 0

            // 비교대상이 0보다 크고 기준값이 비교 대상보다 작을 경우 swap
            while (compare >= 0 && standard < numbers[compare]) {   // 0 >= 0 && 10 < 9
                numbers[compare + 1] = numbers[compare];  // 비교 대상을 오른쪽으로 밀어냄
                compare--; // -1이 되면 조건밖으로 이동
            }

            numbers[compare + 1] = standard; // 기준값을 저장한다. 최초에는 조건이 맞지 않으므로 정렬하지 못함
        }

        System.out.print("result = ");
        System.out.println(Arrays.toString(numbers));
    }
}
