import java.util.ArrayList;

public class OddNumbers {

    public static void main(String[] args) {

        ArrayList<Integer> oddList = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                oddList.add(i);
            }
        }

        System.out.println("List of odd numbers between 1 to 100:");
        System.out.println(oddList);

        System.out.println("Minimum odd number: " + oddList.get(0));
        System.out.println("Maximum odd number: " + oddList.get(oddList.size() - 1));

        int sum = 0;
        for (int num : oddList) {
            sum += num;
        }

        System.out.println("Total sum of odd numbers: " + sum);
    }
}