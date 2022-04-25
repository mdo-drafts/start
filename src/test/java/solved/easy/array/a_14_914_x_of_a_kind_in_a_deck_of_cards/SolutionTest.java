package solved.easy.array.a_14_914_x_of_a_kind_in_a_deck_of_cards;

import org.junit.Test;
import unsolved.easy.math.m_03_914_x_of_a_kind_in_a_deck_of_cards.lc_1.Solution;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1() {
        int[] input = {1, 2, 3, 4, 4, 3, 2, 1};

        assertTrue(sut.hasGroupsSizeX(input));
    }

    @Test
    public void test_2() {
        int[] input = {1, 1, 1, 2, 2, 2, 3, 3};

        assertFalse(sut.hasGroupsSizeX(input));
    }

    @Test
    public void test_3() {
        int[] input = {0, 0, 0, 1, 1, 1, 2, 2, 2};

        assertTrue(sut.hasGroupsSizeX(input));
    }

    @Test
    public void test_4() {
        int[] input = {1, 1, 2, 2, 2, 2};

        assertTrue(sut.hasGroupsSizeX(input));
    }

    @Test
    public void test_5() {
        int[] input = {1, 1, 2, 2, 3, 3, 3};

        assertFalse(sut.hasGroupsSizeX(input));
    }

    @Test
    public void test_6() {
        int[] input = {1};

        assertFalse(sut.hasGroupsSizeX(input));
    }

    @Test
    public void test_7() {
        int[] input = {0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 3, 3, 3};

        assertTrue(sut.hasGroupsSizeX(input));
    }

    @Test
    public void test_8() {
        int[] input = {1, 1, 1, 1, 2, 2, 2, 2, 2, 2};

        assertTrue(sut.hasGroupsSizeX(input));
    }

    @Test
    public void test_9() {
        int[] input = {0, 0, 1, 1, 1, 1, 2, 2, 3, 4};

        assertFalse(sut.hasGroupsSizeX(input));
    }

    @Test
    public void test_10() {
        int[] input = {0, 1, 2, 3};

        assertFalse(sut.hasGroupsSizeX(input));
    }
}