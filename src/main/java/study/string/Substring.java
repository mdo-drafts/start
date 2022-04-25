package study.string;

public class Substring {
    public static void main(String[] args) {
        String str = "abcdefgh";
        int start = 0;
        int end = 4;

        //abcd
        System.out.println(str.substring(start, end));

        //abcdefg
        System.out.println(str.substring(start, str.length()-1));

        //abcdefgh
        System.out.println(str.substring(start, str.length()));


    }
}
