public class ConvertLettersToUppercaseOptimised {
    public static String toUppercase(String str) {
        StringBuilder sb = new StringBuilder();
        boolean capitalizeNext = true;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == ' ') {
                capitalizeNext = true;
                sb.append(ch);
            } else if (capitalizeNext && Character.isLetter(ch)) {
                sb.append(Character.toUpperCase(ch));
                capitalizeNext = false;
            } else {
                sb.append(ch);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "hi, i am aadya patel kushwaha";
        System.out.println(toUppercase(str));
    }
}

/*
 * FUNCTION toUppercase(str):
 * CREATE empty StringBuilder sb
 * SET capitalizeNext = true
 * 
 * FOR each character 'ch' in the input string:
 * IF ch is a space:
 * SET capitalizeNext = true
 * APPEND ch to sb
 * ELSE IF capitalizeNext is true AND ch is a letter:
 * APPEND uppercase of ch to sb
 * SET capitalizeNext = false
 * ELSE:
 * APPEND ch to sb
 * 
 * RETURN sb as a string
 * 
 * 
 * Time Complexity (TC)
 * Let n be the length of the input string.
 * 
 * The loop runs n times.
 * 
 * Each operation inside the loop is O(1):
 * 
 * charAt(i): O(1)
 * 
 * Character.toUpperCase(): O(1)
 * 
 * sb.append(): amortized O(1)
 * 
 * 🕒 Total Time Complexity: O(n)
 * 
 * ✅ Space Complexity (SC)
 * StringBuilder uses additional space of O(n).
 * 
 * No other major data structures used.
 * 
 * 💾 Space Complexity: O(n)
 * 
 * ✅ Summary:
 * Aspect Value
 * Time Complexity O(n)
 * Space Complexity O(n)
 * Purpose Capitalize first letter of each word
 * Technique Flag (capitalizeNext) + Single-pass
 */