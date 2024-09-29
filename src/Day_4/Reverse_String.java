package Day_4;

// 344. Reverse String
public class Reverse_String {
    public static void reverseString(char[] s) {
        char[] temp = new char[s.length];
        int j = s.length;
        for (char c : s) {
            temp[j - 1] = c;
            j--;
        }
        System.arraycopy(temp, 0, s, 0, temp.length);
    }
}