package net.harunote.quiz.arrays;

/**
 * @Author CodeVillains
 * main 메소드에 최소 10개 이상의 요소로 구성된 integer array를 정의 한 후 해당 array의 최소 값이 위치한 자리수와 그 값을 출력한다.
 */
public class ArrayIndexPosition {
    public static void main(String[] args) {
        int a[] = new int[]{12, 44, 23, 56, 9, 23, 78, 13};

        int min = a[0];
        int index = 0;

        for (int i = 0; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
                index = i;
            }
        }

        System.out.println("Index position of Smallest value in a given array is  :  " + index);
    }

}
