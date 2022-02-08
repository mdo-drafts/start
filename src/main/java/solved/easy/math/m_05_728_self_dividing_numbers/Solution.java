package solved.easy.math.m_05_728_self_dividing_numbers;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (i / 10 == 0) {
                result.add(i);
                continue;
            }
            int curr = i;
            boolean selfDividing = true;
            while (curr > 0) {
                int digit = curr % 10;
                if (digit == 0 || i % digit != 0) {
                    selfDividing = false;
                    break;
                }
                curr /= 10;
            }
            if (selfDividing) {
                result.add(i);
            }
        }
        return result;
    }
}
