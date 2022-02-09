package solved.easy.string.s_06_1592_rearrange_spaces_between_words;

public class Solution {
    public String reorderSpaces(String text) {

        int spaceCount = 0;
        for (char c : text.toCharArray()) {
            if (c == ' ') {
                spaceCount++;
            }
        }
        String[] strArr = text.trim().split("\\s+");
        if(strArr.length ==1){
            return strArr[0] + " ".repeat(spaceCount);
        }
        int numOfSpaces = spaceCount / (strArr.length - 1);
        int spacesLeft = spaceCount % (strArr.length - 1);
        if (numOfSpaces < 1) {
            return text;
        }

        String separator = " ".repeat(numOfSpaces);

        String result = String.join(separator, strArr);

        if (spacesLeft > 0) {
            result = result + " ".repeat(spacesLeft);
        }

        return result;
    }

}
