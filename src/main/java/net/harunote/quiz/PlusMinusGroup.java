package net.harunote.quiz;

import java.util.Arrays;

/**
 * @Author : CodeVillains
 * @Description : 주어진 배열의 음수, 양수, 0의 갯수를 파악하여 비율로 표시하라. 단, 소수점 6자리까지 표현한다.
 */
public class PlusMinusGroup {

    public static void main(String[] args) {
        int[] numbers = {-12, 33, -4, 0, 0, 9, 1, -2, 11, 0 };

        float[] items = itemCount(numbers, numbers.length);
        // Arrays.stream 이용시
        // float[] items = itemCount(numbers);

        // 소수점 아래 6자리까지 출력
        System.out.printf("positive : %.6f\n", items[0]);
        System.out.printf("negatives : %.6f\n", items[1]);
        System.out.printf("zero : %.6f\n", items[2]);
    }

    private static float[] itemCount(int[] numbers, int length) {
        int positives = 0;
        int negatives = 0;
        int zeros = 0;

        for (int i = 0; i < length; i++) {
            if (numbers[i] > 0) {
                positives++;
            } else if (numbers[i] < 0) {
                negatives++;
            } else {
                zeros++;
            }
        }

        float point = (float) length;
        float positive = positives / point;
        float negative = negatives / point;
        float zero = zeros / point;

        float[] results = {positive, negative, zero};
        return results;
    }

    private static float[] itemCount(int[] numbers) {
        long positives = Arrays.stream(numbers).filter(num -> num > 0).count();
        long negatives = Arrays.stream(numbers).filter(num -> num < 0).count();
        long zeros = Arrays.stream(numbers).filter(num -> num == 0).count();

        float point = (float) numbers.length;
        float positive = positives / point;
        float negative = negatives / point;
        float zero = zeros / point;

        float[] results = {positive, negative, zero};
        return results;
    }

}
