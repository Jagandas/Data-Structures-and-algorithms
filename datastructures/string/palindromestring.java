package Infosys.string;

public class palindromestring {
	public String check(String s) {
		String reversed="";
		for(int i=s.length()-1;i>=0;i--) {
			reversed+=s.charAt(i);
		}
		if(s.equals(reversed)) {
			return "palindrome";
		}
		else {
			return "not a palindrome";
		}
	}
	public static void main(String[]args) {
		palindromestring str=new palindromestring();
		String s="madam";
		String result=str.check(s);
		System.out.println(result);
	}
}
