package solved.easy.string.s_05_1528_shuffle_string;

public class Solution {
    public String restoreString(String s, int[] indices) {

        char[] restoredArr = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            restoredArr[indices[i]] = s.charAt(i);
        }
        return String.valueOf(restoredArr);
    }
}
