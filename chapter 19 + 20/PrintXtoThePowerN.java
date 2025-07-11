public class PrintXtoThePowerN {
    public static int pow(int x, int n) {
        if (n == 0) {
            return 1;
        }

        if (n == 1) {
            return x;
        }

        return x * pow(x, n - 1);
    }

    public static void main(String[] args) {
        System.out.println(pow(2, 5));
    }
}

/*
 * FUNCTION pow(x, n):
 * IF n == 0:
 * RETURN 1
 * RETURN x * pow(x, n - 1)
 * 
 * Time Complexity (TC):
 * O(n)
 * 
 */