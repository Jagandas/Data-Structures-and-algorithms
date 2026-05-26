package Infosys.numbers;

public class armstrongnumber {
	  public static boolean isArmstrong(int n) {

	        int original = n;
	        int sum = 0;

	        // Count number of digits
	        int digits = String.valueOf(n).length();

	        while (n > 0) {

	            int rem = n % 10;

	            // power of digits
	            sum = sum + (int) Math.pow(rem, digits);

	            n = n / 10;
	        }

	        return sum == original;
	    }
	 public static void main(String[] args) {

	        int num = 153;

	        if (isArmstrong(num)) {
	            System.out.println(num + " is an Armstrong number");
	        } else {
	            System.out.println(num + " is NOT an Armstrong number");
	        }
	    }
}
