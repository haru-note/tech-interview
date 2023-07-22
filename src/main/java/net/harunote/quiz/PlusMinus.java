package net.harunote.quiz;

/**
 * @Author : CodeVillains
 * @Description : 주어진 배열의 음수, 양수, 0의 갯수를 파악하여 비율로 표시하라. 단, 소수점 6자리까지 표현한다.
 */
public class PlusMinus {

    public static void main(String[] args) {
        int[] numbers = {-4, 3, -9, 0, 4, 1};

        float[] items = itemCount(numbers, numbers.length);

        // 소수점 아래 6자리까지 출력
        System.out.printf("%.6f\n", items[0]);
        System.out.printf("%.6f\n", items[1]);
        System.out.printf("%.6f\n", items[2]);
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
}
