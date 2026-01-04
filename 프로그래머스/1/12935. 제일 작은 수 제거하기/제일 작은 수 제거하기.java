import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length - 1];
    
        int min = arr[0];
        int index = 0;
        int count = 0;
        
        if (arr.length == 1) {
            return new int[]{-1};
        }

        
        for(int i=1; i<arr.length ;i++){
            if(arr[i] < min){
                min = arr[i];
                index = i;
            }
        }
        
        for(int i=0; i<arr.length;i++){
            if(index == i)
                continue;
            answer[count] = arr[i];
            count++;
        }
        
        return answer;
    }
}