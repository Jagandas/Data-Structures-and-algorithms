package Infosys.numbers;

public class evenodd {

    public static void checkEvenOdd(int num) {

        if (num % 2 == 0) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }
    }

    public static void main(String[] args) {

        int num = 17;

        checkEvenOdd(num);
    }
}
