package study.array;

public class BreakLoop {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        //out: 1, 2, 3, 4, 5
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i);
            if (i == 5) {
                break;
            }
        }


        for (int i = 0; i < 1; i++) {
            for(int j = i; j < arr.length; j++){
                if(j ==5){
                    break;
                }
            }
            System.out.println(i);
        }
    }
}
