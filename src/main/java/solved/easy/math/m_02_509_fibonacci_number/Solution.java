package solved.easy.math.m_02_509_fibonacci_number;

public class Solution {
    public int fib(int n) {
        if (n == 0) {
            return 0;
        }
        int curr = 1;
        int next = 1;

        int count = 1;

        while (count != n) {
            int tmp = next;
            next = curr + next;
            curr = tmp;
            count++;
        }
        return curr;
    }
}
