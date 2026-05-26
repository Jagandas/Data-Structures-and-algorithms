package Infosys.numbers;

public class GCD {
	 public static int findGCD(int a, int b) {

	        // Euclidean Algorithm
	        while (b != 0) {

	            int temp = b;
	            b = a % b;
	            a = temp;
	        }

	        return a;
	    }

	    public static void main(String[] args) {

	        int num1 = 48;
	        int num2 = 18;

	        int result = findGCD(num1, num2);

	        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + result);
	    }
}
