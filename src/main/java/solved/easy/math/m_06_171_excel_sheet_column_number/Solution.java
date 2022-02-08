package solved.easy.math.m_06_171_excel_sheet_column_number;

public class Solution {

    public int titleToNumber(String columnTitle) {

        int m = 0;
        int sum = 0;
        for (int i = columnTitle.length() - 1; 0 <= i; i--) {
            int c = columnTitle.charAt(i);
            double res = (c - 64) * Math.pow(26, m);
            sum += res;
            m++;
        }
        return sum;
    }
}
