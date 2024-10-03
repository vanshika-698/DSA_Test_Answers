public class prime {
   
        public static void main(String[] args) {
            int N = 84;  
            
            System.out.print("Prime factors of " + N + " are: ");
            
            
            while (N % 2 == 0) {
                System.out.print(2 + " ");
                N /= 2;
            }
            
            
            for (int i = 3; i * i <= N; i += 2) {
                while (N % i == 0) {
                    System.out.print(i + " ");
                    N /= i;
                }
            }
            
            
            if (N > 2) {
                System.out.print(N);
            }
        }
    
}
