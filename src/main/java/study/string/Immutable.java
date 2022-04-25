package study.string;

public class Immutable {

    public static void main(String[] args) {
        String str1 ="a";
        String str2 = new String(str1);
        String str3 = str1;

        System.out.println(str1 == str2);
        System.out.println(str1 == str3);

    }
}
