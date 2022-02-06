package solved.easy.math.m_05_836_rectangle_overlap;

import org.junit.Test;
import unsolved.easy.math.m_01_836_rectangle_overlap.Solution;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1(){
        int[] rec1 = {0,0,2,2};
        int[] rec2 = {1,1,3,3};

        assertTrue(sut.isRectangleOverlap(rec1, rec2));
    }

    @Test
    public void test_2(){
        int[] rec1 = {0,0,1,1};
        int[] rec2 = {1,0,2,1};

        assertFalse(sut.isRectangleOverlap(rec1, rec2));
    }

    @Test
    public void test_3(){
        int[] rec1 = {0,0,1,1};
        int[] rec2 = {2,2,3,3};

        assertFalse(sut.isRectangleOverlap(rec1, rec2));
    }
}