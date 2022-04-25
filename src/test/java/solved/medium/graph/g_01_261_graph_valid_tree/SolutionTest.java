package solved.medium.graph.g_01_261_graph_valid_tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1(){
        int n = 5;
        int[][] edges ={{0,1},{0,2},{0,3},{1,4}};

        assertTrue(sut.validTree(n, edges));
    }

    @Test
    public void test_2(){
        int n = 5;
        int[][] edges = {{0,1},{1,2},{2,3},{1,3},{1,4}};

        assertFalse(sut.validTree(n, edges));
    }

    @Test
    public void test_3(){
        int n = 5;
        int[][] edges = {{0,1},{1,2},{3,4}};

        assertFalse(sut.validTree(n, edges));
    }

    @Test
    public void test_4(){
        int n = 4;
        int[][] edges = {{0,1},{2,3},{1,2}};

        assertTrue(sut.validTree(n, edges));
    }
}