package net.harunote.quiz;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @Author : CodeVillains
 * @Description : 입력값에서 중복된 값을 카운트 한다.
 */
public class BirthdayCakeCandle {

    static int birthdayCakeCandles(int n, int[] ar) {
        // Complete this function

        Map<Integer, Integer> map = new HashMap<>();

        // 목록을 돌면서 키가 존재할 경우 +1, 아니면 1을 value 에 저장한다.
        for (int i = 0; i < ar.length; i++) {
            if (map.containsKey(ar[i])) {
                map.put(ar[i], map.get(ar[i]) + 1);
            } else {
                map.put(ar[i], 1);
            }
        }

        map.forEach((k, v) -> System.out.println("Item : " + k + " Count : " + v));

        // map 의 value 중 최대값을 추출
        int max = (Collections.max(map.values()));
        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 4
        // 3 2 1 3

        int n = in.nextInt();
        int[] ar = new int[n];
        for (int ar_i = 0; ar_i < n; ar_i++) {
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }


}
