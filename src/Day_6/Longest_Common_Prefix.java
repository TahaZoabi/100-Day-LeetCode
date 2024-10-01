package Day_6;

// 14. Longest Common Prefix
public class Longest_Common_Prefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            // Check if the current string is empty
            if (strs[i].isEmpty()) return "";

            while (!prefix.isEmpty() && !strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }


}
