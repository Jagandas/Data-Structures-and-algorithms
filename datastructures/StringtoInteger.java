package firstweek;

public class StringtoInteger {
	public static int convert(String s) {
		int i=0;
		int n=s.length();
		
		while(i<n && s.charAt(i)==' ') {
			i++;
		}
		
		if(i==n) {
			return 0;
		}
		int sign=1;
		
		if(s.charAt(i)=='-') {
			sign=-1;
			i++;
		}
		else if(s.charAt(i)=='+') {
			i++;
		}
		
		int result=0;
		
		while(i<n && Character.isDigit(s.charAt(i))) {
			int digit=s.charAt(i)-'0';
			
			if(result>(Integer.MAX_VALUE-digit)/10) {
				return sign==1
						?Integer.MAX_VALUE
						:Integer.MIN_VALUE;
				
			}
			result=result*10+digit;
			
			i++;
		}
		return result*sign;
	}
	public static void main(String[]args) {
		StringtoInteger SI=new StringtoInteger();
		
		System.out.println(SI.convert("42"));
		System.out.println(SI.convert("0143"));
	}
}
