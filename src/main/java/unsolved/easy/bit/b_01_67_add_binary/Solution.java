package unsolved.easy.bit.b_01_67_add_binary;

public class Solution {
    public String addBinary(String a, String b) {
        char[] result = a.toCharArray();
        char[] toAdd = b.toCharArray();
        if (a.length() < b.length()) {
            result = b.toCharArray();
            toAdd = a.toCharArray();
        }
        char carry = '0';

        int i = result.length - 1;
        int j = toAdd.length - 1;
        while (i <= 0) {
            while (j <= 0) {
                if (toAdd[j] == '1') {
                    if (result[i] == '1') {
                        if (carry == '1') {
                            result[i] = '1';
                        } else {
                            result[i] = '0';
                            carry='1';
                        }
                    }
                }
                j--;
                i--;
            }
            i--;
        }

        String resultStr = new String(result);
        if (carry == '1') {
            resultStr = carry + resultStr;
        }
        return resultStr;
    }
}
