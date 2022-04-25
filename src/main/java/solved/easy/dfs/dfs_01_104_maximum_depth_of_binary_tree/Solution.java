package solved.easy.dfs.dfs_01_104_maximum_depth_of_binary_tree;

//	0 ms	42.9 MB
public class Solution {
    public int maxDepth(TreeNode root) {
        return findMaxDepth(root, 1);
    }

    private int findMaxDepth(TreeNode node, int level) {
        if (node == null) {
            return level - 1;
        }
        return Math.max(findMaxDepth(node.left, level + 1), findMaxDepth(node.right, level + 1));
    }
}
