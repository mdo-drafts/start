package solved.medium.bfs.bfs_02_103_binary_tree_zigzag_level_order_traversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//1 ms	42.7 MB
public class Solution {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<LinkedList<Integer>> result = new ArrayList<>();
        int level = 0;
        zigzagLevelOrder(level, root, result);
        return new ArrayList<>(result);
    }

    private void zigzagLevelOrder(int level, TreeNode node, List<LinkedList<Integer>> result) {
        if (node == null) {
            return;
        }

        if (result.size() < level + 1) {
            result.add(new LinkedList<>());
        }
        if (level % 2 != 0) {
            LinkedList<Integer> current = result.get(level);
            current.addFirst(node.val);
        }else{
            LinkedList<Integer> current = result.get(level);
            current.addLast(node.val);
        }
        zigzagLevelOrder(level+1, node.left, result);
        zigzagLevelOrder(level+1, node.right, result);
    }
}
