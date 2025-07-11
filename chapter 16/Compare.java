public class Compare {
    public static void main(String[] args) {
        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String("Tony");

        if (s1 == s2) {
            System.out.println("Strings are equal");
        }

        else {
            System.out.println("Strings are not equal");
        }
        // Strings are equal

        if (s1 == s3) {
            System.out.println("Strings are equal");
        }

        else {
            System.out.println("Strings re not equal");
        }
        // Strings are not equal

        if (s1.equals(s3)) {
            System.out.println("Strings are equal");
        }

        else {
            System.out.println("Strings re not equal");
        }
        // Strings are equal
    }
}
