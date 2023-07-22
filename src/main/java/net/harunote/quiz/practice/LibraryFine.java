package net.harunote.quiz.practice;

import java.util.Scanner;

/**
 * @Author : CodeVillains
 * @Description :
 */

public class LibraryFine {
    final Integer YEAR_FEE = 10000;
    final Integer MONTH_FEE = 500;
    final Integer DAY_FEE = 15;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int d1 = in.nextInt();
        int m1 = in.nextInt();
        int y1 = in.nextInt();
        int d2 = in.nextInt();
        int m2 = in.nextInt();
        int y2 = in.nextInt();

        // 연도를 비교한다.
        LibraryFine sul = new LibraryFine();
        int result = sul.calcDate(d1, m1, y1, d2, m2, y2);
        System.out.println(result);
    }

    public int calcDate(int d1, int m1, int y1, int d2, int m2, int y2) {
        int mon = 0;
        int day = 0;

        if (y1 > y2) {
            return YEAR_FEE;
        }

        if (m1 > m2) {
            mon = (m1 - m2) * MONTH_FEE;
        }

        if (d1 > d2) {
            day = (d1 - d2) * DAY_FEE;
        }

        return mon + day;

    }


}


