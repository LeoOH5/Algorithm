class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int temp = 0;
        if(a>b){
            temp = a-b;
            for(int i = 0; i <= temp ; i++){
                answer += (b+i);                    
            }
        } else if(a==b){
            answer = 0;
        } else {
            temp = b-a;
            for(int i = 0; i <= temp ; i++){
                answer += (a+i);    
            }
        }

        return answer;
    }
}