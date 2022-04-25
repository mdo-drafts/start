package solved.medium.dynamic.dp_02_55_jump_game;

//1 ms	42.9 MB
public class Solution {

    public boolean canJump(int[] nums) {

        int lastTrueInd = nums.length - 1;
        for (int i = nums.length - 2; 0 <= i; i--) {
            if (i + nums[i] >= lastTrueInd) {
                lastTrueInd = i;
            }
        }
        return lastTrueInd == 0;
    }
}


