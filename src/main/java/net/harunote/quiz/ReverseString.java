package net.harunote.quiz;

public class ReverseString {
    public static void main(String[] args) {
        ReverseString rs = new ReverseString();
        System.out.println(rs.reverseStr("ABCDefg"));
    }

    private String reverseStr(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
