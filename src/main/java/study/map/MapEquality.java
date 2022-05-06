package study.map;

import java.util.*;

public class MapEquality {

    public static void main(String[] args) {
        Map<Character, Integer> map1 = new HashMap<>();
        map1.put('a', 1);
        map1.put('b', 2);
        map1.put('c', 3);

        Map<Character, Integer> map2 = new HashMap<>();
        map2.put('c', 3);
        map2.put('b', 2);
        map2.put('a', 1);

        System.out.println(map1.equals(map2));

    }
}
