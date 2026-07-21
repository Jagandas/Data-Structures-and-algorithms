package javacoding.arrays;

import java.util.Stack;

public class Longestvalidparentheses {
	public static void main(String[]args) {
		String str=")()()()(";
		
		Stack<Integer>stack=new Stack<>();
		
		stack.push(-1);
		
		int maxlength=0;
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			
			if(ch=='(') {
				stack.push(i);
			}
			else {
				stack.pop();
				
				if(stack.isEmpty()) {
					stack.push(i);
				}
				else {
					int length=i-stack.peek();
					maxlength=Math.max(maxlength, length);
				}
			}
		}
		System.out.println("Longest Valid Parentheses Length = " + maxlength);
	}
}
