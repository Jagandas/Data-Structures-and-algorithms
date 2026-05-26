package Infosys.numbers;

public class reversenum {
	 public static void main(String[] args) {

	        int num = 12345;
	        int reverse = 0;

	        while (num != 0) {

	            int rem = num % 10;   // get last digit
	            reverse = reverse * 10 + rem;  // build reversed number
	            num = num / 10;  // remove last digit
	        }

	        System.out.println("Reversed Number: " + reverse);
	    }
}
