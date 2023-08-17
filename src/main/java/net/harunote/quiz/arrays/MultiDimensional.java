package net.harunote.quiz.arrays;

import java.util.Arrays;
import java.util.Collections;

/**
 * @Author : CodeVillains
 * @Description :
 */
public class MultiDimensional {
    public static void main(String[] args) {
        int[] a = new int[3];      // 배열의 선언

        a[0] = 1;
        a[1] = 2;
        a[2] = 3;

        System.out.println(a.length);   // 배열의 길이

        int[] b = {5, 2, 3, 1, 6, 8};  // 선언과 할당

        Arrays.sort(b);     // 오름차순 정렬

        System.out.println(Arrays.toString(b));

        Integer[] bInteger = new Integer[b.length];
        for (int i = 0; i < b.length; i++) {
            bInteger[i] = b[i];
        }

        Collections.reverse(Arrays.asList(bInteger));      // 내림차순 정렬

        System.out.println("# 내림 차순 정렬");
        for (Integer in : bInteger) {
            System.out.print(in + ", ");
        }


        System.out.println("\n# 오름 차순 정렬");
        Arrays.sort(bInteger);
        System.out.println(Arrays.toString(bInteger));

        // 다 차원 배열
        int[][] table = { {1,2,3,4,5,6,7,8,9,10},
                {2,3,4,5,6,7,8,9,10,1},
                {3,4,5,6,7,8,9,10,1,2},
                {4,5,6,7,8,9,10,1,2,3},
                {5,6,7,8,9,10,1,2,3,4} };

        System.out.println(table.length);
        System.out.println(table[0].length);

    }
}
