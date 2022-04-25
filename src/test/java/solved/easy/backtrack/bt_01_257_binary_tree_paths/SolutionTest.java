package solved.easy.backtrack.bt_01_257_binary_tree_paths;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1(){
        TreeNode node5 = new TreeNode(5);
        TreeNode node2 = new TreeNode(2, null , node5);
        TreeNode node3 = new TreeNode(3);
        TreeNode node1 = new TreeNode(1, node2, node3);

        List<String> actual = sut.binaryTreePaths(node1);
        List<String> expected = Arrays.asList("1->2->5", "1->3");
        assertEquals(expected, actual);
    }

    @Test
    public void test_2(){

        TreeNode node1 = new TreeNode(1);

        List<String> actual = sut.binaryTreePaths(node1);
        List<String> expected = Arrays.asList("1");
        assertEquals(expected, actual);
    }

}