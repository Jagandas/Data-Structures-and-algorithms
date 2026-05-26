package Infosys.numbers;

public class primecheck {
	  public static boolean isPrime(int n) {

	        // numbers <= 1 are not prime
	        if (n <= 1) {
	            return false;
	        }

	        // check divisors from 2 to sqrt(n)
	        for (int i = 2; i * i <= n; i++) {

	            if (n % i == 0) {
	                return false;
	            }
	        }

	        return true;
	    }
	public static void main(String[] args) {

        int num = 29;

        if (isPrime(num)) {
            System.out.println(num + " is a Prime number");
        } else {
            System.out.println(num + " is not a Prime number");
        }
    }
}
