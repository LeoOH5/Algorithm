import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        String stringNum = Long.toString(n);
        
        String[] temp = stringNum.split("");
        
        Arrays.sort(temp, Collections.reverseOrder());

        String joined = String.join("", temp);

        return Long.parseLong(joined);

    }
}