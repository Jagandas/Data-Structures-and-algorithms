package Infosys.numbers;

public class factorial {
	 public static long factorial(int n) {

	        long fact = 1;

	        for (int i = 1; i <= n; i++) {
	            fact = fact * i;
	        }

	        return fact;
	    }

	    public static void main(String[] args) {

	        int num = 5;

	        long result = factorial(num);

	        System.out.println("Factorial of " + num + " is: " + result);
	    }
}
