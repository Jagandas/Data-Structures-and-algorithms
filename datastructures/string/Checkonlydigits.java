package Infosys.string;

public class Checkonlydigits {
	public static boolean isOnlyDigits(String str) {

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            // if any character is not a digit
            if (ch < '0' || ch > '9') {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String str = "123456";

        if (isOnlyDigits(str)) {
            System.out.println("String contains only digits");
        } else {
            System.out.println("String contains non-digit characters");
        }
    }
}
