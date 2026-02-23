public class InvertedPyramid {

    public static void main(String[] args) {

        int rows = 5;
        int number = 1;

        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }
}