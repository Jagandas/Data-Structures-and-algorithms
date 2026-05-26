package Infosys.string;

import java.util.LinkedHashMap;

public class firstnonrepeatingcharacter {
	public static void main(String[]args) {
		String str="programming";
		
		LinkedHashMap<Character,Integer>map=new LinkedHashMap<>();
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			map.put(ch,map.getOrDefault(ch, 0)+1);
		}
		
		for(char ch:map.keySet()) {
			if(map.get(ch)==1) {
				System.out.println("first non repeating char:"+ch);
				return;
			}
			
		}
		 System.out.println("No non-repeating character found");
	}
}
