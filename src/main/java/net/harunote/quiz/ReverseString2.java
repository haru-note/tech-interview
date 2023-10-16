package net.harunote.quiz;

/**
 * @author CodeVillains
 */
public class ReverseString2 {
    public static void main(String[] args) {
        String str = "ABCDefg";
        // 문자 배열로 변환한 뒤 역순으로 출력한다.
        char chars[] = str.toCharArray();
        for(int i= chars.length-1; i >= 0; i--) {
            System.out.print(chars[i]);
        }
    }
}
