import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String num = String.valueOf(n);
        for(char c : num.toCharArray()){
            int temp = c - '0';
            answer += temp;
        }
        
        return answer;
    }
}