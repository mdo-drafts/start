package solved.medium.dynamic.dp_02_55_jump_game.s_04;

//1 ms	43 MB
public class Solution {
    public boolean canJump(int[] nums) {

        boolean[] steps = new boolean[nums.length];
        steps[steps.length - 1] = true;
        int lastTrueInd = steps.length - 1;
        for (int i = nums.length - 2; 0 <= i; i--) {
            if (i + nums[i] >= lastTrueInd) {
                steps[i] = true;
                lastTrueInd = i;
            }
        }
        return steps[0];
    }
}
