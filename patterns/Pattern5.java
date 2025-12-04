package patterns;

public class Pattern5 {
    public static void Pattern5(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        Pattern5(n);
    }

}
