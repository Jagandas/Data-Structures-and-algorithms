package Infosys.string;

import java.util.HashMap;

public class Countfrequency {
	public static void countFrequency(String str) {
		HashMap<Character,Integer>map=new HashMap<>();
		str=str.toLowerCase();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			
			if(ch==' ') {
				continue;
			}
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		System.out.println("character occurences:");
		for(char key:map.keySet()) {
			System.out.println(key +"->"+map.get(key));
		}
	}
	public static void main(String[]args) {
		String str="programming";
		countFrequency(str);
	}
}
