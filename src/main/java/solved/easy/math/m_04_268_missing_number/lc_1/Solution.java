package solved.easy.math.m_04_268_missing_number.lc_1;

//XOR usage for the missing number
public class Solution {
    public int missingNumber(int[] nums) {
        int missing = nums.length;
        for (int i = 0; i < nums.length; i++) {
            missing ^= i ^ nums[i];
        }
        return missing;
    }
}
