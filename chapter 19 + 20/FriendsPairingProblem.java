public class FriendsPairingProblem {
    public static int friendsPairing(int n) {
        if (n == 1 || n == 2) {
            return n;
        }

        int totWays = friendsPairing(n - 1) + (n - 1) * friendsPairing(n - 2);
        ;
        return totWays;
    }

    public static void main(String[] args) {
        System.out.println(friendsPairing(3));
    }
}
