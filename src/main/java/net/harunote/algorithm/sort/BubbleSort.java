package net.harunote.algorithm.sort;

import java.util.Arrays;

/**
 * @Author : CodeVillains
 * @Description : 구성 요소를 순회하면서 인접한 요소간의 값을 비교하여 정렬. 뒤에 값이 작으면 앞으로 위치를 바꿔줘야 하기 때문에 가변 공간이 하나 필요하다.
 * Performance : 비효율적이다. 최악의 경우 역순으로 정렬하려고 할 때 O(n^2)가 나오고 최선은 리스트가 이미 정렬이 되어있을 경우 O(N)의 성능이 나온다.
 */
public class BubbleSort {

    public static void main(String[] args) {
        final int[] numbers = {4, 7, 1, 2, 5, 8, 6};

        System.out.println("Result = " + Arrays.toString(bubbleSort(numbers)));
    }

    private static int[] bubbleSort(int[] numbers) {
        boolean switched;
        do {
            switched = false;
            for (int i = 0; i < numbers.length - 1; i++) {
                // 첫번째 원소와 현재 원소를 비교해서 현재 원소보다 작으면 swap
                if (numbers[i + 1] < numbers[i]) {  // 뒤에 값이 현재 값보다 작을 경우 위치를 바꿔준다.
                    int temp = numbers[i + 1];  // 기준값을 위한 임시 공간이 필요
                    numbers[i + 1] = numbers[i];
                    numbers[i] = temp;
                    switched = true;
                }
            }

        } while (switched);
        return numbers;
    }
}
