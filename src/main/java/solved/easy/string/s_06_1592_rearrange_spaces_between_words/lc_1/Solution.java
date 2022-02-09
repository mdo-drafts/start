package solved.easy.string.s_06_1592_rearrange_spaces_between_words.lc_1;

public class Solution {

    public String reorderSpaces(String text) {
        // var words = text.trim().split("\\s+");
        String[] words = text.trim().split("\\s+");
        int cnt = words.length;
        // int spaces = text.chars().map(c -> c == ' ' ? 1 : 0).sum();
        int spaces = (int)text.chars().filter(c -> c == ' ').count(); // Credit to @climberig
        int gap = cnt <= 1 ? 0 : spaces / (cnt - 1);
        // int trailingSpaces = gap == 0 ? spaces : spaces % (cnt - 1);
        int trailingSpaces = spaces - gap * (cnt - 1); // credit to @madno
        return String.join(" ".repeat(gap), words) + " ".repeat(trailingSpaces);
    }
}
