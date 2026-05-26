package Infosys.numbers;

public class perfectnumber {
	 public static boolean isPerfect(int num) {

	        int sum = 0;

	        // Find sum of proper divisors (excluding the number itself)
	        for (int i = 1; i <= num / 2; i++) {

	            if (num % i == 0) {
	                sum = sum + i;
	            }
	        }

	        return sum == num;
	    }

	    public static void main(String[] args) {

	        int num = 28;

	        if (isPerfect(num)) {
	            System.out.println(num + " is a Perfect Number");
	        } else {
	            System.out.println(num + " is NOT a Perfect Number");
	        }
	    }
}
