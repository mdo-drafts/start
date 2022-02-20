package study.array;

public class IndexComparison {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int i = 0;

        //ArrayIndexOutOfBoundsException - both clauses checked
        if (i - 1 != 0 && arr[i - 1] == 1) {
            System.out.println("here");
        }
    }
}
