package solved.medium.math.m_01_50_Pow;

public class Solution {
    public double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        double result = calcPow(x, Math.abs(n));
        return n < 0 ? 1 / result : result;
    }

    private double calcPow(double x, int n) {
        if (n == 1) {
            return x;
        }
        return x * calcPow(x, n - 1);
    }
}
