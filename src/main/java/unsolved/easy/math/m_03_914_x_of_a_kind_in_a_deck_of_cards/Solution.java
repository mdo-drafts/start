package unsolved.easy.math.m_03_914_x_of_a_kind_in_a_deck_of_cards;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public boolean hasGroupsSizeX(int[] deck) {
        if (deck.length < 2) {
            return false;
        }
        Map<Integer, Integer> cardCount = new HashMap();

        for (int i : deck) {
            cardCount.put(i, cardCount.getOrDefault(i, 0) + 1);
        }

        int range = cardCount.get(deck[0]);

        for (int count : cardCount.values()) {
            if (range % 2 != 0 || count % 2 != 0) {
                if (count != range) {
                    int tail = range > count ? range % count : count % range;
                    if (tail != 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}


   /* if (count % 2 != 0) {
                    return false;
                }
                if (range % 2 == 1) {
                    return false;
                }*/