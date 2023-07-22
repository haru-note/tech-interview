package net.harunote.quiz;
import java.util.Scanner;
import java.util.Stack;

/**
 * @Author : CodeVillains
 * @Description : 지정된 괄호들의 밸런스가 맞는지 검증
 */
public class Bracket {
    public static void main(String[] args) {
/*
3
{[()]}
{[(])}
{{[[(())]]}}
*/
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println((isBalanced(expression)) ? "YES" : "NO");
        }
    }

    public static boolean isBalanced(String expression) {
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            String ch = expression.substring(i, i + 1);

            if (ch.equals("[") || ch.equals("{") || ch.equals("(")) {
                stack.push(ch);
            } else {
                if (ch.equals(")")) {
                    if (stack.empty()) {
                        return false;
                    }
                    if (stack.peek().equals("(")) {
                        stack.pop();
                    }
                } else if (ch.equals("}")) {
                    if (stack.empty()) {
                        return false;
                    }
                    if (stack.peek().equals("{")) {
                        stack.pop();
                    }
                } else if (ch.equals("]")) {
                    if (stack.empty()) {
                        return false;
                    }
                    if (stack.peek().equals("[")) {
                        stack.pop();
                    }
                }
            }
        }
        //stack.forEach((str) -> System.out.println(str));

        return stack.empty();
    }

}
