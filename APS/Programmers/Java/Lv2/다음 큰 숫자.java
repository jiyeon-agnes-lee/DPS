class Solution {
    public int solution(int n) {
        int answer = n+1;
        char[] binaryN = Integer.toBinaryString(n).toCharArray();
        int cntN = 0;
        for(char c : binaryN){
            if(c == '1')
                cntN++;
        }
        
        while(true){
            int cntNext = 0;
            char[] binaryNext = Integer.toBinaryString(answer).toCharArray();
            for(char c : binaryNext){
                if(c == '1')
                    cntNext++;
            }
            if(cntNext == cntN)
                break;
            else answer++;
        }
        return answer;
    }
}
