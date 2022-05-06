package study.enc_dec;

public class Bytes {

    public static void main(String[] args) {
        String str = "abc";

        String result = intToString(str);

        System.out.println(result);
    }


    public static String intToString(String s) {
        int x = s.length();
        char[] bytes = new char[4];
        for (int i = 3; i > -1; --i) {
            bytes[3 - i] = (char) (x >> (i * 8) & 0xff);
        }
        return new String(bytes);
    }

    public static int stringToInt(String bytesStr) {
        int result = 0;
        for (char b : bytesStr.toCharArray())
            result = (result << 8) + (int) b;
        return result;
    }
}