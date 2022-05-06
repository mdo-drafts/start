package study.union_find.uf_10_323_number_of_connected_components;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1(){
        int n = 4;
        int[][] edges = {{0,1},{2,3},{1,2}};

        int actual = sut.countComponents(n, edges);
        int expected = 1;
        assertEquals(expected, actual);
    }


    @Test
    public void test_2(){
        int n = 5;
        int[][] edges = {{0,1},{1,2},{3,4}};

        int actual = sut.countComponents(n, edges);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void test_3(){
        int n = 10;
        int[][] edges = {{5,6},{0,2},{1,7},{5,9},{1,8},{3,4},{0,6},{0,7},{0,3},{8,9}};

        int actual = sut.countComponents(n, edges);
        int expected = 1;
        assertEquals(expected, actual);
    }
}