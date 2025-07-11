public class PrintNos1toN {
    public static void print1toN(int n) {
        if (n == 0) {
            return;
        }

        print1toN(n - 1);
        System.out.print(n +
                " ");
    }

    public static void main(String[] args) {
        int n = 10;

        print1toN(n);
    }
}
