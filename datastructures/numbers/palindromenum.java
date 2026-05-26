package Infosys.numbers;

public class palindromenum {
	 public static boolean isPalindrome(int num) {

	        int original = num;
	        int reverse = 0;

	        while (num != 0) {

	            int rem = num % 10;
	            reverse = reverse * 10 + rem;
	            num = num / 10;
	        }

	        return original == reverse;
	    }

	    public static void main(String[] args) {

	        int num = 121;

	        if (isPalindrome(num)) {
	            System.out.println(num + " is a Palindrome Number");
	        } else {
	            System.out.println(num + " is NOT a Palindrome Number");
	        }
	    }
}
