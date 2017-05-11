package lintCode;

import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {
		String s = "()";
		System.out.println(isValid(s));
	}

	public static boolean isValid(String s) {
		if (s == null || s.length() == 0)
			return true;
		char[] charArray = s.toCharArray();
		Stack<Character> stack = new Stack<Character>();
		for (char c : charArray) {
			if (stack.isEmpty()) {
				stack.push(c);
			} else if (getAnother(stack.peek()) != c) {
				stack.push(c);
			} else {
				stack.pop();
			}
		}
		if (stack.isEmpty())
			return true;

		return false;

	}

	public static char getAnother(char c) {
		if (c == ')')
			return '(';
		if (c == '}')
			return '{';
		if (c == ']')
			return '[';
		if (c == '(')
			return ')';
		if (c == '{')
			return '}';
		if (c == '[')
			return ']';
		throw new RuntimeException(" can not find the other part" + c);
	}

}
