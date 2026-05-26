package Infosys.numbers;

public class sumofdigits {
    public static int sumDigits(int num) {

        int sum = 0;

        while (num != 0) {

            int digit = num % 10;  // get last digit
            sum = sum + digit;     // add to sum
            num = num / 10;        // remove last digit
        }

        return sum;
    }

    public static void main(String[] args) {

        int num = 12345;

        int result = sumDigits(num);

        System.out.println("Sum of digits: " + result);
    }

}
