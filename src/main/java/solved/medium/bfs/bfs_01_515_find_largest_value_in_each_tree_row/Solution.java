package solved.medium.bfs.bfs_01_515_find_largest_value_in_each_tree_row;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//1 ms	42.6 MB
public class Solution {

    Map<Integer, Integer> resultMap = new HashMap<>();

    public List<Integer> largestValues(TreeNode root) {
        findLargest(root, 0);
        List<Integer> result = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : resultMap.entrySet()){
            result.add(entry.getKey(), entry.getValue());
        }
        return result;
    }

    private void findLargest(TreeNode node, int level) {
        if (node == null) {
            return;
        }

        if (resultMap.get(level) == null) {
            resultMap.put(level, node.val);
        } else {
            int curr = resultMap.get(level);
            resultMap.put(level, Math.max(node.val, curr));
        }
        findLargest(node.left, level + 1);
        findLargest(node.right, level + 1);
    }
}
