import java.util.ArrayList;
class Solution {
    public int[] solution(int[] answers) {
        int[][] ans = {{1,2,3,4,5}, {2,1,2,3,2,4,2,5},{3,3,1,1,2,2,4,4,5,5}} ;
        int[] idx = new int[3];
        int[] cnt = new int[3];
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < answers.length; j++) {
                if(idx[i] == ans[i].length)
                    idx[i] = 0;
                if(ans[i][idx[i]] == answers[j])
                    cnt[i]++;
                idx[i]++;                 
            }  
        }
        int maxCnt = 0;
        for(int i = 0 ; i < 3; i++) {
            if(maxCnt < cnt[i])
                maxCnt = cnt[i];
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < 3; i++) {
            if(maxCnt == cnt[i])
                list.add(i+1);
        }
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++)
            answer[i] = list.get(i);
        return answer;
    }
}
