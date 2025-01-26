package p00xx.p0020;

// 제목 : Valid Parentheses

import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int index = 0; index < s.length(); index++) {
            char character = s.charAt(index);

            if (character == '(' || character == '{' || character == '[') {
                stack.push(character);
                continue;
            }

            if (stack.empty()) {
                return false;
            }

            char previous = stack.pop();

            if (character == ')') {
                if (previous != '(') {
                    return false;
                }
            } else if (character == '}') {
                if (previous != '{') {
                    return false;
                }
            } else {
                if (previous != '[') {
                    return false;
                }
            }
        }

        return stack.empty();
    }
}
