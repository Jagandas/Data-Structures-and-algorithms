package Infosys.string;

import java.util.Arrays;

public class Checkanagram {
	public static boolean isAnagram(String s1,String s2) {
		if(s1.length()!=s2.length()) {
			return false;
		}
		
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		char[]a1=s1.toCharArray();
		char[]a2=s2.toCharArray();
		
		Arrays.sort(a1);
		Arrays.sort(a2);
		
		return Arrays.equals(a1, a2);
		
	}
	public static void main(String[]args) {
		String s1="silent";
		String s2="listen";
		
		if(isAnagram(s1,s2)) {
			System.out.println("Strings are anagrams");
		}
		else {
			System.out.println("Strings are not anagrams");
		}
	}
}
