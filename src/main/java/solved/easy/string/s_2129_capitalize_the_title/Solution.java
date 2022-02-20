package solved.easy.string.s_2129_capitalize_the_title;

public class Solution {
    public String capitalizeTitle(String title) {
        String[] strArr = title.split(" ");

        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].length() < 3) {
                strArr[i] = strArr[i].toLowerCase();
            } else {
                strArr[i] = strArr[i].substring(0, 1).toUpperCase() + strArr[i].substring(1).toLowerCase();
            }
        }
        return String.join(" ", strArr);
    }
}
