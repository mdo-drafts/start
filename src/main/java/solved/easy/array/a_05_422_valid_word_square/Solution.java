package solved.easy.array.a_05_422_valid_word_square;

import java.util.List;

public class Solution {
    public boolean validWordSquare(List<String> words) {

        for (int i = 0; i < words.size(); i++) {
            char[] curr = words.get(i).toCharArray();
            for (int j = 0; j < curr.length; j++) {
                if (j >= words.size()) {
                    return false;
                }
                char currChar = curr[j];
                String currWord = words.get(j);
                if (i >= currWord.length()) {
                    return false;
                }
                char toCompare = currWord.toCharArray()[i];
                if (currChar != toCompare) {
                    return false;
                }
            }
        }
        return true;
    }
}


/*
   char[][] square = new char[words.size()][];

        for (int i = 0; i < words.size(); i++) {
            square[i] = words.get(i).toCharArray();
        }

        for (int i = 0; ) {

        }
 */