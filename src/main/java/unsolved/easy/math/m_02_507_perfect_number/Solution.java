package unsolved.easy.math.m_02_507_perfect_number;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public boolean checkPerfectNumber(int num) {

        List<Integer> divisorsSet = new ArrayList<>();
        divisorsSet.add(1);

        int[] possibleDivisors = {2, 3, 5, 7};

        int tmp = num;
        while (tmp != 1) {
            for (int possibleDivisor : possibleDivisors) {
                if (tmp % possibleDivisor == 0) {
                    divisorsSet.add(possibleDivisor);
                    tmp = tmp / possibleDivisor;
                }
            }
        }

        Set<Integer> allDivisors = new HashSet<>();
        for (int i = 0; i < divisorsSet.size() - 1; i++) {
            int curr = divisorsSet.get(i);
            allDivisors.add(curr);
            for (int j = i + 1; j < divisorsSet.size(); j++) {
                allDivisors.add(curr * divisorsSet.get(i));
            }
        }
        return false;
    }
}
