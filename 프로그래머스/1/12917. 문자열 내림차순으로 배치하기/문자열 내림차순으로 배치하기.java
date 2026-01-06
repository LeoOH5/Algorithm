import java.util.Arrays;

class Solution {
    public String solution(String s) {
        
        char[] temp = s.toCharArray();
        Arrays.sort(temp);
        StringBuilder sb = new StringBuilder(new String(temp));
        String answer = sb.reverse().toString();
        
        return answer;
    }
}