package solved.easy.array.a_04_1512_number_of_good_pairs;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    Solution sut = new Solution();

    @Test
    public void test_1(){
        int[] input = {1,2,3,1,1,3};
        int expected = 4;
        int actual = sut.numIdenticalPairs(input);

        assertEquals(expected, actual);
    }

    @Test
    public void test_2(){
        int[] input = {1,1,1,1};
        int expected = 6;
        int actual = sut.numIdenticalPairs(input);

        assertEquals(expected, actual);
    }

    @Test
    public void test_3(){
        int[] input = {1,2,3};
        int expected = 0;
        int actual = sut.numIdenticalPairs(input);

        assertEquals(expected, actual);
    }
}