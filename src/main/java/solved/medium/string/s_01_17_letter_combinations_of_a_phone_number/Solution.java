package solved.medium.string.s_01_17_letter_combinations_of_a_phone_number;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static java.util.Map.entry;

public class Solution {
    Map<Character, List<String>> numMap = Map.ofEntries(
            entry('2', List.of("a", "b", "c")),
            entry('3', List.of("d", "e", "f")),
            entry('4', List.of("g", "h", "i")),
            entry('5', List.of("j", "k", "l")),
            entry('6', List.of("m", "n", "o")),
            entry('7', List.of("p", "q", "r", "s")),
            entry('8', List.of("t", "u", "v")),
            entry('9', List.of("w", "x", "y", "z"))
    );

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.equals("") || (digits.length() == 1 && digits.charAt(0) == '1')) {
            return result;
        }

        List<String> tmp = new ArrayList<>();
        for (int i = digits.length() - 1; 0 <= i; i--) {
            char currKey = digits.charAt(i);
            if (currKey == '1') continue;
            //a,b,c
            List<String> currSet = numMap.get(currKey);
            if(result.isEmpty()){
                result.addAll(currSet);
                continue;
            }
            for (String currDigit : currSet) {
                for (String item : result) {
                    tmp.add(currDigit + item);
                }
            }
            result = tmp;
            tmp = new ArrayList<>();
        }
        return result;
    }
}
