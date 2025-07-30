public class FindSubsets {
    public static void findSubsets(String str, String ans, int i) {
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            }

            else {
                System.out.println(ans);
            }

            return;
        }

        findSubsets(str, ans + str.charAt(i), i + 1);
        findSubsets(str, ans, i + 1);
    }
}
