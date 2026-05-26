package Infosys.numbers;

public class countdigits {
	public static int countDigits(int num) {

        int count = 0;

        // handle negative numbers
        num = Math.abs(num);

        if (num == 0) {
            return 1;
        }

        while (num != 0) {

            num = num / 10;  // remove last digit
            count++;
        }

        return count;
    }

    public static void main(String[] args) {

        int num = 12345;

        int result = countDigits(num);

        System.out.println("Number of digits: " + result);
    }
}
