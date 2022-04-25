package solved.medium.backtrack.bt_02_1079_letter_tile_possibilities;

import org.junit.Test;
import unsolved.medium.backtrack.bt_02_1079_letter_tile_possibilities.Solution;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1(){

        String tiles = "AAB";
        int actual = sut.numTilePossibilities(tiles);

        int expected =8;

        assertEquals(expected, actual);

    }

}