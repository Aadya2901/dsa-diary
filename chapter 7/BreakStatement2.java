public class BreakStatement2 {
    public static void main(String[] args) {
        for (int i = 1;; i++) {
            if (i % 10 == 0) {
                break;
            }

            System.out.println(i);
        }
    }
}

/*
 * for (int i = 1; i % 10 != 0; i++) {
 * System.out.println(i);
 * }
 * 
 */