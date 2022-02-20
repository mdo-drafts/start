package solved.easy.array.a_11_832_flipping_an_image.lc_1;

public class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int length = image[0].length;
        for (int[] row: image)
            for (int i = 0; i < (length + 1) / 2; ++i) {
                int tmp = row[i] ^ 1;
                row[i] = row[length - 1 - i] ^ 1;
                row[length - 1 - i] = tmp;
            }
        return image;
    }
}
