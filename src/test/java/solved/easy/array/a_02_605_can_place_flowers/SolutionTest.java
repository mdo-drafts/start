package solved.easy.array.a_02_605_can_place_flowers;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1() {
        int[] flowerbed = {1, 0, 0, 0, 1};
        int n = 1;
        assertTrue(sut.canPlaceFlowers(flowerbed, n));
    }

    @Test
    public void test_2() {
        int[] flowerbed = {1, 0, 0, 0, 1};
        int n = 2;
        assertFalse(sut.canPlaceFlowers(flowerbed, n));
    }

    @Test
    public void test_3() {
        int[] flowerbed = {1, 0, 0, 0, 0, 1};
        int n = 2;
        assertFalse(sut.canPlaceFlowers(flowerbed, n));
    }

    @Test
    public void test_4() {
        int[] flowerbed = {0};
        int n = 1;
        assertTrue(sut.canPlaceFlowers(flowerbed, n));
    }

    @Test
    public void test_5() {
        int[] flowerbed = {1};
        int n = 1;
        assertFalse(sut.canPlaceFlowers(flowerbed, n));
    }

    @Test
    public void test_6() {
        int[] flowerbed = {1, 0, 0, 0, 1, 0, 0};
        int n = 2;
        assertTrue(sut.canPlaceFlowers(flowerbed, n));
    }

    @Test
    public void test_7() {
        int[] flowerbed = {0, 0, 1, 0, 0, 0, 1};
        int n = 2;
        assertTrue(sut.canPlaceFlowers(flowerbed, n));
    }

    @Test
    public void test_8() {
        int[] flowerbed = {1};
        int n = 0;
        assertTrue(sut.canPlaceFlowers(flowerbed, n));
    }

    @Test
    public void test_9() {
        int[] flowerbed = {0,0,1,0,0};
        int n = 1;
        assertTrue(sut.canPlaceFlowers(flowerbed, n));
    }
}
