import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int a : arr) {
            if (a % divisor == 0)
                list.add(a);
        }
        
        list.sort(null);
        if(list.isEmpty()){
            list.add(-1);
        }
        answer = list.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}