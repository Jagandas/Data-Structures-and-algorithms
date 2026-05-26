package Infosys.numbers;

public class LCM {
	public static int findGCD(int a, int b) {

        // Euclidean Algorithm for GCD
        while (b != 0) {

            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    public static int findLCM(int a, int b) {

        // LCM formula: (a * b) / GCD
        return (a * b) / findGCD(a, b);
    }

    public static void main(String[] args) {

        int num1 = 12;
        int num2 = 18;

        int result = findLCM(num1, num2);

        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + result);
    }
}
