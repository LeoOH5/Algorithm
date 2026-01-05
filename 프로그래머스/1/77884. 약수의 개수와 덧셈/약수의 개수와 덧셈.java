class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        int count = 0;
        
        for(int j=0 ; left+j <= right ; j++) {
            for(int i = 1 ; i*i <= left+j; i++) {
                if((left+j)%i==0) {
                    if((left+j)/i == i)
                        count++;
                    else
                        count += 2;
                }
            }
            if(count%2 == 0)
                answer += (left+j);   
            else
                answer -= (left+j);
            count = 0;
        }
        
        return answer;
    }
}