package solved.easy.array.a_01_283_move_zeroes;

import org.junit.Test;
import solved.easy.array.a_01_283_move_zeroes.lc_1.Solution;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1() {
        int[] actual = {0, 1, 0, 3, 12};

        sut.moveZeroes(actual);

        int[] expected = {1, 3, 12, 0, 0};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void test_2(){
        int[] actual = {0};

        sut.moveZeroes(actual);

        int[] expected = {0};

        assertArrayEquals(expected, actual);
    }


}