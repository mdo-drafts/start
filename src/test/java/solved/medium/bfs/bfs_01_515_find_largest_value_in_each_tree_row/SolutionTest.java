package solved.medium.bfs.bfs_01_515_find_largest_value_in_each_tree_row;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

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

        List<Integer> actual = sut.largestValues(node11);

        List<Integer> expected = Arrays.asList(1,3,9);

        assertEquals(expected, actual);
    }

}