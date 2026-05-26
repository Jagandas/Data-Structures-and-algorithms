package Infosys.string;

public class removeduplicates {
	public static String removeDuplicates(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            // add character only if not already present
            if (result.indexOf(ch) == -1) {
                result = result + ch;
            }
        }

        return result;
    }
	 public static void main(String[] args) {

	        String str = "programming";

	        String result = removeDuplicates(str);

	        System.out.println("Original String: " + str);
	        System.out.println("After Removing Duplicates: " + result);
	    }
}
