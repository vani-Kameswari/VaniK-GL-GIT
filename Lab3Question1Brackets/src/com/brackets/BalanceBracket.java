package com.brackets;

import java.util.Stack;

public class BalanceBracket {

	public boolean findBalanceBrackets(String strbracket) {

		if (strbracket == null)
			return false;
		
		Stack<Character> stackbracket = new Stack<>();

		for (int i = 0; i < strbracket.length(); i++) {

			if (strbracket.charAt(i) == '{' || strbracket.charAt(i) == '[' || strbracket.charAt(i) == '(') {
				stackbracket.push(strbracket.charAt(i));
			} else if (strbracket.charAt(i) == '}' || strbracket.charAt(i) == ']' || strbracket.charAt(i) == ')') {
				if (stackbracket.isEmpty()) {
					return false;
				} else {
					char popch = stackbracket.pop();
					if  ( (popch == '{'  && strbracket.charAt(i) == '}') ||
						  (popch == '['  && strbracket.charAt(i) == ']') ||
						  (popch == '('  && strbracket.charAt(i) == ')') )
						continue;
					else					
						return false;
				}

			}
		}
		if (!stackbracket.isEmpty()) {
			return false;
		}

		return true;

	}

	
	
	
	public static void main(String[] args) {
	
		String inBrackets = "[{}(a)(([ [{}3]]b))9]";

		BalanceBracket balancebrackets = new BalanceBracket();
		boolean result = balancebrackets.findBalanceBrackets(inBrackets);

		if (result == true)
			System.out.println("The entered String has Balanced Brackets");
		else
			System.out.println("The entered Strings do not contain Balanced Brackets");

	}
	

}
