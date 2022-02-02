package solved.easy.array.a_02_605_can_place_flowers.s_1;

public class Solution {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) {
            return true;
        }

        if (flowerbed.length == 1) {
            return flowerbed[0] == 0 && n == 1;
        }

        if (flowerbed[0] == 0 && flowerbed[1] == 0) {
            flowerbed[0] = 1;
            n--;
            if (n == 0) return true;
        }
        if (flowerbed[flowerbed.length - 1] == 0 && flowerbed[flowerbed.length - 2] == 0) {
            flowerbed[flowerbed.length - 1] = 1;
            n--;
            if (n == 0) return true;
        }

        int i = 1;
        while (i < flowerbed.length - 2 && 0 < n) {
            if (flowerbed[i - 1] == 0 && flowerbed[i] == 0 && flowerbed[i + 1] == 0) {
                n--;
                i += 1;
            }
            i++;
        }
        return n == 0;
    }
}
