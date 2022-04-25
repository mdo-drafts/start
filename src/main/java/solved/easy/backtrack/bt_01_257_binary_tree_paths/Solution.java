package solved.easy.backtrack.bt_01_257_binary_tree_paths;

import java.util.ArrayList;
import java.util.List;

//19 ms	43.1 MB
public class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        findPath(root, "", result);
        return result;
    }

    private void findPath(TreeNode node, String curr, List<String> result) {
        if (node == null) {
            return;
        }
        if (node.left == null && node.right == null) {
            result.add(curr + node.val);
            return;
        }

        curr = curr + node.val + "->";
        findPath(node.left, curr, result);
        findPath(node.right, curr, result);
    }
}
