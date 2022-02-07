package solved.easy.array.a_06_1002_find_common_characters;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> commonChars(String[] words) {
        List<String> result = new ArrayList<>();

        List<Character> contains = new ArrayList<>();

        List<Character> toCompare = new ArrayList<>();

        for (Character c : words[0].toCharArray()) {
            toCompare.add(c);
        }

        for (int i = 1; i < words.length; i++) {
            String curr = words[i];
            for (int j = 0; j < curr.length(); j++) {
                char currChar = curr.charAt(j);
                int index = toCompare.indexOf(currChar);
                if (index >= 0) {
                    contains.add(toCompare.remove(index));
                }
            }
            toCompare = contains;
            contains = new ArrayList<>();
        }

        for(Character c : toCompare){
            result.add(String.valueOf(c));
        }
        return result;
    }
}
