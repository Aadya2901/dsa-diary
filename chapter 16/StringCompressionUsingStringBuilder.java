public class StringCompressionUsingStringBuilder {
    public static String stringCompression(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            int count = 1;

            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }

            sb.append(str.charAt(i));

            if (count > 1) {
                sb.append(count);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "aaabbcccddddeeefffggghhhhiii";
        System.out.println(stringCompression(str)); // a3b2c3d4e3f3g3h4i3
    }
}

/*
 * Function stringCompression(str):
 * Initialize sb as an empty StringBuilder
 * 
 * For i = 0 to length of str - 1:
 * Set count = 1
 * 
 * While i < length of str - 1 AND str[i] == str[i + 1]:
 * Increment count by 1
 * Increment i by 1
 * 
 * Append str[i] to sb
 * 
 * If count > 1:
 * Append count to sb as string
 * 
 * Return sb converted to string
 * 
 * Time and Space Complexity
 * ✅ Time Complexity: O(n)
 * Where n is the length of the input string.
 * 
 * Each character is visited only once.
 * 
 * Inner while loop may increment i, but overall i moves from 0 to n - 1.
 * 
 * ✅ Space Complexity: O(n)
 * In the worst case (no compression possible, like "abcdef"), the output string
 * will be the same size as the input.
 * 
 * In best case (all characters repeated), the compressed string might be
 * shorter.
 */