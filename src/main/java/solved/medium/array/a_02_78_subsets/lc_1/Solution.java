package solved.medium.array.a_02_78_subsets.lc_1;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        for(int n : nums){
            int size = result.size();
            for(int i=0; i<size; i++){
                List<Integer> subset = new ArrayList<>(result.get(i));
                subset.add(n);
                result.add(subset);
            }
        }
        return result;
    }
}


/*
    While iterating through all numbers, for each new number, we can either pick it or not pick it
    1, if pick, just add current number to every existing subset.
    2, if not pick, just leave all existing subsets as they are.
    We just combine both into our result.

    For example, {1,2,3} intially we have an emtpy set as result [ [ ] ]
    Considering 1, if not use it, still [ ], if use 1, add it to [ ], so we have [1] now
    Combine them, now we have [ [ ], [1] ] as all possible subset

    Next considering 2, if not use it, we still have [ [ ], [1] ], if use 2, just add 2 to each previous subset, we have [2], [1,2]
    Combine them, now we have [ [ ], [1], [2], [1,2] ]

    Next considering 3, if not use it, we still have [ [ ], [1], [2], [1,2] ], if use 3, just add 3 to each previous subset, we have [ [3], [1,3], [2,3], [1,2,3] ]
    Combine them, now we have [ [ ], [1], [2], [1,2], [3], [1,3], [2,3], [1,2,3] ]
 */