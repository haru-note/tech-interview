package net.harunote.quiz.calculation;

import java.util.Arrays;

/**
 * @Author : CodeVillains
 * @Description : 주어진 파라미터의 평균값 구하는 알고리즘
 */
public class Average {
    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);
        int[] params = {2, 3, 6, 8};

        Average average = new Average();
        System.out.println("평균값 : " + average.calAverage(params));
    }

    public int calAverage(int[] params) {
        // basic type
        /*
        int sum = 0;
        int totalSize = params.length;
        if (totalSize < 1) {
            return 0;
        }

        for (int i = 0; i < totalSize; i++) {
            sum += params[i];
        }

        return Math.round(sum / totalSize);
        */

        /*
        int sum = 0;
        if (params == null) {
            return 0;
        }

        for (int n : params) {
            sum += n;
        }

        return sum / params.length;
        */

        // Lambda
        return (int) Arrays.stream(params).average().orElse(0);
    }
}
