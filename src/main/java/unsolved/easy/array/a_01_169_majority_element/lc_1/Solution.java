package unsolved.easy.array.a_01_169_majority_element.lc_1;

//Boyer-Moore Voting Algorithm
//Time complexity : O(n), Space complexity : O(1)
public class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        Integer candidate = null;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }
        return candidate;
    }
}
