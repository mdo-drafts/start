package solved.medium.dynamic.dp_02_55_jump_game;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1(){
        int[] input = {2,3,1,1,4};

        assertTrue(sut.canJump(input));
    }

    @Test
    public void test_2(){
        int[] input = {3,2,1,0,4};

        assertFalse(sut.canJump(input));
    }
}