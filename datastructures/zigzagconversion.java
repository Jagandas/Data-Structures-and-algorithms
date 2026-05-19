package firstweek;

public class zigzagconversion {

    public static void printZigzag(String s, int numRows) {

        if (numRows == 1) {
            System.out.println(s);
            return;
        }

        StringBuilder[] rows = new StringBuilder[numRows];

        // Initialize rows
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int currentRow = 0;
        boolean goingDown = false;

        // Build zigzag rows
        for (char c : s.toCharArray()) {

            rows[currentRow].append(c + " ");

            // Fill spaces for alignment
            for (int i = 0; i < numRows - 1; i++) {
                rows[currentRow].append(" ");
            }

            // Change direction
            if (currentRow == 0 || currentRow == numRows - 1) {
                goingDown = !goingDown;
            }

            // Move row
            currentRow += goingDown ? 1 : -1;
        }

        // Print rows
        for (StringBuilder row : rows) {
            System.out.println(row);
        }
    }

    public static void main(String[] args) {

        String s = "PAYPALISHIRING";
        int numRows = 3;

        printZigzag(s, numRows);
    }
}