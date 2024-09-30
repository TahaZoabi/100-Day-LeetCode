package Day_5;

// 125. Valid Palindrome
public class Valid_Palindrome {
    public boolean isPalindrome(String s) {
        StringBuilder t = new StringBuilder();
        for (char c : s.toLowerCase().toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                t.append(c);
            }
        }

        return t.toString().contentEquals(t.reverse());
    }
}
