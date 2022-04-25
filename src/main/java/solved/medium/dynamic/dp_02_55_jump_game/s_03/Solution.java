package solved.medium.dynamic.dp_02_55_jump_game.s_03;

//525 ms	43 MB
public class Solution {
    public boolean canJump(int[] nums) {

        boolean[] steps = new boolean[nums.length];
        steps[steps.length - 1] = true;
        int lastTrueInd = steps.length - 1;
        for (int i = nums.length - 2; 0 <= i; i--) {
            for (int j = nums[i]; 0 <= j; j--) {
                if (j > steps.length - 1 || i + j > steps.length - 1) {
                    j = steps.length - 1 - i;
                }
                if (i + j < lastTrueInd) {
                    break;
                }
                if (steps[i + j]) {
                    steps[i] = true;
                    lastTrueInd = i;
                }
            }
        }
        return steps[0];
    }
}
