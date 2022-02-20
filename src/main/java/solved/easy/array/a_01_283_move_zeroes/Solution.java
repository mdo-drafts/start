package solved.easy.array.a_01_283_move_zeroes;

public class Solution {
    public void moveZeroes(int[] nums) {

        for (int i = nums.length - 1; 0 <= i; i--) {
            if (nums[i] == 0) {
                int j = i;
                while (j < nums.length - 1 && nums[j + 1] != 0) {
                    nums[j] = nums[j + 1];
                    nums[j + 1] = 0;
                    j++;
                }
            }
        }
    }
}
