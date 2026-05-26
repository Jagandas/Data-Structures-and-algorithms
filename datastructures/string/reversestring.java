package Infosys.string;

public class reversestring {
	public static String reverse(String s) {
		String reversed="";
		
		for(int i=s.length()-1;i>=0;i--) {
			reversed=reversed+s.charAt(i);
		}
		return reversed;
	}
	public static void main(String[]args) {
		String s="jagan";
		String result=reverse(s);
		System.out.println(s);
		System.out.println(result);
	}
}
