class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {1, 1};
        int cnt = 0;
        int zero_cnt = 0;
        for(int i = 0; i < 6; i++) {
            if(lottos[i] == 0)
                zero_cnt++;
            else { 
                for(int j = 0; j < 6; j++) {
                    if(lottos[i] == win_nums[j]){
                        cnt++;
                        break;
                    }    
                }
            }
        }
        if(zero_cnt == 0 && cnt == 6)
            return answer;
        else if(zero_cnt == 0 && cnt == 0){
            answer[0] = 6;
            answer[1] = 6;
            return answer;
        }      
        else if(zero_cnt == 6) {
            answer[1] = 6;
            return answer;
        }else {
            answer[0] = 7 - (zero_cnt + cnt);
            answer[1] = 7 - cnt;
        }
        return answer;
    }
}
