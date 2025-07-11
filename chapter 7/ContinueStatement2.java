public class ContinueStatement2 {
    public static void main(String args[]) {

        int n = 5;
        for (int i = n;; i++) {
            if (i % 10 == 0) {
                continue;
            }

            System.out.println(i);
        }
    }
}
