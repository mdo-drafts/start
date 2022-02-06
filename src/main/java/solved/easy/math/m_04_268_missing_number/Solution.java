package solved.easy.math.m_04_268_missing_number;

public class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int nSum = n * (n + 1) / 2;
        int currSum = 0;
        for (int i = 0; i < nums.length; i++) {
            currSum += nums[i];
        }
        return nSum - currSum;
    }
}
