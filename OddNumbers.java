import java.util.ArrayList;

public class OddNumbers {

    public static void main(String[] args) {

        ArrayList<Integer> oddList = new ArrayList<>();

        // Find all odd numbers between 1 to 50
        for (int i = 1; i <= 50; i++) {
            if (i % 2 != 0) {
                oddList.add(i);
            }
        }

        System.out.println("List of odd numbers between 1 to 50:");
        System.out.println(oddList);
        System.out.println();

        // Three minimum odd numbers
        System.out.println("Three minimum odd numbers:");
        for (int i = 0; i < 3; i++) {
            System.out.println(oddList.get(i));
        }
        System.out.println();

        // Three maximum odd numbers
        System.out.println("Three maximum odd numbers:");
        for (int i = oddList.size() - 3; i < oddList.size(); i++) {
            System.out.println(oddList.get(i));
        }
        System.out.println();

        // Calculate average of odd numbers
        int sum = 0;
        for (int num : oddList) {
            sum += num;
        }
        double average = (double) sum / oddList.size();

        System.out.println("Total sum of odd numbers: " + sum);
        System.out.println("Average of odd numbers between 1 and 50: " + average);
    }
}