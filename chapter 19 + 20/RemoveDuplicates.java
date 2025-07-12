public class RemoveDuplicates {
    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(idx);
        if (map[currChar - 'a'] == true) {
            removeDuplicates(str, idx + 1, newStr, map);
        }

        else {
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx + 1, newStr.append(currChar), map);
        }
    }

    public static void main(String[] args) {
        String str = "aadya";

        removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
    }
}

/*
 * function removeDuplicates(str, idx, newStr, map):
 * if idx == length(str):
 * print newStr
 * return
 * 
 * currChar = str[idx]
 * if map[currChar - 'a'] == true:
 * // Already seen, skip this character
 * removeDuplicates(str, idx + 1, newStr, map)
 * else:
 * // First time seeing this character
 * map[currChar - 'a'] = true
 * newStr = newStr + currChar
 * removeDuplicates(str, idx + 1, newStr, map)
 * 
 */