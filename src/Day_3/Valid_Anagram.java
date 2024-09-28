package Day_3;

import java.util.Arrays;

// 242. Valid Anagram
public class Valid_Anagram {
    public boolean isAnagram(String s, String t) {
        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();
        Arrays.sort(sc);
        Arrays.sort(tc);
        return new String(sc).equals(new String(tc));
    }

}
