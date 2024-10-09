import java.util.Scanner;

public class sumofthree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the number of integers (N): ");
        int N = scanner.nextInt();
        int[] array = new int[N];

       
        System.out.println("Enter " + N + " integers:");
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }

        
        int count = 0;

    
        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                for (int k = j + 1; k < N; k++) {
                
                    if (array[i] + array[j] + array[k] == 0) {
                       
                        System.out.println("Triplet: " + array[i] + ", " + array[j] + ", " + array[k]);
                        count++; 
                }
            }
        }

       
        System.out.println("Number of distinct triplets: " + count);

        scanner.close();
    }
}
}

