package solved.easy.array.a_10_682_baseball_game;

import java.util.Stack;

public class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> score = new Stack<>();

        for (String item : ops) {
            if ("C".equals(item)) {
                score.pop();
            } else if ("D".equals(item)) {
                int r1 = score.peek();
                score.push(r1 * 2);
            } else if ("+".equals(item)) {
                int r1 = score.pop();
                int r2 = score.pop();
                int doubled = r1+r2;
                score.push(r2);
                score.push(r1);
                score.push(doubled);
            } else {
                score.push(Integer.parseInt(item));
            }
        }
        int result = 0;
        while (!score.empty()) {
            result += score.pop();
        }

        return result;
    }
}
