package net.harunote.quiz;

import java.util.Arrays;

/**
 * @Author : CodeVillains
 * @Description :
 */
public class EncodedString {
    public static void main(String[] args) {

        String s = "23#(2)24#25#26#23#(3)";

        int[] result = frequency(s);

        System.out.println(Arrays.toString(result));
    }

    private static int[] frequency(String s) {
        int[] result = new int[26];

        int size = s.length();

        int i = 0;
        while (i < size) {
            int val = 0;

            if (i + 2 >= size || s.charAt(i + 2) != '#') {
                val = s.charAt(i) - '0';
                result[val - 1]++;
                i++;
            } else if (s.charAt(i + 2) == '#') {
                val = (s.charAt(i) - '0') * 10 + (s.charAt(i + 1) - '0');
                result[val - 1]++;
                i = i + 3;
            }

            if (i < size) {
                if (s.charAt(i) == '(') {
                    int frequen = s.charAt(i + 1) - '0';
                    result[val - 1] += frequen - 1;
                    i = i + 3;
                }
            }
        }


        return result;
    }
}
