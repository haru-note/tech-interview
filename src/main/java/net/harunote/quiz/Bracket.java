package net.harunote.quiz;

import java.util.Scanner;
import java.util.Stack;

/**
 * @Author : CodeVillains
 * @Description : 지정된 괄호들의 밸런스가 맞는지 검증
 */
public class Bracket {
/* 입력값
3
{[()]}
{[(])}
{{[[(())]]}}
*/

    public static void main(String[] args) {
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
                    // 스택이 비어있다면, 밸런스가 맞지 않는 것이므로 false를 반환
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
                /*
                 *조건문이 다소 많다고 느낀다면 아래와 같이 표현할 수 있다.

                if (stack.empty()) {
                    return false;
                }

                // 스택의 가장 위에 있는 괄호와 현재 괄호가 짝이 맞는지 확인하고, 맞으면 스택에서 제거.
                if (ch.equals(")") && stack.peek().equals("(") ||
                    ch.equals("}") && stack.peek().equals("{") ||
                    ch.equals("]") && stack.peek().equals("[")) {
                    stack.pop();
                } else { // 짝이 맞지 않는 경우 false를 반환.
                    return false;
                }
                */
            }
        }
        return stack.empty();
    }
}
