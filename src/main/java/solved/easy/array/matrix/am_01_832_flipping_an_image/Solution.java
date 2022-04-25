package solved.easy.array.matrix.am_01_832_flipping_an_image;

public class Solution {
    public int[][] flipAndInvertImage(int[][] image) {

        int tmp;

        for (int k = 0; k < image.length; k++) {
            int i = 0;
            int j = image[k].length - 1;
            while (i < j) {
                tmp = image[k][i] == 0 ? 1 : 0;
                image[k][i] = image[k][j] == 0 ? 1 : 0;
                image[k][j] = tmp;
                i++;
                j--;
            }
            if (image[k].length % 2 != 0 && 1 < image[k].length) {
                int middle = image[k].length / 2;
                image[k][middle] = image[k][middle] == 0 ? 1 : 0;
            }
            if(image[k].length == 1){
                image[k][0] = image[k][0] == 0 ? 1 : 0;
            }
        }
        return image;
    }
}
