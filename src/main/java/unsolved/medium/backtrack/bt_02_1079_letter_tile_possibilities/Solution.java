package unsolved.medium.backtrack.bt_02_1079_letter_tile_possibilities;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    Set<String> result = new HashSet<>();

    public int numTilePossibilities(String tiles) {
        StringBuilder sb = new StringBuilder();
        backtrack(tiles, sb);
        return result.size();
    }

    private void backtrack(String tiles, StringBuilder curr) {
        if(curr.length() == tiles.length()){
            return;
        }
        for (int i = 0; i < tiles.length(); i++) {
            curr.append(tiles.charAt(i));
            result.add(curr.toString());
            backtrack(tiles, curr);
            curr.deleteCharAt(curr.length() - 1);
        }
    }
}
