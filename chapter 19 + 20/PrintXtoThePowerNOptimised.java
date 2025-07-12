public class PrintXtoThePowerNOptimised {
    public static int pow(int x, int n) {
        if (n == 0) {
            return 1;
        }

        if (n == 1) {
            return x;
        }

        int halfPower = pow(x, n / 2);

        if (n % 2 == 0) {
            return halfPower * halfPower;
        }

        else {
            return x * halfPower * halfPower;
        }
    }

    public static void main(String[] args) {
        System.out.println(pow(2, 5)); // 32

        System.out.println(pow(2, 6)); // 64
    }
}

/*
 * function power(x, n):
 * if n == 0:
 * return 1
 * if n == 1:
 * return x
 * 
 * half = power(x, n / 2)
 * 
 * if n is even:
 * return half * half
 * else:
 * return x * half * half
 */