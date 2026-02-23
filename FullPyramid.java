public class FullPyramid {

    public static void main(String[] args) {

        int rows = 5;

        for (int i = rows; i >= 1; i--) {
            // Print leading spaces for alignment
            for (int space = 0; space < rows - i; space++) {
                System.out.print(" ");
            }
            // Print letters
            for (int j = 0; j < i; j++) {
                System.out.print((char)('A' + j) + " ");
            }
            System.out.println();
        }
    }
}