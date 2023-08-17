package net.harunote.quiz.practice;

/**
 *
 * @Description :
 */

import java.util.Scanner;

public class CompareTheTriplets {

    static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2) {
        // Complete this function
        int[] result = new int[2];
        int alice = 0;
        int bob = 0;

        if (a0 > b0) {
            ++alice;
        } else {
            if (a0 < b0) {
                ++bob;
            }
        }

        if (a1 > b1) {
            ++alice;
        } else {
            if (a1 < b1) {
                ++bob;
            }
        }

        if (a2 > b2) {
            ++alice;
        } else {
            if (a2 < b2) {
                ++bob;
            }
        }
        result[0] = alice;
        result[1] = bob;
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int[] result = solve(a0, a1, a2, b0, b1, b2);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


    }
}
