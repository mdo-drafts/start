package study.matrix;

public class PrintAllDiagonales {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int i;
        int j;
        for (int k = (-matrix.length) + 1; k < matrix.length; k++) {
            if (0 < k) {
                j = k;
            } else {
                j = 0;
            }
            if (k <= 0) {
                i = Math.abs(k);
            } else {
                i = 0;
            }

            while (i < matrix.length && j < matrix.length) {
                System.out.print(matrix[i][j] + " ");
                i++;
                j++;
            }
            System.out.println();
        }
    }
}
