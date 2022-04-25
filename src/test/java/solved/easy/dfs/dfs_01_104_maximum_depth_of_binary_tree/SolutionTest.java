package solved.easy.dfs.dfs_01_104_maximum_depth_of_binary_tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1(){
        TreeNode node34 = new TreeNode(9);
        TreeNode node32 = new TreeNode(3);
        TreeNode node31 = new TreeNode(5);

        TreeNode node21 = new TreeNode(3, node31, node32);
        TreeNode node22 = new TreeNode(2, null ,node34);

        TreeNode node11 = new TreeNode(1 , node21, node22);

        int actual = sut.maxDepth(node11);

        int expected =3;

        assertEquals(expected, actual);
    }
}