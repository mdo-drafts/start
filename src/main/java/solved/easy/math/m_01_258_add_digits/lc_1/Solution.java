package solved.easy.math.m_01_258_add_digits.lc_1;

//Digital Root formula
public class Solution {
    public int addDigits(int num) {
        if (num == 0) return 0;
        if (num % 9 == 0) return 9;
        return num % 9;
    }
}
