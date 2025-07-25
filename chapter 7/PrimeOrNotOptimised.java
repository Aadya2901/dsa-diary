import java.util.*;

public class PrimeOrNotOptimised {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n <= 1) {
            System.out.println("n is not prime");
        } 
        
        else if (n == 2) {
            System.out.println("n is prime");
        } 
        
        else {
            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println("n is prime");
            } 
            
            else {
                System.out.println("n is not prime");
            }
        }

        sc.close();
    }
}
