import java.util.Scanner;

public class AverageOfEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        int sum = 0, count = 0;

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            if (arr[i] % 2 == 0) {
                sum += arr[i];
                count++;
            }
        }

        if (count > 0) {
            int average = sum / count;
            System.out.println("Average of even numbers: " + average);
        } else {
            System.out.println("No even numbers found.");
        }
    }
}