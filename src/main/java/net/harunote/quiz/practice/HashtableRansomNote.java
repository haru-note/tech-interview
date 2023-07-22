package net.harunote.quiz.practice;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * @Author : CodeVillains
 * @Description : The first line contains two space-separated integers describing the respective values of
 * (the number of words in the magazine) and  (the number of words in the ransom note).
 * The second line contains  space-separated strings denoting the words present in the magazine.
 * The third line contains  space-separated strings denoting the words present in the ransom note.
 *
 * sample
 * 6 4
 * give me one grand today night
 * give one grand today
 */
public class HashtableRansomNote {
    Map<String, Integer> magazineMap;
    Map<String, Integer> noteMap;

    public HashtableRansomNote(String magazine, String note) {
        String[] ma = magazine.split("\\s");
        String[] no = note.split("\\s");

        magazineMap = new Hashtable<>();
        noteMap = new Hashtable<>();

        int init = 1;
        for (String str : no) {
            if (noteMap.containsKey(str)) {
                noteMap.put(str, noteMap.get(str) + 1);
            } else {
                noteMap.put(str, init);
            }
        }
        System.out.println("1 note : " + noteMap.toString());



        int count = 1;
        for (String str : ma) {
            if (magazineMap.containsKey(str)) {
                magazineMap.put(str, magazineMap.get(str) + 1);
            } else {
                magazineMap.put(str, count);
            }
        }

        System.out.println("2 magazineMap : " + magazineMap.toString());


    }

    public boolean solve() {
        boolean result = false;
        Set<String> keys = magazineMap.keySet();

        for (String str : keys) {
            System.out.println("str : " + str);
            System.out.println("noteMap.containsKey(str) : " + noteMap.containsKey(str));
            if (noteMap.containsKey(str)) {
                if (magazineMap.get(str) >= noteMap.get(str)) {
                    noteMap.remove(str);
                }
            }
        }

        if (noteMap.isEmpty()) {
            result = true;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        // Eat whitespace to beginning of next line
        scanner.nextLine();

        HashtableRansomNote s = new HashtableRansomNote(scanner.nextLine(), scanner.nextLine());
        scanner.close();

        boolean answer = s.solve();
        if(answer)
            System.out.println("Yes");
        else System.out.println("No");

    }

}
