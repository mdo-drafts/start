package solved.medium.bfs.bfs_02_103_binary_tree_zigzag_level_order_traversal;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;
import static util.Collections.asList;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1(){


        TreeNode node34 = new TreeNode(7);
        TreeNode node33 = new TreeNode(15);

        TreeNode node21 = new TreeNode(9, null, null);
        TreeNode node22 = new TreeNode(20, node33 ,node34);

        TreeNode node11 = new TreeNode(3 , node21, node22);

        List<List<Integer>> actual = sut.zigzagLevelOrder(node11);

        List<List<Integer>> expected = asList(
                asList(3),
                asList(20, 9),
                asList(15, 7)
        );

        assertEquals(expected, actual);
    }

}