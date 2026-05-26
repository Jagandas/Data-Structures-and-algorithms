package Infosys.string;

public class Countwords {
	public static int countwords(String str) {
		str=str.trim();
		if(str.length()==0) {
			return 0;
		}
		
		String words[]=str.split("\\s+");
		
		return words.length;
		
	}
	public static void main(String[]args) {
		String str="java is very easy to learn";
		int result=countwords(str);
		System.out.println(result);
	}
}
