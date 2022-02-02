package solved.easy.array.a_01_283_move_zeroes.lc_1;

public class Solution {
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) return;

        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] !=0){
                nums[index++] = nums[i];
            }
        }

        while(index < nums.length){
            nums[index++] = 0;
        }
    }
}
