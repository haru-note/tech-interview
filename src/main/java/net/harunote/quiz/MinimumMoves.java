package net.harunote.quiz;

import java.io.IOException;

/**
 * @Author : CodeVillains
 * @Description :
 */
public class MinimumMoves {

    public static void main(String[] args) throws IOException {
        int[] a = {1234, 4321};
        int[] b = {2345, 3214};

        int count = minimumMoves(a, b);

        System.out.println("count : " + count);

    }

    static int minimumMoves(int[] a, int[] m) {

        int size = a.length;
        int result = 0;

        for (int i = 0; i < size; i++) {
            String first = a[i] + "";
            String second = m[i] + "";

            System.out.println("first : " + first);  // 1234
            System.out.println("second : " + second); // 2345

            char[] ins = first.toCharArray();
            char[] rst = second.toCharArray();

            int value = counting(ins, rst);
            result += value;
        }

        return result;
    }

    static int counting(char[] ins, char[] rst) {

        int count = 0;
        for (int idx = 0; idx < ins.length; idx++) {
            if (ins[idx] > rst[idx]) {
                count += calc(ins[idx], rst[idx]);
            } else if (ins[idx] < rst[idx]) {
                count += calc(rst[idx], ins[idx]);
            }
        }

        System.out.println("result : " + count);
        return count;
    }

    private static int calc(char c, char i) {       //  2,  1
        int x = Character.getNumericValue(c);
        int y = Character.getNumericValue(i);

        return x - y;
    }
}

