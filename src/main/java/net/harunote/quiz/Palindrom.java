package net.harunote.quiz;

/**
 * @Author CodeVillains
 * 회문(palindrome)은 앞뒤로 읽어도 같은 단어입니다.
 * 주어진 단어가 회문인지 확인하는 함수를 작성하십시오. 대소문자는 무시해야 합니다.
 * 예를 들어 isPalindrome("Level")는 대소문자를 무시해야 하므로 true를 반환해야 합니다.
 */
public class Palindrom {

    public static void main(String[] args) {
        System.out.println("Palindrom : " + Palindrom.isPalindrome2("Level"));
    }

    private static boolean isPalindrome(String word) {
        if (word == null) {
            throw new UnsupportedOperationException("테스트 할 문자가 없습니다.");
        }
        String result = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            char charword = word.charAt(i);
            result += charword;
        }
        System.out.println("result : " + result);
        if (result.equalsIgnoreCase(word)) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean isPalindrome2(String word) {
        if (word == null) {
            throw new UnsupportedOperationException("테스트 할 문자가 없습니다.");
        }

        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            char leftChar = Character.toLowerCase(word.charAt(left));
            char rightChar = Character.toLowerCase(word.charAt(right));

            if (leftChar != rightChar) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
