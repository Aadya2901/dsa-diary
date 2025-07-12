public class TillingProblem {
    public static int tilingProblem(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        // int fnm1 = tilingProblem(n - 1);
        // int fnm2 = tilingProblem(n - 2);
        // int totWays = fnm1 + fnm2;

        int totWays = tilingProblem(n - 1) + tilingProblem(n - 2);
        return totWays;
    }

    public static void main(String[] args) {
        System.out.println(tilingProblem(3));
        System.out.println(tilingProblem(2));
        System.out.println(tilingProblem(4));
    }
}
