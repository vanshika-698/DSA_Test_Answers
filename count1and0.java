import java.util.Scanner;

public class count1and0 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        
        String binaryString = Integer.toBinaryString(number);
        System.out.println("Binary representation: " + binaryString);

        
        int count = 0;
        for (int i = 1; i < binaryString.length() - 1; i++) {
            if (binaryString.charAt(i) == '1' && 
                binaryString.charAt(i - 1) == '1' && 
                binaryString.charAt(i + 1) == '0') {
                count++;
            }
        }

       
        System.out.println("Number of '1's with '0' on the right and '1' on the left: " + count);
        scanner.close();
    }
}
