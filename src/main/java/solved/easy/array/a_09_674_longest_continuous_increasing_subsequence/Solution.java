package solved.easy.array.a_09_674_longest_continuous_increasing_subsequence;

public class Solution {

    public int findLengthOfLCIS(int[] nums) {
        int max = 1;

        int currMax = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                currMax++;
            } else {
                max = Math.max(max, currMax);
                currMax = 1;
            }
        }
        return Math.max(max, currMax);
    }
}
