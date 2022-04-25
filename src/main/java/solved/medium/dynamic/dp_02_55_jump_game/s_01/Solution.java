package solved.medium.dynamic.dp_02_55_jump_game.s_01;

//1389 ms	68.9 MB
public class Solution {

    public boolean canJump(int[] nums) {

        boolean[] steps = new boolean[nums.length];
        steps[steps.length - 1] = true;
        for (int i = nums.length - 2; 0 <= i; i--) {
            for (int j = nums[i]; 0 <= j; j--) {
                if(i + j < steps.length){
                    if(steps[i+j]){
                        steps[i] = true;
                    }
                }
            }
        }
        return steps[0];
    }
}
