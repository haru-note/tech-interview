package net.harunote.quiz.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @Author : CodeVillains
 * @Description : 주어진 두개의 문자열이 anagram이 될 수 있도록 문자를 제거함
 * We delete the following characters from our two strings to turn them into anagrams of each other:
 * Remove d and e from cde to get c.
 * Remove a and b from abc to get c.
 * We must delete  characters to make both strings anagrams, so we print  on a new line.
 */
public class MakingAnagrams {
    public static int numberNeeded(String first, String second) {
        char[] one = first.toCharArray();
        char[] two = second.toCharArray();

        Map<Character, Integer> letter = new HashMap<>();
        int count;

        for (char c : one) {
            count = letter.containsKey(c) ? letter.get(c) : 0;
            letter.put(c, count + 1);
        }

        for (char c : two) {
            count = letter.containsKey(c) ? letter.get(c) : 0;
            letter.put(c, count - 1);
        }

        int result = 0;
        for (char c : letter.keySet()) {
            result += Math.abs(letter.get(c));
        }

        return result;
    }

    public static void main(String[] args) {
        // cde
        // abc
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }

}
