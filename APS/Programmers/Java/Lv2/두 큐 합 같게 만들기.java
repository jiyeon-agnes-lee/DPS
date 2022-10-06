import java.util.Queue;
import java.util.LinkedList;
class Solution {
    public int solution(int[] queue1, int[] queue2) {
        int answer = 0;
        long q1Total = 0;
        long q2Total = 0;
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        int len = queue1.length;
        for(int i = 0 ; i < len; i++) {
            q1.offer(queue1[i]);
            q1Total += queue1[i];
            q2.offer(queue2[i]);
            q2Total += queue2[i];
        }
        if(q1Total == q2Total)
            return 0;
        while(q1Total != q2Total) {
            answer++;
            if(q1Total > q2Total){
                int val = q1.poll();
                q1Total -= val;
                q2Total += val;
                q2.offer(val);
            }else {
                int val = q2.poll();
                q1Total += val;
                q2Total -= val;
                q1.offer(val);
            }
            if(answer > (len * 4)) return -1;
        }
        return answer;
    }
}
