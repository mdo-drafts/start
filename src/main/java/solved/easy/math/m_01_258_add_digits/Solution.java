package solved.easy.math.m_01_258_add_digits;

public class Solution {
    public int addDigits(int num) {
        int resultSum = num;

        while (resultSum / 10 > 0) {
            num = resultSum;
            resultSum = 0;
            while (num > 0) {
                resultSum += num % 10;
                num = num / 10;
            }
        }
        return resultSum;
    }
}
