package solved.easy.string.s_02_2042_check_if_numbers_are_ascending_in_a_sentence;

public class Solution {

    public boolean areNumbersAscending(String s) {
        int min = 0;

        for(String curr: s.split(" ")){
            if(curr.matches("-?\\d+(\\.\\d+)?")){
                int currInt = Integer.parseInt(curr);
                if(min < currInt){
                    min = currInt;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}
