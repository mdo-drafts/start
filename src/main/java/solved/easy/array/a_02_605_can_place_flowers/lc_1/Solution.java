package solved.easy.array.a_02_605_can_place_flowers.lc_1;

public class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) return true;
        for (int i = 0; i < flowerbed.length; i ++) {
            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) { // can place?
                -- n;
                if (n == 0) return true;
                flowerbed[i] = 1; // place!
            }
        }
        return false;
    }
}
