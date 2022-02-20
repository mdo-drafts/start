package solved.easy.array.a_12_941_valid_mountain_array;

public class Solution {
    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3) {
            return false;
        }
        int i = 0;
        while (i < arr.length - 1 && arr[i] < arr[i + 1]) {
            i++;
        }
        if (i == 0 || i == arr.length - 1) return false;
        int j = arr.length - 1;
        while (0 <= j && arr[j - 1] > arr[j]) {
            j--;
        }
        return i == j;
    }
}
