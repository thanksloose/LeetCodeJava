package com.hmm.test;

import java.util.Stack;

public class ValidParentheses {
	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			Character charTemp = s.charAt(i);
			if(charTemp=='[' || charTemp=='(' || charTemp=='{') {
				stack.push(charTemp);
			}
			else {
				if(stack.size() == 0)
				    return false;
				Character charTempN = stack.peek();
				if((charTemp == ']' && charTempN == '[') ||
						(charTemp == '}' && charTempN == '{') ||
						(charTemp == ')' && charTempN == '(') ) {
					stack.pop();
				}
				else
					return false;				
			}
		}
		return stack.isEmpty();
	}
	
	public static void main(String[] args) {
		ValidParentheses validParentheses = new ValidParentheses();
		System.out.println(validParentheses.isValid("(])"));
	}
}
