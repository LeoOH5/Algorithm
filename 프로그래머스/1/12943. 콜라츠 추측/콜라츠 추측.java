class Solution {
    public int solution(int num) {
        int answer = -1;
        int count = 0;
        long n = num;
        
        while(count < 500){
            if(n == 1){
                answer = count;
                break;
            }
            
            if(n % 2 == 0){
                n /= 2;
            } else {
                n = (n * 3) + 1;
            }
            
            count++;
        }
        return answer;
    }
}