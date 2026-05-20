package firstweek;

public class palindromenumber {
	public  boolean ispalindrome(int x) {
		
		if(x<0) {
			return false;
		}
		int rev=0;
		int original=x;
		
		while(x!=0) {
			int digit=x%10;
			rev=rev*10+digit;
			x/=10;
		}
		return original ==rev;
		
	}
	public static void main(String[]args) {
		palindromenumber pm=new palindromenumber();
		
		System.out.println(pm.ispalindrome(121));
		System.out.println(pm.ispalindrome(10));
	}
}
